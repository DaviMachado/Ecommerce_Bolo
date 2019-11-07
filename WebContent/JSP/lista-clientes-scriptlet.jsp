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
		Cliente c = new Cliente();
		
		List<EntidadeDominio> clientes = dao.consultar(c);
		
		for(EntidadeDominio e : clientes) {
		%>
			<tr>
				<td><%=c.getFlgAtivo() %></td>
				<td><%=c.getLogin() %></td>
				<td><%=c.getSenha() %></td>
				<td><%=c.getNome() %></td>
				<td><%=c.getCpf() %></td>
				<td><%=c.getDt_nasc() %></td>
				<td><%=c.getCdCliente() %></td>
				<td><a href="preAlterar_cliente.jsp?id=<%= c.getCdCliente()%>">Alterar</a></td>
                <td><a href="DeletarCliente?id=<%= c.getCdCliente()%>&acao=deletar">Deletar</a></td>
			</tr>
		<%
		}
		%>
	</table>
	 <input type="button" value="Retornar" onclick="history.back()">
</body>
</html>