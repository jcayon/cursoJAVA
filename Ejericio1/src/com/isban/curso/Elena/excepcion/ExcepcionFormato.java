package com.isban.curso.Elena.excepcion;

public class ExcepcionFormato extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3301282505888356556L;

	public ExcepcionFormato (String  Mensaje) {
		super(Mensaje);
		
	}
}

// maneras de tratar las excepciones:
// try / catch 
//try /catch / finally
//trow 