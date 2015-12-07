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
		<table class="centraliza_table">
			<tr>
				<td>
					<img id="SetaParaBaixoE" alt="Desça!" src="IMG/down_arrow.gif">
				</td>
				<td>
					<img id="LogoOficinaDoLeitao" alt="Oficina do Leitão" src="IMG/Oficina_do_Leitão.png">
				</td>
				<td>
					<img id="SetaParaBaixoD" alt="Desça!" src="IMG/down_arrow.gif">
				</td>
			</tr>
		</table>

		<table class="tabelaSobre">
			<tr>
				<td><img id="usuarioFlavio" class="foto" title="Flavio"
					alt="Flavio" src="IMG/Avatar/Flavio.jpg" />
					<p class="descricao">Lorem ipsum dolor sit amet, consectetur
						adipiscing elit. Morbi dapibus condimentum tortor, quis lobortis
						tellus congue vitae. In ultrices interdum egestas.</p></td>

				<td><img id="usuarioMarcelo" class="foto" title="Marcelo"
					alt="Marcelo" src="IMG/Avatar/Marcelo.jpg" />
					<p class="descricao">Lorem ipsum dolor sit amet, consectetur
						adipiscing elit. Morbi dapibus condimentum tortor, quis lobortis
						tellus congue vitae. In ultrices interdum egestas.</p></td>
						
				<td><img id="usuarioRuan" class="foto" title="Ruan" alt="Ruan"
					src="IMG/Avatar/Ruan.jpg" />
					<p class="descricao">Lorem ipsum dolor sit amet, consectetur
						adipiscing elit. Morbi dapibus condimentum tortor, quis lobortis
						tellus congue vitae. In ultrices interdum egestas.</p></td>
						
				<td><img id="usuarioFilipe" class="foto" title="Filipe"
					alt="Filipe" src="IMG/Avatar/Filipe.jpg" />
					<p class="descricao">Lorem ipsum dolor sit amet, consectetur
						adipiscing elit. Morbi dapibus condimentum tortor, quis lobortis
						tellus congue vitae. In ultrices interdum egestas.</p></td>

				<td><img id="usuarioVlabson" class="foto" title="Vlabson"
					alt="Vlabson" src="IMG/Avatar/Vlabson.jpg" />
					<p class="descricao">Lorem ipsum dolor sit amet, consectetur
						adipiscing elit. Morbi dapibus condimentum tortor, quis lobortis
						tellus congue vitae. In ultrices interdum egestas.</p></td>

				<td><img id="usuarioPaula" class="foto" title="Paula"
					alt="Paula" src="IMG/Avatar/Paulinha.jpg" />
					<p class="descricao">Lorem ipsum dolor sit amet, consectetur
						adipiscing elit. Morbi dapibus condimentum tortor, quis lobortis
						tellus congue vitae. In ultrices interdum egestas.</p></td>
			</tr>
		</table>
	</section>
	<br />
	<br />
	<footer>
		<%@ include file="rodape.jsp"%>
	</footer>
</body>
</html>