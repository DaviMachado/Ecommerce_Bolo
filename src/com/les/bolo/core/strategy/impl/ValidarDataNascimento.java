package com.les.bolo.core.strategy.impl;

import com.les.bolo.core.dominio.Cliente;
import com.les.bolo.core.dominio.EntidadeDominio;
import com.les.bolo.core.strategy.IStrategy;

/**
 * Classe para validar o campo data nascimento do cliente
 * @author Davi Rodrigues
 * @date 27/11/2019
 */
public class ValidarDataNascimento implements IStrategy {

	@Override
	public String validar(EntidadeDominio entidade, String msg) {
		Cliente cliente = (Cliente) entidade;
		
		if(cliente.getDt_nasc() == null || cliente.getDt_nasc().equals("")) {
			return (msg + "- Favor insira uma Data de Nascimento. \n");
		}
		else {
			return msg;
		}
	}

}
