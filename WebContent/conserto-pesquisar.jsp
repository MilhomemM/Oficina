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
	<section>

		<h1>Pesquisa por Conserto</h1>

		<form id="FormPesquisaServico" class="centraliza_form" name="formPesquisaServico"
			action="ConsertoController.do" method="post">
			<table class="centraliza_table">
				<tr>
					<td><select id="TipoDePesquisa" name="tipoDePesquisa"
						onChange="swapPlaceholder();" required>
							<option value="" selected>Pesquisar por...</option>
							<option value="Codigo">Código</option>
							<option value="NomeCliente">Nome do Cliente</option>
							<option value="PlacaVeiculo">Placa do Veiculo</option>
							<option value="Data">Data do Conserto</option>
							<option value="TipoServico">Tipo de Serviço</option>
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
			<c:when test="${listouConserto }">
				<c:choose>
					<c:when test="${resultadoPesquisa.size() == 0}">Nenhum resultado!</c:when>
					<c:otherwise>
						<center>
							<table class="TablePesquisa" width="90%" align="center" border>
								<tr>
									<th>Codigo</th>
									<th width="20%">Proprietario</th>
									<th width="20%">Veiculo</th>
									<th width="20%">Data</th>
									<th width="20%">Valor</th>
								</tr>
								<c:forEach var="conserto" items="${resultadoPesquisa }">
									<tr>
										<td>${conserto.getCodigo() }</td>
										<td>${conserto.getVeiculo().getProprietario() }</td>
										<td>${conserto.getVeiculo().getPlaca() }</td>
										<td>${conserto.getDataString() }</td>
										<td>${conserto.getTotal() }</td>
									</tr>
								</c:forEach>
							</table>
						</center>
					</c:otherwise>
				</c:choose>
			</c:when>
			<c:otherwise>
				Ainda não listou nada!
			</c:otherwise>
		</c:choose>
	</section>
	<br />
	<br />
	<footer>
		<%@ include file="rodape.jsp"%>
	</footer>
</body>
</html>