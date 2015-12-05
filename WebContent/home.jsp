<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<title>Oficina - Home</title>
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
	<br />
	<section>
		<img id="BotaoCliente" class="botaoHome" title="Botão Cliente" alt="[Botão Cliente]" src="IMG/cliente.jpg" onClick="encaminhar('cliente.jsp');"/>
		<img id="BotaoVeiculo" class="botaoHome" title="Botão veiculo" alt="[Botão veiculo]" src="IMG/veiculo.jpg" onClick="encaminhar('veiculo.jsp');"/>
		<img id="BotaoServico" class="botaoHome" title="Botão Servico" alt="[Botão Servico]" src="IMG/servico.jpg" onClick="encaminhar('servico.jsp');"/>
		<img id="BotaoConserto" class="botaoHome" title="Botão Conserto" alt="[Botão Conserto]" src="IMG/conserto.jpg" onClick="encaminhar('conserto.jsp');"/>
	</section>
	<br />
	<br />
	<footer>
		<%@ include file="rodape.jsp"%>
	</footer>
</body>
</html>