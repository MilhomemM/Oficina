<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<title>Oficina - ServicoPesquisa</title>
<link rel="stylesheet" type="text/css" href="Modelo.css" />
<link rel="stylesheet" type="text/css" href="Pesquisar.css" />
<link rel="stylesheet" type="text/css" href="Cadastrar.css" />
<script type="text/javascript" src="./JS/ServicoPesquisa.js"></script>
</head>
<body>
	<article>
		<header>
			<h1>Pesquisa por Serviço</h1>
		</header>
		<form id="ServicoFormPesquisa">
			<center>
				<table class="FormTableCadastro">
					<tr>
						<td><table class="FormTableCadastro">
								<tr>
									<td><input type="radio" id="Todos" name="tipoServico"
										value="Todos" onClick="mostrarTabela();" checked></td>
									<td><label for="Todos">Todos</label></td>
								</tr>
							</table></td>
						<td><table class="FormTableCadastro">
								<tr>
									<td><input type="radio" id="Pintura" name="tipoServico"
										value="Pintura" onClick="mostrarTabela();"></td>
									<td><label for="Pintura">Pintura</label></td>
								</tr>
							</table></td>
						<td><table class="FormTableCadastro">
								<tr>
									<td><input type="radio" id="Funilaria" name="tipoServico"
										value="Funilaria" onClick="mostrarTabela();"></td>
									<td><label for="Funilaria">Funilaria</label></td>
								</tr>
							</table></td>
						<td><table class="FormTableCadastro">
								<tr>
									<td><input type="radio" id="Mecanica" name="tipoServico"
										value="Mecanica" onClick="mostrarTabela();"></td>
									<td><label for="Mecanica">Mecanica</label></td>
								</tr>
							</table></td>
					</tr>
				</table>
			</center>
		</form>
		<br />
		<center>
			<table class="TablePesquisa" width="90%" border>
				<tr>
					<th class="ColunaVeiculo">Veículo</th>
					<th class="ColunaTipoServico">Tipo De Serviço</th>
					<th class="ColunaServico">Serviço</th>
					<th class="ColunaCor">Cor</th>
					<th class="ColunaPeca">Peça</th>
					<th class="ColunaPreco">Preço</th>
				</tr>
				<c:forEach var="servico" items="${bancoServico.banco}">
					<tr>
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
      			Pintura
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
		<footer class="RodapeArticle"> </footer>
	</article>
</body>
</html>