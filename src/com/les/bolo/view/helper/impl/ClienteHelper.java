package com.les.bolo.view.helper.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.les.bolo.core.dominio.Cliente;
import com.les.bolo.core.dominio.EntidadeDominio;
import com.les.bolo.core.dominio.Resultado;
import com.les.bolo.view.helper.IViewHelper;

public class ClienteHelper implements IViewHelper {
	
	Cliente cliente = null;

	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		
		// Verifica qual operação do botão foi acionada
		String operacao = request.getParameter("operacao");
		
        String login = null;
        String senha = null;
        String flgAtivo = null;
        String cdCliente = null;
        String nome = null;
        String cpf = null;
        String dtNasc = null;
		
		if (("CONSULTAR").equals(operacao)) {
			cliente = new Cliente();
		}
		
		else if (("SALVAR").equals(operacao)) {
			cliente = new Cliente();
			
			// Atributos da classe cliente
			login = request.getParameter("login");
			senha = request.getParameter("senha");
			flgAtivo = request.getParameter("flgAtivo");
			cdCliente = request.getParameter("cdCliente");
			
			// Atributos da classe pessoa
			nome = request.getParameter("nome");
			cpf = request.getParameter("cpf");
			dtNasc = request.getParameter("dtNasc");
			
			// Atribuindo os valores capturados do HTML para o cliente
			cliente.setLogin(login);
			cliente.setSenha(senha);
			cliente.setFlgAtivo(flgAtivo);
			cliente.setCdCliente(cdCliente);
			cliente.setNome(nome);
			cliente.setCpf(cpf);
			cliente.setDt_nasc(dtNasc);
		}
		
		else if (("ALTERAR").equals(operacao)) {
			cliente = new Cliente();
			
			// Atributos da classe cliente
			login = request.getParameter("login");
			senha = request.getParameter("senha");
			flgAtivo = request.getParameter("flgAtivo");
			cdCliente = request.getParameter("cdCliente");
			
			// Atributos da classe pessoa
			nome = request.getParameter("nome");
			cpf = request.getParameter("cpf");
			dtNasc = request.getParameter("dtNasc");
			
			// Atribuindo os valores capturados do HTML para o cliente
			cliente.setLogin(login);
			cliente.setSenha(senha);
			cliente.setFlgAtivo(flgAtivo);
			cliente.setCdCliente(cdCliente);
			cliente.setNome(nome);
			cliente.setCpf(cpf);
			cliente.setDt_nasc(dtNasc);
		}
		
		else if (("EXCLUIR").equals(operacao)) {
			cliente = new Cliente();
			
			cdCliente = request.getParameter("cdCliente");
			
			cliente.setCdCliente(cdCliente);
		}
		
		return cliente;
	}

	@Override
	public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// Verifica qual operação do botão foi acionada
		String operacao = request.getParameter("operacao");
		
		// Usa para escrever na tela
		PrintWriter writer = response.getWriter();
		
		
		if (("CONSULTAR").equals(operacao)) {
			try {
				// Redireciona para o arquivo .jsp
				request.getRequestDispatcher("JSP/lista-clientes-scriptlet.jsp").forward(request, response);
			} catch (Exception e) {
				System.out.println("ERRO!");
			}
		}
		
		else if (("SALVAR").equals(operacao)) {
			writer.println("<h1>Cadastro salvo com sucesso!</h1>");
			writer.println("<input type=\"button\" value=\"Voltar\" onclick=\"history.back()\">");
		}
		
		else if (("ALTERAR").equals(operacao)) {
			writer.println("<h1>Cadastro Alterado com sucesso!</h1>");
			writer.println("<input type=\"button\" value=\"Voltar\" onclick=\"history.back()\">");
		}
		
		else if (("EXCLUIR").equals(operacao)) {
			writer.println("<h1>Cadastro Removido com sucesso!</h1>");
			writer.println("<input type=\"button\" value=\"Voltar\" onclick=\"history.back()\">");
		}
	}

}
