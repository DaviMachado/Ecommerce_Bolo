package com.les.bolo.view.command;

import com.les.bolo.core.dominio.EntidadeDominio;
import com.les.bolo.core.dominio.Resultado;

/**
 * Interface ICommand
 * @author Davi Rodrigues
 * @date 23/10/2019
 */
public interface ICommand {
	
	public Resultado execute (EntidadeDominio entidade);
	
}
