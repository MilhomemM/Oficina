<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<title>Oficina - Agendar Conserto</title>
<!----------------------------- CODIGOS CSS ----------------------------->
<!-- <link rel="stylesheet" type="text/css" href="./CSS/ARQUIVO.css"/> -->
<link rel="stylesheet" type="text/css" href="./CSS/Modelo.css" />
<!-----------------------------   FIM CSS   ----------------------------->
<!----------------------------- CODIGOS JS ------------------------------>
<!--- <script type="text/javascript" src="./JS/ARQUIVO.js"></script> ---->
<script type="text/javascript" src="./JS/JavaScript.js"></script>
<script type="text/javascript" src="./JS/ConsertoAgendar.js"></script>
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
		<h1 id="TituloConserto" class="conserto">Agendamento de Conserto</h1>
		<form id="FormAgendaConserto" name="formAgendaConserto"
			action="ConsertoController.do" method="post">
			<center>
				<table id="TableFormConserto" class="FormTableCadastro">
					<tr>
						<td><table>
								<tr>
									<td><label for="ClienteData">Data</label></td>
									<td><input id="ClienteData" class="clienteData"
										type="date"></td>
								</tr>
								<tr>
									<td><label for="ClientePlacaVeiculo">Veiculo</label></td>
									<td class="entrada"><input id="ClientePlacaVeiculo"
										type="text"></td>
								</tr>
							</table></td>
					</tr>
					<tr>
						<td><fieldset>
								<legend> Serviços </legend>
								<table>
									<tr>
										<td class="entrada"><input id="ConsertoCheckP"
											name="consertoCheckP" type="checkbox"></td>
										<td><label for="ConsertoCheckP">Pintura</labe></td>
										<td><input id="ConsertoCodigoPintura"
											name="consertoCodigoPintura" type="text"></td>
									</tr>
									<tr>
										<td class="entrada"><input id="ConsertoCheckF"
											name="consertoCheckF" type="checkbox"></td>
										<td><label for="ConsertoCheckF">Funilaria</label></td>
										<td class="entrada"><input id="ConsertoCodigoFunilaria"
											name="consertoCodigoFunilaria" type="text"></td>
									</tr>
									<tr>
										<td class="entrada"><input id="ConsertoCheckM"
											name="consertoCheckM" type="checkbox"></td>
										<td><label for="ConsertoCheckM">Mecanica</label></td>
										<td class="entrada"><input id="ConsertoCodigoMecanica"
											name="consertoCodigoMecanica" type="text"></td>
									</tr>
								</table>
							</fieldset></td>
					</tr>
				</table>
				<table>
					<tr>
						<td class="entrada"><input id="ClienteBotaoAgendar"
							nome="action" type="submit" value="Confirmar"></td>
						<td class="entrada"><input id="ClienteBotaoRedefinir"
							nome="action" type="reset" value="Redefinir"></td>
						<td class="entrada"><input id="ClienteBotaoEnviar"
							nome="action" type="submit" name="action" value="Cancelar"></td>
					</tr>
				</table>
			</center>
		</form>
		<br />
		<footer class="RodapeArticle">
			*Todos os campos são obrigatórios.<br /> *Apenas um bloco pode ser
			submetido por vez.
		</footer>

	</section>
	<br />
	<br />
	<footer>
		<%@ include file="rodape.jsp"%>
	</footer>
</body>
</html>