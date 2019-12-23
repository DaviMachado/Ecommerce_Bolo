package com.les.bolo.core.strategy.impl;

import com.les.bolo.core.dominio.Cliente;
import com.les.bolo.core.dominio.EntidadeDominio;
import com.les.bolo.core.strategy.IStrategy;

/**
 * Classe para validar o campo codigo do sistema do cliente
 * @author Davi Rodrigues
 * @date 27/11/2019
 */
public class ValidarCodigoClienteSys implements IStrategy {

	@Override
	public String validar(EntidadeDominio entidade, String msg) {
		Cliente cliente = (Cliente) entidade;
		
		if(cliente.getCdCliente() == null || cliente.getCdCliente().equals("")) {
			return (msg + "- Favor insira um codigo p/ o sistema. \n");
		}
		else {
			return msg;
		}
	}

}
