package com.les.bolo.view.command.impl;

import com.les.bolo.core.dominio.EntidadeDominio;
import com.les.bolo.core.dominio.Resultado;

/**
 * Classe AlterarCommand
 * @author Davi Rodrigues
 * @date 23/10/2019
 */
public class AlterarCommand extends AbstractCommand {

	@Override
	public Resultado execute(EntidadeDominio entidade) {
		return fachada.alterar(entidade);
	}

}
