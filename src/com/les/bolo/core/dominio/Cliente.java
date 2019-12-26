package com.les.bolo.core.dominio;

/**
 * Classe para representar o Cliente
 * @author Davi Rodrigues
 * @date 23/10/2019
 */
public class Cliente extends Pessoa {
	private String cdCliente;
	private String flgAtivo;
	private String login;
	private String senha;
	
	
	public String getCdCliente() {
		return cdCliente;
	}
	public void setCdCliente(String cdCliente) {
		this.cdCliente = cdCliente;
	}
	public String getFlgAtivo() {
		return flgAtivo;
	}
	public void setFlgAtivo(String flgAtivo) {
		this.flgAtivo = flgAtivo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
