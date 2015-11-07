<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<title>Oficina - Pesquisa de Conserto</title>
<!----------------------------- CODIGOS CSS ----------------------------->
<!-- <link rel="stylesheet" type="text/css" href="./CSS/ARQUIVO.css"/> -->
<link rel="stylesheet" type="text/css" href="./CSS/Modelo.css" />
<!-----------------------------   FIM CSS   ----------------------------->
<!----------------------------- CODIGOS JS ------------------------------>
<!--- <script type="text/javascript" src="./JS/ARQUIVO.js"></script> ---->
<script type="text/javascript" src="./JS/JavaScript.js"></script>
<script type="text/javascript" src="./JS/ConsertoPesquisar.js"></script>
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

		<h1>Pesquisa por Conserto</h1>

		<form id="FormPesquisaServico" name="formPesquisaServico"
			action="ConsertoController.do" method="post">
			<table align="center">
				<tr>
					<td><select id="TipoDePesquisa" name="tipoDePesquisa"
						onChange="switchPlaceholder();" required>
							<option value="" selected>Pesquisar por...</option>
							<option value="Codigo">Código</option>
							<option value="Nome">Nome Cliente</option>
							<option value="Placa">Placa Veiculo</option>
							<option value="Data">Data Conserto</option>
							<option value="TipoServico">Tipo de Serviço</option>
							<option value="Preco">Preco</option>
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
		<footer class="RodapeArticle"> </footer>
	</section>
	<br />
	<br />
	<footer>
		<%@ include file="rodape.jsp"%>
	</footer>
</body>
</html>