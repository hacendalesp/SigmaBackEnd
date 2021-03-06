package co.gov.umv.sigma.backend.comun.dao;

public class SentenciaParametroDAO {

    private String nombre;
    private int numero;
    private Object valor;
    private SentenciaTipoParametroDAO tipoParametro;
    private int tipoDato;

    public SentenciaParametroDAO(String nombre, Object valor, SentenciaTipoParametroDAO tipoParametro, int tipoDato) {

        this.nombre = nombre;
        this.valor = valor;
        this.tipoParametro = tipoParametro;
        this.tipoDato = tipoDato;
    }
    
    public SentenciaParametroDAO(int numero, Object valor, SentenciaTipoParametroDAO tipoParametro, int tipoDato) {

        this.numero = numero;
        this.valor = valor;
        this.tipoParametro = tipoParametro;
        this.tipoDato = tipoDato;
    }

    
    public SentenciaTipoParametroDAO getTipoParametro() {

        return tipoParametro;
    }

    public void setTipoParametro(SentenciaTipoParametroDAO tipoParametro) {

        this.tipoParametro = tipoParametro;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public Object getValor() {

        return valor;
    }

    public void setValor(Object valor) {

        this.valor = valor;
    }

    public int getTipoDato() {

        return tipoDato;
    }

    public void setTipoDato(int tipoDato) {

        this.tipoDato = tipoDato;
    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
