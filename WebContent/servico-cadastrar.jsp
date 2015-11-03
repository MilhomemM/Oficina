<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<title>Oficina - Cadastro de Serviço</title>
<!----------------------------- CODIGOS CSS ----------------------------->
<!-- <link rel="stylesheet" type="text/css" href="./CSS/ARQUIVO.css"/> -->
<link rel="stylesheet" type="text/css" href="./CSS/Modelo.css" />
<!-----------------------------   FIM CSS   ----------------------------->
<!----------------------------- CODIGOS JS ------------------------------>
<!--- <script type="text/javascript" src="./JS/ARQUIVO.js"></script> ---->
<script type="text/javascript" src="./JS/JavaScript.js"></script>
<script type="text/javascript" src="./JS/ServicoCadastro.js"></script>
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
		<h1>Cadastro de Serviço</h1>
		<center>
			<form id="ServicoFormTipoDeServico" action="ServicoController.do">
				<table class="FormTableCadastro">
					<tr>
						<td></td>
						<td><label>Tipo de Serviço</label></td>
						<td></td>
					</tr>
					<tr>
						<td><table>
								<tr>
									<td><input id="ServicoTipoPintura" name="servicoTipo"
										type="radio" value="Pintura"
										onClick="mostrarConteudoOculto();"></td>
									<td><label for="ServicoTipoPintura">Pintura</label></td>
								</tr>
							</table></td>
						<td><table>
								<tr>
									<td><input id="ServicoTipoMecanica" name="servicoTipo"
										type="radio" value="Mecanica"
										onClick="mostrarConteudoOculto();"></td>
									<td><label for="ServicoTipoMecanica">Mecanica</label></td>
								</tr>
							</table></td>
						<td><table>
								<tr>
									<td><input id="ServicoTipoFunilaria" name="servicoTipo"
										type="radio" value="Funilaria"
										onClick="mostrarConteudoOculto();"></td>
									<td><label for="ServicoTipoFunilaria">Funilaria</label></td>
								</tr>
							</table></td>
					</tr>
				</table>
				<table class="FormTableCadastro">
					<tr id="EntradaVeiculo" style="display: none">
						<td><label>Veículo</label></td>
						<td><table>
								<tr>
									<td><input id="ServicoTipoVeiculoCarro"
										name="servicoTipoVeiculo" type="radio" value="Carro" required></td>
									<td><label for="ServicoTipoVeiculoCarro">Carro</label></td>
									<td><input id="ServicoTipoVeiculoMoto"
										name="servicoTipoVeiculo" type="radio" value="Moto" required></td>
									<td><label for="ServicoTipoVeiculoMoto">Moto</label></td>
								</tr>
								</tr>
							</table></td>
					<tr id="EntradaServico" style="display: none">
						<td><label for="Sevico">Serviço:</label></td>
						<td><input id="Sevico" name="servico" type="text"
							placeholder="Tipo de serviço"></td>
					</tr>
					<tr id="EntradaCor" style="display: none">
						<td><label for="SevicoCor">Cor:</label></td>
						<td><input id="SevicoCor" name="servicoCor" type="text"
							placeholder="Cor para o veículo"></td>
					</tr>
					<tr id="EntradaPeca" style="display: none">
						<td><label for="SevicoPeca">Peça:</label></td>
						<td><input id="SevicoPeca" name="servicoPeca" type="text"
							placeholder="Nome da peça"></td>
					</tr>
					<tr id="EntradaPreco" style="display: none">
						<td><label for="SevicoPreco">Preço:</label></td>
						<td><input id="SevicoPreco" name="servicoPreco" type="text"
							placeholder="R$"></td>
					</tr>
				</table>
				<br />
				<table>
					<tr>
						<td><input type="submit" name="action" value="Cadastrar"></td>
						<td><input type="reset" value="Redefinir"></td>
						<td><input type="submit" name="action" value="Cancelar"></td>
					</tr>
				</table>
			</form>
			<br />
		</center>
		<footer class="RodapeSection">
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