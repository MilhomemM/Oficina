<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<title>Oficina - Pesquisa de Serviço</title>
<!----------------------------- CODIGOS CSS ----------------------------->
<!-- <link rel="stylesheet" type="text/css" href="./CSS/ARQUIVO.css"/> -->
<link rel="stylesheet" type="text/css" href="./CSS/Modelo.css" />
<!-----------------------------   FIM CSS   ----------------------------->
<!----------------------------- CODIGOS JS ------------------------------>
<!--- <script type="text/javascript" src="./JS/ARQUIVO.js"></script> ---->
<script type="text/javascript" src="./JS/JavaScript.js"></script>
<script type="text/javascript" src="./JS/ServicoPesquisa.js"></script>
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
		<h1 id="ServicoPesquisa" class="PesquisaServico">Pesquisa por Serviço</h1>
		<form id="FormPesquisaServico" name="formPesquisaServico"
			action="ServicoController.do" method="post">
			<table align="center">
				<tr>
					<td><select id="TipoDePesquisa" name="tipoDePesquisa"
						onChange="swapPlaceholder();" required>
							<option value="" selected>Pesquisar por...</option>
							<option value="Codigo">Código</option>
							<option value="TipoVeiculo">Tipo de Veiculo</option>
							<option value="TipoServico">Tipo de Serviço</option>
							<option value="Servico">Servico</option>
							<option value="Preco">Preco</option>
							<option value="Cor">Cor</option>
							<option value="Peca">Peça</option>
					</select></td>
					<td><input type="search" id="CampoDePesquisa"
						name="campoDePesquisa" placeholder="Selecione uma opção..."
						required></td>
					<td><input type="submit" id="BotaoPesquisa"
						name="action" value="Pesquisar"></td>
				</tr>
			</table>
		</form>
		<br />
		<c:choose>
			<c:when test="${listouServico}">
				<c:choose>
					<c:when test="${resultadoPesquisa.size() == 0}">Nenhum resultado!</c:when>
					<c:otherwise>
						<center>
							<table class="TablePesquisa" width="90%" border>
								<tr>
									<th class="ColunaCodigo">Código</th>
									<th class="ColunaVeiculo">Veículo</th>
									<th class="ColunaTipoServico">Tipo De Serviço</th>
									<th class="ColunaServico">Serviço</th>
									<th class="ColunaCor">Cor</th>
									<th class="ColunaPeca">Peça</th>
									<th class="ColunaPreco">Preço</th>
								</tr>
								<c:forEach var="servico" items="${resultadoPesquisa}">
									<tr>
										<td>${servico.getCodigo()}</td>
										<td>${servico.getTipoVeiculo()}</td>
										<td><c:choose>
												<c:when
													test="${servico.getClass().getName() eq 'model.Pintura'}">
      			Pintura
      		</c:when>
												<c:when
													test="${servico.getClass().getName() eq 'model.Funilaria'}">
      			Funilaria
      		</c:when>
												<c:when
													test="${servico.getClass().getName() eq 'model.Mecanica'}">
      			Mecanica
      		</c:when>
												<c:otherwise>
      		-
      		</c:otherwise>
											</c:choose></td>
										<td>${servico.getDescricao()}</td>
										<td><c:choose>
												<c:when
													test="${servico.getClass().getName() eq 'model.Pintura'}">${servico.getCor()}</c:when>
												<c:otherwise>-</c:otherwise>
											</c:choose></td>
										<td><c:choose>
												<c:when
													test="${servico.getClass().getName() eq 'model.Pintura' or servico.getClass().getName() eq 'model.Funilaria'}">${servico.getPeca()}</c:when>
												<c:otherwise>-</c:otherwise>
											</c:choose></td>
										<td>R$ ${servico.getPreco()}</td>
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