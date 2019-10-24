package com.les.bolo.core.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.les.bolo.core.dominio.Cliente;
import com.les.bolo.core.dominio.EntidadeDominio;

import br.com.wi2.glpi.core.dominio.Contato;

public class ClienteDAO extends AbstractJdbcDAO {
	
	// Metodo para salvar o Cliente
	public void salvar(EntidadeDominio entidade) {
		openConnection();
		
		String sql = "insert into cliente "+
				"(login,senha,nome,cpf,dt_nasc,cd_cliente)" +
				"values (?,?,?,?,?,?)";
		
		try {
			Cliente cliente = (Cliente) entidade;
			
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			// seta os valores
			stmt.setString(1,cliente.getLogin());
			stmt.setString(2,cliente.getSenha());
			stmt.setString(3,cliente.getNome());
			stmt.setString(4,cliente.getCpf());
			stmt.setString(5,cliente.getDt_nasc());
			stmt.setString(6,cliente.getCdCliente());
			
			// executa
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
	// Metodo para Listar o Cliente
	public List<EntidadeDominio> consultar (EntidadeDominio entidade){
		openConnection();
		try {
			PreparedStatement stmt = connection.prepareStatement("select * from cliente");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				// criando o objeto Cliente
				Cliente cliente = new Cliente();
				
				cliente.setId(rs.getString("id"));
				cliente.setLogin(rs.getString("login"));
				cliente.setSenha(rs.getString("senha"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setDt_nasc(rs.getString("dtNasc"));
				cliente.setCdCliente(rs.getString("cdCliente"));
				
				// adicionando o objeto à lista
				cliente.add(contato);
			}
			rs.close();
			stmt.close();
			return contatos;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
	
}
