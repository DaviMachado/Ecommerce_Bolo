package com.les.bolo.core.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.les.bolo.core.dominio.Cliente;
import com.les.bolo.core.dominio.EntidadeDominio;

public class ClienteDAO extends AbstractJdbcDAO {
	
	/**
	 * Metodo para salvar o Cliente
	 * @param entidade
	 */
	public void salvar(EntidadeDominio entidade) {
		openConnection();
		
		String sql = "insert into cliente "+
				"(login,senha,nome,cpf,dt_nasc,cd_cliente,fl_ativo)" +
				"values (?,?,?,?,?,?,?)";
		
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
			stmt.setString(7, cliente.getFlgAtivo());
			
			// executa
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	} // Salvar
	
	
	/**
	 * Metodo para alterar o Cliente
	 * @param entidade
	 */
	public void alterar (EntidadeDominio entidade) {
		openConnection();
		
		String sql = "update cliente set login=?, senha=?, " +
					 "nome=?, cpf=?, dt_nasc=?, cd_cliente=?, fl_ativo=? where cd_cliente=?";
		
		try {
			Cliente cliente = (Cliente) entidade;
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, cliente.getLogin());
			stmt.setString(2, cliente.getSenha());
			stmt.setString(3, cliente.getNome());
			stmt.setString(4, cliente.getCpf());
			stmt.setString(5, cliente.getDt_nasc());
			stmt.setString(6, cliente.getCdCliente());
			stmt.setString(7, cliente.getFlgAtivo());
			stmt.setString(8, cliente.getCdCliente());
			
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	} // Alterar
	
	
	/**
	 * Metodo para Excluir o Cliente
	 * @param entidade
	 */
	public void excluir (EntidadeDominio entidade) {
		openConnection();
		
		try {
			Cliente cliente = (Cliente) entidade;
			
			PreparedStatement stmt = connection.prepareStatement("delete from cliente where cd_cliente=?");
			
			stmt.setString(1, cliente.getCdCliente());
			
			stmt.executeUpdate();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	} // Excluir
	
	
	/**
	 * Metodo para Listar o Cliente
	 * @param entidade
	 * @return
	 */
	public List<EntidadeDominio> consultar (EntidadeDominio entidade){
		openConnection();
		try {
			List<EntidadeDominio> clientes = new ArrayList<>();
			PreparedStatement stmt = connection.prepareStatement("select * from cliente");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				// criando o objeto Cliente
				Cliente cliente = new Cliente();
				
				cliente.setLogin(rs.getString("login"));
				cliente.setSenha(rs.getString("senha"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setDt_nasc(rs.getString("dtNasc"));
				cliente.setCdCliente(rs.getString("cdCliente"));
				cliente.setFlgAtivo(rs.getString("fl_ativo"));
				
				// adicionando o objeto à lista
				clientes.add(cliente);
			}
			rs.close();
			stmt.close();
			return clientes;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	} // Listar
	
}
