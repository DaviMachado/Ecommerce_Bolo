package com.les.bolo.view.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.les.bolo.core.dao.impl.ClienteDAO;
import com.les.bolo.core.dominio.Cliente;

//Registrando uma Servlet sem a necessidade do arquivo "web.xml".
//Parâmetros: nome da Servlet e a URL que ela vai acessar.
@WebServlet(name="Cadastro Servlet", urlPatterns="/cadastroTeste")

/**
 * Servlet feita para testar o CRUD,
 * 
 * @author Davi Rodrigues
 * @date 31/10/2019
 */
public class CadastroServletTeste extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// vamos indicar que a nossa resposta será em HTML ao invés de texto
		resp.setContentType("text/html");
		
		// Usa para escrever na tela
		PrintWriter writer = resp.getWriter();
		
		// instanciando as classes
		Cliente cliente = new Cliente();
		ClienteDAO dao = new ClienteDAO();
		
		// Pegando as informações digitadas nos Forms do HTML
		cliente.setFlgAtivo(req.getParameter("flgAtivo"));
		cliente.setLogin(req.getParameter("login"));
		cliente.setSenha(req.getParameter("senha"));
		cliente.setNome(req.getParameter("nome"));
		cliente.setCpf(req.getParameter("cpf"));
		cliente.setDt_nasc(req.getParameter("dtNasc"));
		cliente.setCdCliente(req.getParameter("cdCliente"));
		
		// Verificando se os botões foram clicados na tela
		String operacao = (req.getParameter("operacao"));
		
		if (("SALVAR").equals(operacao)) {
			// Salva o que foi digitado na tela
			dao.salvar(cliente);
			
			writer.println("<h1>Cadastro salvo com sucesso!</h1>");
			
			// Mostra o que foi gravado
			writer.println("<ul>");
			writer.println("<li>Ativo: " + cliente.getFlgAtivo() + "</li>");
			writer.println("<li>Login: " + cliente.getLogin() + "</li>");
			writer.println("<li>Senha: " + cliente.getSenha() + "</li>");
			writer.println("<li>Nome: " + cliente.getNome() + "</li>");
			writer.println("<li>CPF: " + cliente.getCpf() + "</li>");
			writer.println("<li>Data Nascimento: " + cliente.getDt_nasc() + "</li>");
			writer.println("<li>Codigo Cliente: " + cliente.getCdCliente() + "</li>");
			writer.println("</ul>");
			
			writer.println("<input type=\"button\" value=\"Voltar\" onclick=\"history.back()\">");
		}

	}
}
