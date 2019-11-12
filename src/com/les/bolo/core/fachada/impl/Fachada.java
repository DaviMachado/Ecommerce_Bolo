package com.les.bolo.core.fachada.impl;

import java.util.ArrayList;
import java.util.List;

import com.les.bolo.core.dao.IDAO;
import com.les.bolo.core.dao.impl.ClienteDAO;
import com.les.bolo.core.dominio.EntidadeDominio;
import com.les.bolo.core.dominio.Resultado;
import com.les.bolo.core.fachada.IFachada;

/**
 * Classe Fachada
 * @author Davi Rodrigues
 * @date 23/10/2019
 */
public class Fachada implements IFachada {
	
	private Resultado resultado;
	private ClienteDAO dao;

	@Override
	public Resultado salvar(EntidadeDominio entidade) {
		resultado = new Resultado();
		dao = new ClienteDAO();
		
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
		
		return resultado;
	}

	@Override
	public Resultado alterar(EntidadeDominio entidade) {
		resultado = new Resultado();
		dao = new ClienteDAO();
		
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
		
		return resultado;
	}

	@Override
	public Resultado excluir(EntidadeDominio entidade) {
		resultado = new Resultado();
		dao = new ClienteDAO();
		
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
		
		return resultado;
	}

	@Override
	public Resultado consultar(EntidadeDominio entidade) {
		resultado = new Resultado();
		dao = new ClienteDAO();
		
		try {
			resultado.setEntidades(dao.consultar(entidade));
		} catch (Exception e) {
			e.printStackTrace();
            resultado.setMensagem("Não foi possível Consulta o registro!");
		}
		
		return resultado;
	}

}
