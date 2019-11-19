package com.les.bolo.core.strategy.impl;

import com.les.bolo.core.dominio.Cliente;
import com.les.bolo.core.dominio.EntidadeDominio;
import com.les.bolo.core.strategy.IStrategy;

/**
 * Classe para validar o flg de ativo do cliente
 * @author Davi Rodrigues
 * @date 19/11/2019
 */
public class ValidarFlgAtivo implements IStrategy {

	@Override
	public String validar(EntidadeDominio entidade) {
		Cliente cliente = (Cliente) entidade;
		
		if (cliente.getFlgAtivo() == null) {
			cliente.setFlgAtivo("0"); // para não deixar o campo nulo, passa zerado
		}
		
		return null;
	}

}
