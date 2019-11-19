package com.les.bolo.core.fachada.impl;

import java.util.ArrayList;
import java.util.List;

import com.les.bolo.core.dao.IDAO;
import com.les.bolo.core.dao.impl.ClienteDAO;
import com.les.bolo.core.dominio.EntidadeDominio;
import com.les.bolo.core.dominio.Resultado;
import com.les.bolo.core.fachada.IFachada;
import com.les.bolo.core.strategy.impl.ValidarSenha;

/**
 * Classe Fachada
 * @author Davi Rodrigues
 * @date 23/10/2019
 */
public class Fachada implements IFachada {
	
	private Resultado resultado;
	private ClienteDAO dao;
	
	/* ------------ Declaração dos Strategy ------------ */
	ValidarSenha vSenha = new ValidarSenha();
	
	/*---SALVAR---*/
	@Override
	public Resultado salvar(EntidadeDominio entidade) {
		resultado = new Resultado();
		dao = new ClienteDAO();
		
		String msg = executarRegras(entidade, "SALVAR");
		
		if (msg == null) {
			try {
				dao.salvar(entidade);
				
				// cria uma lista para mostrar os clientes salvos
				List<EntidadeDominio> entidades = new ArrayList<EntidadeDominio>();
	            entidades.add(entidade);
	            resultado.setEntidades(entidades);
			} catch (Exception e) {
				e.printStackTrace();
	            resultado.setMensagem("Não foi possível Salvar o registro!");
			}
		}
		else {
			resultado.setMensagem(msg);
		}
		return resultado;
	}
	
	/*---ALTERAR---*/
	@Override
	public Resultado alterar(EntidadeDominio entidade) {
		resultado = new Resultado();
		dao = new ClienteDAO();
		
		String msg = executarRegras(entidade, "ALTERAR");
		
		if (msg == null) {
			try {
				dao.alterar(entidade);
				
				// cria uma lista para mostrar os clientes alterados
				List<EntidadeDominio> entidades = new ArrayList<EntidadeDominio>();
	            entidades.add(entidade);
	            resultado.setEntidades(entidades);
			} catch (Exception e) {
				e.printStackTrace();
	            resultado.setMensagem("Não foi possível Alterar o registro!");
			}
		}
		else {
			resultado.setMensagem(msg);
		}
		return resultado;
	}
	
	/*---EXCLUIR---*/
	@Override
	public Resultado excluir(EntidadeDominio entidade) {
		resultado = new Resultado();
		dao = new ClienteDAO();
		
		String msg = executarRegras(entidade, "EXCLUIR");
		
		if (msg == null) {
			try {
				dao.excluir(entidade);
				
				// cria uma lista para mostrar os clientes excluidos
				List<EntidadeDominio> entidades = new ArrayList<EntidadeDominio>();
	            entidades.add(entidade);
	            resultado.setEntidades(entidades);
			} catch (Exception e) {
				e.printStackTrace();
	            resultado.setMensagem("Não foi possível Excluir o registro!");
			}
		}
		else {
			resultado.setMensagem(msg);
		}
		return resultado;
	}
	
	/*---CONSULTAR---*/
	@Override
	public Resultado consultar(EntidadeDominio entidade) {
		resultado = new Resultado();
		dao = new ClienteDAO();
		
		String msg = executarRegras(entidade, "CONSULTAR");
		
		if (msg == null) {
			try {
				resultado.setEntidades(dao.consultar(entidade));
			} catch (Exception e) {
				e.printStackTrace();
	            resultado.setMensagem("Não foi possível Consulta o registro!");
			}
		}
		else {
			resultado.setMensagem(msg);
		}
		return resultado;
	}
	
	
	// Método para executar as regras de negocio / Strategy
	private String executarRegras (EntidadeDominio entidade, String operacao) {
		String msg = null;
		
		if (("CONSULTAR").equals(operacao)) {
			return msg;
		}
		else if (("SALVAR").equals(operacao)) {
			msg = vSenha.validar(entidade);
			
			return msg;
		}
		else if (("ALTERAR").equals(operacao)) {
			return msg;
		}
		else if (("EXCLUIR").equals(operacao)) {
			return msg;
		}
		else {
			return msg;
		}
	}

}
