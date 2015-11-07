<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<title>Oficina - Conserto</title>
<!----------------------------- CODIGOS CSS ----------------------------->
<!-- <link rel="stylesheet" type="text/css" href="./CSS/ARQUIVO.css"/> -->
<link rel="stylesheet" type="text/css" href="./CSS/Modelo.css" />
<!-----------------------------   FIM CSS   ----------------------------->
<!----------------------------- CODIGOS JS ------------------------------>
<!--- <script type="text/javascript" src="./JS/ARQUIVO.js"></script> ---->
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
	<section>

		<h1>Conserto</h1>
		<c:if test="${cadastroCancelado }">Cadastro cancelado!</c:if>
		<center>
			<table>
				<tr>
					<td><img src="IMG/Botão Agendar.png" alt="Botão Agendar"
						class="BotoesCP" onClick="encaminhar('conserto-agendar.jsp');"></td>
				</tr>
				<tr>
					<td><img src="IMG/Botão Pesquisar.png" alt="Botão Pesquisar"
						class="BotoesCP" onClick="encaminhar('conserto-pesquisar.jsp');"></td>
				</tr>
			</table>
		</center>
	</section>
	<br />
	<footer>
		<%@ include file="rodape.jsp"%>
	</footer>
</body>
</html>