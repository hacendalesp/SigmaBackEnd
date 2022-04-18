package co.gov.umv.sigma.backend.produccion.dto.impl;

import co.gov.umv.sigma.backend.comun.cbo.FiltroAvanzado;
import co.gov.umv.sigma.backend.comun.cbo.ObjetoEntrada;
import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.mejoramiento.cbo.FiltroBusquedaEquipo;
import co.gov.umv.sigma.backend.produccion.cbo.ProduccionOE;
import co.gov.umv.sigma.backend.produccion.dao.impl.GestionMantenimientoEquipoDAO;
import co.gov.umv.sigma.backend.produccion.dao.impl.MantenimientoEquipoDAO;

public class MantenimientoEquipoDTO 
{
	MantenimientoEquipoDAO modelo = new MantenimientoEquipoDAO();
	GestionMantenimientoEquipoDAO gestion = new GestionMantenimientoEquipoDAO();
	
	
	public ObjetoSalida eliminar(ObjetoEntrada OE)
	{
		return modelo.eliminar(OE);
	}
	
	
	public ObjetoSalida consultarXFiltro(ObjetoEntrada OE) 
	{
		return modelo.consultarXFiltro(OE);
	}
	
	/***********************/

	public ObjetoSalida insertar(ObjetoEntrada OE)
	{
		return gestion.insertar(OE);
	}

	public ObjetoSalida consultarXFiltroFallo(ProduccionOE OE)
	{
		return gestion.consultarXFiltroFallo(OE);
	}
	
	
	
	public ObjetoSalida cancelarMantenimiento(ObjetoEntrada OE)
	{
		return gestion.cancelarMantenimiento(OE);
		
	}
	
	public ObjetoSalida listarEquiposVigentesAc(FiltroBusquedaEquipo OE)
	{
		
		return gestion.listarEquiposVigentesAc(OE);
	}
	
	public ObjetoSalida listarEquiposActivosParaMtto(FiltroBusquedaEquipo OE)
	{
		
		return gestion.listarEquiposActivosParaMtto(OE);
	}
	
	public ObjetoSalida actualizarFallo(ObjetoEntrada OE)
	{
		return gestion.actualizarFallo(OE);
		
	}
	
	public ObjetoSalida actualizarMtto(ObjetoEntrada OE)
	{
		return gestion.actualizarMtto(OE);
	}

	public ObjetoSalida reestablecerComoFallo(ProduccionOE OE) {
		return gestion.reestablecerComoFallo(OE);
	}

	 private java.sql.Date obtenerFecha(java.util.Date fecha){
	    	java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("America/Bogota"));		
	    	return (fecha == null) ? null : new java.sql.Date(fecha.getTime());
	    }
	 
	public ObjetoSalida consultarMantenimientosEquipos(ProduccionOE OE)
	{
		FiltroAvanzado filtro = new FiltroAvanzado();
		filtro.agregarFiltro("TIPO", ((ProduccionOE)OE).getMantenimiento().getTipo());
		filtro.agregarFiltro("ID_EQUIPO", ((ProduccionOE)OE).getMantenimiento().getIdEquipo());
		filtro.agregarFiltro("ID_TIPO_MANTENIMIENTO", ((ProduccionOE)OE).getMantenimiento().getIdTipoMantenimiento());
	//	filtro.agregarFiltro("FECHA",  obtenerFecha( ((ProduccionOE)OE).getMantenimiento().getFecha()));
		
		OE.setFiltro(filtro.obtenerComoFiltro());
		
		return gestion.consultarXFiltroMtto(OE);
	}

	public ObjetoSalida finalizarMantenimientoEquipo(ProduccionOE OE) {
		return gestion.finalizarMantenimientoEquipo(OE);
	}

	public ObjetoSalida programarMantenimiento(ProduccionOE OE) {
		return gestion.programarMantenimiento(OE);
	}

	public ObjetoSalida consultarXFiltroMtto(ProduccionOE OE)
	{
		return gestion.consultarXFiltroMtto(OE);
	}


	public ObjetoSalida reporteMantenimientoFallos(ProduccionOE OE)
	{
		return gestion.reporteMantenimientoFallos(OE);
	}
	
	
}