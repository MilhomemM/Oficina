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
		<h1>Agendamento de Conserto</h1>
		<center>
			<form id="ConsertoFormAgendamento" method="post"
				action="ConsertoController.do" onSubmit="return validarSubmit();">
				<table class="FormTableCadastro">
					<tr>
						<td><label for="VeiculoPlaca">Veiculo</label></td>
						<td><select id="VeiculoPlaca" name="veiculoPlaca" required>
								<option value="">Selecione...</option>
								<c:forEach var="veiculo" items="${bancoVeiculo.getBanco()}">
									<option value="${veiculo.getPlaca() }">${veiculo.getPlaca() }
										- ${veiculo.getProprietario().getNome() }</option>
								</c:forEach>
						</select></td>
					</tr>
				</table>
				<table width="80%">
					<tr>
						<td valign="top" width="33%"><fieldset
								id="FieldsetServicoTipoPintura">
								<legend>
									<input id="ServicoTipoPintura" name="servicoTipoPintura"
										type="checkbox" value="Pintura"
										onClick="mostrarConteudoOculto();"> <label
										for="ServicoTipoPintura">Pintura</label>
								</legend>
								<div id="FormServicoPintura" name="formServicoPintura"
									style="display: none">
									<table class="FormTableCadastro">
										<tr>
											<td><label for="ServicoPintura">Serviço:</label></td>
											<td><select id="ServicoPintura" name="servicoPintura"
												onChange="valorPintura();">
													<option value="">Selecione...</option>
													<c:forEach var="pintura"
														items="${bancoServico.pesquisarTipoServico(\"pintura\")}">
														<option value="${pintura.getCodigo()}">${pintura.getCodigo()}</option>
													</c:forEach>
											</select></td>
										</tr>
										<tr>
											<td><label for="ServicoFunilariaPreco">Preço:</label></td>
											<td>R$ <input id="ServicoFunilariaPreco"
												name="servicoFunilariaPreco" class="Disabled" type="text"
												value="00,00" disabled></td>
										</tr>
									</table>
								</div>
							</fieldset></td>
						<td valign="top" width="33%"><fieldset
								id="FieldsetServicoTipoFunilaria">
								<legend>
									<input id="ServicoTipoFunilaria" name="servicoTipoFunilaria"
										type="checkbox" value="Funilaria"
										onClick="mostrarConteudoOculto();"> <label
										for="ServicoTipoFunilaria">Funilaria</label>
								</legend>
								<div id="FormServicoFunilaria" name="formServicoFunilaria"
									style="display: none">
									<table class="FormTableCadastro">
										<tr>
											<td><label for="ServicoFunilaria">Serviço:</label></td>
											<td><select id="ServicoFunilaria"
												name="servicoFunilaria" onChange="valorFunilaria();">
													<option value="">Selecione...</option>
													<c:forEach var="funilaria"
														items="${bancoServico.pesquisarTipoServico(\"funilaria\") }">
														<option value="${funilaria.getCodigo()}">${funilaria.getCodigo()}</option>
													</c:forEach>
											</select></td>
										</tr>
										<tr>
											<td><label for="ServicoFunilariaPreco">Preço:</label></td>
											<td>R$ <input id="ServicoFunilariaPreco"
												name="servicoFunilariaPreco" class="Disabled" type="text"
												value="00,00" disabled></td>
										</tr>
									</table>
								</div>
							</fieldset></td>
						<td valign="top" width="34%"><fieldset
								id="FieldsetServicoTipoMecanica">
								<legend>
									<input id="ServicoTipoMecanica" name="servicoTipoMecanica"
										type="checkbox" value="Mecanica"
										onClick="mostrarConteudoOculto();"> <label
										for="ServicoTipoMecanica">Mecanica</label>
								</legend>
								<div id="FormServicoMecanica" name="formServicoMecanica"
									style="display: none">
									<table class="FormTableCadastro">
										<tr>
											<td><label for="ServicoMecanica">Serviço:</label></td>
											<td><select id="ServicoMecanica" name="servicoMecanica"
												onChange="valorMecanica();">
													<option value="">Selecione...</option>
													<c:forEach var="mecanica"
														items="${bancoServico.pesquisarTipoServico(\"mecanica\") }">
														<option value="${mecanica.getCodigo()}">${mecanica.getCodigo()}</option>
													</c:forEach>
											</select></td>
										</tr>
										<tr>
											<td><label for="ServicoMecanicaPreco">Preço:</label></td>
											<td>R$ <input id="ServicoMecanicaPreco"
												name="servicoMecanicaPreco" class="Disabled" type="text"
												value="00,00" disabled></td>
										</tr>
									</table>
								</div>
							</fieldset></td>
					</tr>
				</table>
				<table class="FormTableCadastro">
					<tr>
						<td><label for="ConsertoData">Data</label></td>
						<td><input id="ConsertoData" name="consertoData" type="date"
							placeholder="dd/mm/aaaa" required></td>
					</tr>
					<tr>
						<td><label for="Conserto">Total</label></td>
						<td>R$ <input id="ConsertoTotal" name="consertoTotal"
							type="text" value="00,00" disabled></td>
					</tr>
				</table>
				<br />
				<table>
					<tr>
						<td><input type="submit" value="Confirmar"></td>
						<td><input type="reset" value="Redefinir"></td>
						<td><input type="submit" name="action" value="Cancelar"></td>
					</tr>
				</table>
			</form>
			<br />
		</center>
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