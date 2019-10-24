package com.les.bolo.core.dominio;

/**
 * Classe para representar uma Pessoa
 * @author Davi Rodrigues
 * @date 23/10/2019
 */
public class Pessoa extends EntidadeDominio {
	private String nome;
	private String cpf;
	private String dt_nasc;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDt_nasc() {
		return dt_nasc;
	}
	public void setDt_nasc(String dt_nasc) {
		this.dt_nasc = dt_nasc;
	}
}
