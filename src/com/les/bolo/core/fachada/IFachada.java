package com.les.bolo.core.fachada;

import com.les.bolo.core.dominio.EntidadeDominio;
import com.les.bolo.core.dominio.Resultado;

/**
 * Interface IFachada
 * @author Davi Rodrigues
 * @date 23/10/2019
 */
public interface IFachada {
	
	public Resultado salvar(EntidadeDominio entidade);
    public Resultado alterar(EntidadeDominio entidade);
    public Resultado excluir(EntidadeDominio entidade);
    public Resultado consultar(EntidadeDominio entidade);
	
}
