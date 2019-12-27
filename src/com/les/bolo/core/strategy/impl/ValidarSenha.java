package com.les.bolo.core.strategy.impl;

import com.les.bolo.core.dominio.Cliente;
import com.les.bolo.core.dominio.EntidadeDominio;
import com.les.bolo.core.dominio.Usuario;
import com.les.bolo.core.strategy.IStrategy;

/**
 * Classe para validar a senha do cliente
 * @author Davi Rodrigues
 * @date 23/10/2019
 */
public class ValidarSenha implements IStrategy {

	@Override
	public String validar(EntidadeDominio entidade, String msg) {
		
		Cliente cliente = (Cliente) entidade;
		Usuario usuario = cliente.getUsuario();
		
		if(usuario.getSenha() == null || usuario.getSenha().equals("")) {
			return (msg + "- Favor insira uma senha. \n");
		}
		else {
			return msg;
		}
	}
	
}
