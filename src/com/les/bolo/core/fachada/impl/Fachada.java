package com.les.bolo.core.fachada.impl;

import com.les.bolo.core.dominio.EntidadeDominio;
import com.les.bolo.core.dominio.Resultado;
import com.les.bolo.core.fachada.IFachada;

/**
 * Classe Fachada
 * @author Davi Rodrigues
 * @date 23/10/2019
 */
public class Fachada implements IFachada {
	
	private Resultado resultado;
	

	@Override
	public Resultado salvar(EntidadeDominio entidade) {
		resultado = new Resultado();
		
		
		
		return resultado;
	}

	@Override
	public Resultado alterar(EntidadeDominio entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resultado excluir(EntidadeDominio entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resultado consultar(EntidadeDominio entidade) {
		// TODO Auto-generated method stub
		return null;
	}

}
