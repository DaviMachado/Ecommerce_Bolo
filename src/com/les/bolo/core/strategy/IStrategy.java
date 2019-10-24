package com.les.bolo.core.strategy;

import com.les.bolo.core.dominio.EntidadeDominio;

/**
 * Interface IStrategy
 * @author Davi Rodrigues
 * @date 23/10/2019
 */
public interface IStrategy {
	
	public String validar (EntidadeDominio entidade);
	
}
