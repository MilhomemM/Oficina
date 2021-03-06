<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<title>Oficina - Detalhes de Serviço</title>
<!----------------------------- CODIGOS CSS ----------------------------->
<!-- <link rel="stylesheet" type="text/css" href="./CSS/ARQUIVO.css"/> -->
<link rel="stylesheet" type="text/css" href="./CSS/Modelo.css" />
<!-----------------------------   FIM CSS   ----------------------------->
<!----------------------------- CODIGOS JS ------------------------------>
<!--- <script type="text/javascript" src="./JS/ARQUIVO.js"></script> ---->
<script type="text/javascript" src="./JS/JavaScript.js"></script>
<script type="text/javascript">
	function swapDisabled() {
		document.getElementById("ServicoCodigo").removeAttribute("disabled");
	}
</script>
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
		<form id="FormServicoDetalhes" class="centraliza_form" name="formServicoDetalhes"
			action="ServicoController" method="post" onSubmit="swapDisabled();">
			<h1>Detalhes de Serviço</h1>
			<table class="centraliza_table">
				<c:if test="${servicoSelecionado != null}">
					<tr>
						<td id="DetalhesCodigo" class="DetalhesServicoCodigo"><label>Codigo</label></td>
						<td><input id="ServicoCodigo" name="servicoCodigo"
							type="text" value="${servicoSelecionado.getCodigo()}" disabled>
					<tr>
						<td id="DetalhesServicoTipo" class="DetalhesTipoServico"><label>Tipo de servico</label></td>
						<td><c:choose>
								<c:when
									test="${servicoSelecionado.getClass().getName() eq 'model.Pintura'}">
									<input id="ServicoTipoPintura" name="servicoTipoPintura"
										type="text" value="Pintura" disabled>
								</c:when>
								<c:when
									test="${servicoSelecionado.getClass().getName() eq 'model.Funilaria'}">
									<input id="ServicoTipoFunilaria" name="servicoTipoFunilaria"
										type="text" value="Funilaria" disabled>
								</c:when>
								<c:when
									test="${servicoSelecionado.getClass().getName() eq 'model.Mecanica'}">
									<input id="ServicoTipoFunilaria" name="servicoTipoMecanica"
										type="text" value="Mecanica" disabled>
								</c:when>
							</c:choose></td>
					</tr>
					<tr>
						<td id="DetalhesServicoVeiculo" class="DetalhesVeiculoServico"><label>Veiculo</label></td>
						<td><input type="text" id="ServicoVeiculo"
							name="servicoVeiculo"
							value="${servicoSelecionado.getTipoVeiculo()}" disabled></td>
					</tr>
					<tr>
						<td id="DetalhesServico" class="ServicoDetalhes"><label>Serviço</label></td>
						<td><input id="ServicoDescricao" name="servicoDescricao"
							type="text" value="${servicoSelecionado.getDescricao()}" disabled></td>
					</tr>
					<c:if
						test="${servicoSelecionado.getClass().getName() eq 'model.Pintura' }">
						<tr>
							<td id="DetalhesCor" class="CorDetalhes"><label>Cor</label></td>
							<td><input id="ServicoCor" name="servicoCor" type="text" pattern="[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$"
								value="${servicoSelecionado.getCor()}"></td>
						</tr>
					</c:if>
					<c:if
						test="${servicoSelecionado.getClass().getName() != 'model.Mecanica'}">
						<tr>
							<td id="DetalhesPeca" class="PecaDetalhes"><label>Peça</label></td>
							<td><input id="ServicoPeca" name="servicoPeca" type="text" pattern="[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$"
								value="${servicoSelecionado.getPeca()}"></td>
						</tr>
					</c:if>
					<tr>
						<td id="DetalhesPreco" class="PrecoDetalhes"><label>Preço</label></td>
						<td><input id="ServicoPreco" name="servicoPreco" type="text" minlength=4 maxlength=9 pattern="[0-9]{1,6},[0-9]{2}$"
							value="${servicoSelecionado.getPrecoString()}"></td>
					</tr>
				</c:if>
			</table>
			<table class="centraliza_table">
				<tr>
					<td><input type="submit" name="action" value="Excluir"></td>
					<td><input type="submit" name="action" value="Alterar"></td>
					<td><input type="button" name="action" value="Voltar" onClick="encaminharConfirm('servico.jsp','Quer mesmo voltar?')"></td>
				</tr>
			</table>
		</form>
	</section>
	<br />
	<br />
	<footer>
		<%@ include file="rodape.jsp"%>
	</footer>
</body>
</html>