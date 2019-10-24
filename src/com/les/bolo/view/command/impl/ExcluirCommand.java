package com.les.bolo.view.command.impl;

import com.les.bolo.core.dominio.EntidadeDominio;
import com.les.bolo.core.dominio.Resultado;

/**
 * Classe ExcluirCommand
 * @author Davi Rodrigues
 * @date 23/10/2019
 */
public class ExcluirCommand extends AbstractCommand {

	@Override
	public Resultado execute(EntidadeDominio entidade) {
		return fachada.excluir(entidade);
	}

}
