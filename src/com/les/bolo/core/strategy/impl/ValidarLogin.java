package com.les.bolo.core.strategy.impl;

import com.les.bolo.core.dominio.Cliente;
import com.les.bolo.core.dominio.EntidadeDominio;
import com.les.bolo.core.strategy.IStrategy;

/**
 * Classe para validar o campo login do cliente
 * @author Davi Rodrigues
 * @date 27/11/2019
 */
public class ValidarLogin implements IStrategy {

	@Override
	public String validar(EntidadeDominio entidade, String msg) {
		Cliente cliente = (Cliente) entidade;
		
		if(cliente.getLogin() == null || cliente.getLogin().equals("")) {
			return (msg + "- Favor insira um login. \n");
		}
		else {
			return msg;
		}
	}

}
