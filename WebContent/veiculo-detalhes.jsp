<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Oficina - Detalhes de Veiculos</title>

<!----------------------------- CODIGOS CSS ----------------------------->
<link rel="stylesheet" type="text/css" href="./CSS/Modelo.css" />
<!-----------------------------   FIM CSS   ----------------------------->

<!----------------------------- CODIGOS JS ------------------------------>
<script type="text/javascript" src="./JS/JavaScript.js"></script>
<script type="text/javascript" src="./JS/VeiculoDetalhes.js"></script>
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
		<c:if test="${alterado}">Alterado com sucesso!</c:if>
		<c:if test="${cadastrado}">Cadastrado com sucesso!</c:if>
		<h1>Detalhes de Veículo</h1>
	
			<form id="VeiculoFormCadastro" class="centraliza_form" action="VeiculoController.do"
				method="post" onSubmit="removeDisabled();">
				<table class="FormTableCadastro centraliza_table">
					<tr>
						<td><label for="VeiculoProprietario">Proprietário</label></td>
						<td><select id="VeiculoProprietario"
							name="veiculoProprietario" style="width: 384px"
							required>
								<c:forEach var="proprietario" items="${bancoCliente.getBanco()}">
									<c:choose>
										<c:when
											test="${proprietario.getCpf() eq veiculoSelecionado.getProprietario().getCpf()}">
											<option value="${proprietario.getCpf()}" selected>${proprietario.getNome()}</option>
										</c:when>
										<c:otherwise><option value="${proprietario.getCpf()}">${proprietario.getNome()}</option></c:otherwise>
									</c:choose>
									
										
								</c:forEach>
						</select></td>
					</tr>
					<tr>
						<td><label for="VeiculoTipo">Veículo</label></td>
						<td><c:choose>
								<c:when
									test="${veiculoSelecionado.getClass().getName() eq 'model.Carro'}">
									<input id="VeiculoTipo" name="veiculoTipo" type="text"
										value="Carro"  size="50" disabled>
								</c:when>
								<c:when
									test="${veiculoSelecionado.getClass().getName() eq 'model.Moto'}">
									<input id="VeiculoTipo" name="veiculoTipo" type="text"
										value="Moto" size="50" disabled>
								</c:when>
							</c:choose>
						<td>
					</tr>
					<tr>
						<td><label for="VeiculoMarca">Marca</label></td>
						<td><input id="VeiculoMarca" name="veiculoMarca"
							class="Disabled" type="text"
							value="${veiculoSelecionado.getMarca()}" size="50" disabled></td>
					</tr>
					<tr>
						<td><label for="VeiculoModelo">Modelo</label></td>
						<td><input id="VeiculoModelo" name="veiculoModelo"
							class="Disabled" type="text"
							value="${veiculoSelecionado.getModelo()}" size="50" disabled></td>
					</tr>
					<tr>
						<td><label for="VeiculoAnoModelo">Ano Modelo</label></td>
						<td><input id="VeiculoAnoModelo" name="veiculoAnoModelo"
							class="Disabled" type="text"
							value="${veiculoSelecionado.getAno()}" size="50" disabled></td>
					</tr>
					<tr>
						<td><label for="VeiculoCor">Cor</label></td>
						<td><input id="VeiculoCor" name="veiculoCor" type="text"
							value="${veiculoSelecionado.getCor()}" size="50"></td>
					</tr>
					<tr>
						<td><label for="VeiculoPlaca">Placa</label></td>
						<td><input id="VeiculoPlaca" name="veiculoPlaca"
							class="Disabled" type="text"
							value="${veiculoSelecionado.getPlaca()}" size="50" disabled></td>
					</tr>
					<tr>
						<td><label for="VeiculoChassi">Chassi</label></td>
						<td><input id="VeiculoChassi" name="veiculoChassi"
							class="Disabled" type="text"
							value="${veiculoSelecionado.getChassi()}" size="50" disabled></td>
					</tr>
					<tr>
						<td><label for="VeiculoCidade">Cidade</label></td>
						<td><input id="VeiculoCidade" name="veiculoCidade"
							class="Disabled" type="text"
							value="${veiculoSelecionado.getCidade()}" size="50" disabled></td>
					</tr>
					<tr>
						<td><label for="VeiculoEstado">Estado</label></td>
						<td><input id="VeiculoEstado" name="veiculoEstado"
							class="Disabled" type="text"
							value="${veiculoSelecionado.getEstado()}" size="50" disabled></td>
					</tr>
				</table>
				<br />
				<table class="centraliza_table">
					<tr>
						<td><input type="submit" name="action" value="Excluir"></td>
						<td><input type="submit" name="action" value="Alterar"></td>
						<td><input type="button" name="action" value="Voltar"
							onClick="encaminharConfirm('veiculo.jsp','Quer mesmo voltar?');"></td>
					</tr>
				</table>
			</form>
		<br />
	</section>
	<footer>
		<%@ include file="rodape.jsp"%>
	</footer>
</body>
</html>