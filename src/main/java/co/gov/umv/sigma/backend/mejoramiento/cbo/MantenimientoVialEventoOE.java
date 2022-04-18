package co.gov.umv.sigma.backend.mejoramiento.cbo;

import java.util.ArrayList;
import java.util.List;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoEntrada;
import co.gov.umv.sigma.backend.comun.entidad.TabMantenimientoVialEvento;

public class MantenimientoVialEventoOE extends ObjetoEntrada {
	private TabMantenimientoVialEvento mantenimientoVialEvento;
	private List<TabMantenimientoVialEvento> mantenimientosVialesEventos = new ArrayList<TabMantenimientoVialEvento>(); 

	public TabMantenimientoVialEvento getMantenimientoVialEvento() {
		return mantenimientoVialEvento;
	}

	public void setMantenimientoVialEvento(TabMantenimientoVialEvento mantenimientoVialEvento) {
		this.mantenimientoVialEvento = mantenimientoVialEvento;
	}

	public List<TabMantenimientoVialEvento> getMantenimientosVialesEventos() {
		return mantenimientosVialesEventos;
	}

	public void setMantenimientosVialesEventos(List<TabMantenimientoVialEvento> mantenimientosVialesEventos) {
		this.mantenimientosVialesEventos = mantenimientosVialesEventos;
	}
	
	
}
