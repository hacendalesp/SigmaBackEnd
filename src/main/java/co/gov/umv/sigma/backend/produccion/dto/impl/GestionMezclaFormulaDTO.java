package co.gov.umv.sigma.backend.produccion.dto.impl;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoEntrada;
import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.produccion.cbo.ProduccionOE;
import co.gov.umv.sigma.backend.produccion.dao.impl.GestionMezclaFormulaDAO;

public class GestionMezclaFormulaDTO {

	GestionMezclaFormulaDAO modelo = new GestionMezclaFormulaDAO();
	
	public ObjetoSalida insertarMezclaFormula(ObjetoEntrada OE)
	{
		return modelo.insertarMezclaFormula(OE);
	}
	
	public ObjetoSalida actualizarMezclaFormula(ObjetoEntrada OE)
	{
		return modelo.actualizarMezclaFormula(OE);
	}
	
	public ObjetoSalida insertarMateriaPrima(ObjetoEntrada OE)
	{
		return modelo.insertarMateriaPrima(OE);
	}
	
	public ObjetoSalida actualizarMateriaPrima(ObjetoEntrada OE)
	{
		return modelo.actualizarMateriaPrima(OE);
	}

	public ObjetoSalida listarIdTipoMezcla(ProduccionOE OE) {
		return modelo.listarIdTipoMezcla(OE);
	}

	public ObjetoSalida listarIdTipoInsumo(ProduccionOE OE) {
		return modelo.listarIdTipoInsumo(OE);
	}
	
	
}
