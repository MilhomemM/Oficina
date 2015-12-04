<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<title>Oficina - Veiculo</title>

<!----------------------------- CODIGOS CSS ----------------------------->
<!-- <link rel="stylesheet" type="text/css" href="./CSS/ARQUIVO.css"/> -->
<link rel="stylesheet" type="text/css" href="./CSS/Modelo.css" />
<!-----------------------------   FIM CSS   ----------------------------->

<!----------------------------- CODIGOS JS ------------------------------>
<script type="text/javascript" src="./JS/JavaScript.js"></script>
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
	<section style="text-align: center">

		<c:if test="${excluido}">Excluido com sucesso!</c:if>

		<h1>Oficina - Veiculo</h1>
		<center>
			<table>
				<tr>
					<td><img src="IMG/Botão Cadastrar.png" alt="Botão Cadastrar"
						class="BotoesCP" onClick="encaminhar('veiculo-cadastrar.jsp');"></td>
				</tr>
				<tr>
					<td><img src="IMG/Botão Pesquisar.png" alt="Botão Pesquisar"
						class="BotoesCP" onClick="encaminhar('veiculo-pesquisar.jsp');"></td>
				</tr>
			</table>
		</center>
	</section>
	<footer>
		<%@ include file="rodape.jsp"%>
	</footer>
</body>
</html>