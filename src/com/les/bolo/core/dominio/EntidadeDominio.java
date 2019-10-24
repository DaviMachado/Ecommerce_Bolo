package com.les.bolo.core.dominio;

/**
 * Classe entidade dominio
 * @author Davi Rodrigues
 * @date 23/10/2019
 */
public class EntidadeDominio implements IEntidade {
	private int id;
	private String dt_cadastro;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDt_cadastro() {
		return dt_cadastro;
	}
	public void setDt_cadastro(String dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}
}
