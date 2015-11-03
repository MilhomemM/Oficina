<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<title>Oficina - Informe o Título da Página</title>
<!----------------------------- CODIGOS CSS ----------------------------->
<!-- <link rel="stylesheet" type="text/css" href="./CSS/ARQUIVO.css"/> -->
<link rel="stylesheet" type="text/css" href="./CSS/Modelo.css" />
<!-----------------------------   FIM CSS   ----------------------------->
<!----------------------------- CODIGOS JS ------------------------------>
<!--- <script type="text/javascript" src="./JS/ARQUIVO.js"></script> ---->
<script type="text/javascript" src="./JS/JavaScript.js"></script>
<script>
	function switchPlaceholder() {
		var TipoDePesquisa = document.getElementById("TipoDePesquisa");
		var CampoDePesquisa = document.getElementById("CampoDePesquisa");

		switch (TipoDePesquisa.value) {
		case "":
			CampoDePesquisa.setAttribute("placeholder",
					"Selecione uma opção...");
			break;
		case "Nome":
			CampoDePesquisa.setAttribute("placeholder", "Digite um Nome");
			break;
		case "Sexo":
			CampoDePesquisa
					.setAttribute("placeholder", "Masculino ou Feminino");
			break;
		case "Nascimento":
			CampoDePesquisa.setAttribute("placeholder", "dd/mm/aaaa");
			break;
		case "Rg":
			CampoDePesquisa.setAttribute("placeholder", "Somente Números");
			break;
		case "Cpf":
			CampoDePesquisa.setAttribute("placeholder", "123.456.789-00");
			break;
		case "Email":
			CampoDePesquisa.setAttribute("placeholder", "exemplo@exemplo.com");
			break;
		case "Telefone":
			CampoDePesquisa.setAttribute("placeholder", "Somente Números");
			break;
		}

	}
</script>

<!-----------------------------   FIM JS   ------------------------------>

</head>
<body>
	<header>
		<%@ include file="cabecalho-logout.jsp"%>
		<br />
		<%@ include file="cabecalho-logo.jsp"%>
		<br />
		<%@ include file="cabecalho-menu.jsp"%>
	</header>
	<br />
	<br />
	<section>
		<h1>Pesquisar Cliente</h1>
		<form id="FormPesquisaCliente" name="formPesquisaCliente"
			action="ClienteController.do" method="post">
			<table align="center">
				<tr>
					<td><select id="TipoDePesquisa" name="tipoDePesquisa"
						onChange="switchPlaceholder();" required>
							<option value="" selected>Pesquisar por...</option>
							<option value="Nome">Nome</option>
							<option value="Sexo">Sexo</option>
							<option value="Nascimento">Nascimento</option>
							<option value="Rg">Rg</option>
							<option value="Cpf">Cpf</option>
							<option value="Email">Email</option>
							<option value="Telefone">Telefone</option>
					</select></td>
					<td><input type="search" id="CampoDePesquisa"
						name="campoDePesquisa" placeholder="Selecione uma opção..."
						required></td>
					<td><input type="submit" id="BotaoPesquisa" name="action"
						value="Pesquisar"></td>
				</tr>
			</table>
		</form>
		<br />
		<c:choose>
			<c:when test="${listouCliente}">
				<c:choose>
					<c:when test="${resultadoPesquisa.size() == 0}">Nenhum resultado!</c:when>
					<c:otherwise>
						<center>
							<table class="TablePesquisa" width="90%" align="center" border>
								<tr>
									<th>Nome</th>
									<th>Sexo</th>
									<th>Nascimento</th>
									<th>RG</th>
									<th>CPF</th>
								</tr>
								<c:forEach var="cliente" items="${resultadoPesquisa}">
									<tr>
										<td>${cliente.getNome()}</td>
										<td>${cliente.getSexo()}</td>
										<td>${cliente.getNascimento()}</td>
										<td>${cliente.getRg()}</td>
										<td>${cliente.getCpf()}</td>
									</tr>
								</c:forEach>
							</table>
						</center>
					</c:otherwise>
				</c:choose>
			</c:when>
			<c:otherwise>Ainda não listou nada! </c:otherwise>
		</c:choose>
	</section>
	<br />
	<br />
	<footer>
		<%@ include file="rodape.jsp"%>
	</footer>
</body>
</html>