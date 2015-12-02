<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Oficina - Pesquisa por Veículo</title>

<!----------------------------- CODIGOS CSS ----------------------------->
<link rel="stylesheet" type="text/css" href="./CSS/Modelo.css" />
<!-----------------------------   FIM CSS   ----------------------------->

<!----------------------------- CODIGOS JS ------------------------------>
<script type="text/javascript" src="./JS/JavaScript.js"></script>
<!-----------------------------   FIM JS   ------------------------------>

<script>
	function switchPlaceholder() {
		var TipoDePesquisa = document.getElementById("TipoDePesquisa");
		var CampoDePesquisa = document.getElementById("CampoDePesquisa");

		switch (TipoDePesquisa.value) {
		case "":
			CampoDePesquisa.setAttribute("placeholder",
					"Selecione uma opção...");
			break;
		case "Nome":
			CampoDePesquisa.setAttribute("placeholder", "Digite um Nome");
			break;
		case "MarcaVeiculo":
			CampoDePesquisa.setAttribute("placeholder", "");
			break;
		case "Nascimento":
			CampoDePesquisa.setAttribute("placeholder", "dd/mm/aaaa");
			break;
		case "Rg":
			CampoDePesquisa.setAttribute("placeholder", "Somente Números");
			break;
		case "Cpf":
			CampoDePesquisa.setAttribute("placeholder", "123.456.789-00");
			break;
		case "Email":
			CampoDePesquisa.setAttribute("placeholder", "exemplo@exemplo.com");
			break;
		case "Telefone":
			CampoDePesquisa.setAttribute("placeholder", "Somente Números");
			break;
		}
	}
</script>


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
		<h1>Pesquisa por Veículo</h1>

		<form id="FormPesquisaServico" class="centraliza_form" name="formPesquisaServico"
			action="VeiculoController.do" method="post">
			<table align="center" class="centraliza_table">
				<tr>
					<td><select id="TipoDePesquisa" name="tipoDePesquisa"
						onChange="switchPlaceholder();" required>
							<option value="" selected>Pesquisar por...</option>
							<option value="Nome">Nome Proprietario</option>
							<option value="MarcaVeiculo">Marca Veiculo</option>
							<option value="ModeloVeiculo">Modelo Veiculo</option>
							<option value="AnoVeiculo">Ano Veiculo</option>
							<option value="CorVeiculo">Cor Veiculo</option>
							<option value="Placa">Placa Veiculo</option>
							<option value="Chassi">Chassi</option>
							<option value="Cidade">Cidade</option>
							<option value="Estado">Estado</option>
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
			<c:when test="${listouVeiculo}">
				<c:choose>
					<c:when test="${resultadoPesquisa.size() == 0}">Nenhum resultado!</c:when>
					<c:otherwise>
						<center>
							<table class="TablePesquisa" width="90%" border>
								<tr>
									<th class="Nome">Nome Proprietario</th>
									<th class="MarcaVeiculo">Marca Veiculo</th>
									<th class="ModeloVeiculo">Modelo Veiculo</th>
									<th class="AnoVeiculo">Ano Veiculo</th>
									<th class="CorVeiculo">Cor Veiculo</th>
									<th class="Placa">Placa Veiculo</th>
									<th class="Chassi">Chassi</th>
									<th class="Cidade">Cidade</th>
									<th class="Estado">Estado</th>
								</tr>
								<c:forEach var="veiculo" items="${resultadoPesquisa}">
									<tr>
										<td>${veiculo.getProprietario()}</td>
										<td>${veiculo.getMarca()}</td>
										<td>${veiculo.getModelo()}</td>
										<td>${veiculo.getAno()}</td>
										<td>${veiculo.getCor()}</td>
										<td>${veiculo.getPlaca()}</td>
										<td>${veiculo.getChassi()}</td>
										<td>${veiculo.getCidade()}</td>
										<td>${veiculo.getEstado()}</td>
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
