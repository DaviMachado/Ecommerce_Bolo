package com.les.bolo.view.command.impl;

import com.les.bolo.core.fachada.IFachada;
import com.les.bolo.core.fachada.impl.Fachada;
import com.les.bolo.view.command.ICommand;

/**
 * Classe abstrata AbstractCommand,
 * para instanciar a Fachada.
 * @author Davi Rodrigues
 * @date 23/10/2019
 */
public abstract class AbstractCommand implements ICommand {
	
	protected IFachada fachada = new Fachada();
	
}
