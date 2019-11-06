<%@page import='com.les.bolo.core.dao.*'%>
<%@page import='com.les.bolo.core.dominio.*'%>
<%@page import='com.les.bolo.core.dao.impl.*'%>

<%@page import="java.util.List"%>

<html>
<head>
	<title></title>
</head>
<body>
	<table border="1">
		<tr>
            <th>Id</th>
            <th>Flg Ativo</th>
            <th>Login</th>
            <th>Senha</th>
            <th>Nome</th>
            <th>CPF</th>
            <th>Dt Nascimento</th>
            <th>Cd Cliente</th>
        </tr>
		<%
		ClienteDAO dao = new ClienteDAO();
		List<Cliente> clientes = dao.consultar(Cliente);
		
		for(Cliente cliente : clientes) {
		%>
			<tr>
				<td><%=cliente.getFlgAtivo() %></td>
				<td><%=cliente.getLogin() %></td>
				<td><%=cliente.getSenha() %></td>
				<td><%=cliente.getNome() %></td>
				<td><%=cliente.getCpf() %></td>
				<td><%=cliente.getDt_nasc() %></td>
				<td><%=cliente.getCdCliente() %></td>
				<td><a href="preAlterar_cliente.jsp?id=<%= cliente.getCdCliente()%>">Alterar</a></td>
                <td><a href="DeletarCliente?id=<%= cliente.getCdCliente()%>&acao=deletar">Deletar</a></td>
			</tr>
		<%
		}
		%>
	</table>
	 <input type="button" value="Retornar" onclick="history.back()">
</body>
</html>