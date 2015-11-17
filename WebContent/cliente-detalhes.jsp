<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<title>Oficina - Detalhes de Cliente</title>
<!----------------------------- CODIGOS CSS ----------------------------->
<!-- <link rel="stylesheet" type="text/css" href="./CSS/ARQUIVO.css"/> -->
<link rel="stylesheet" type="text/css" href="./CSS/Modelo.css" />
<link rel="stylesheet" type="text/css" href="./CSS/Cadastrar.css" />
<!-----------------------------   FIM CSS   ----------------------------->
<!----------------------------- CODIGOS JS ------------------------------>
<!--- <script type="text/javascript" src="./JS/ARQUIVO.js"></script> ---->
<script type="text/javascript" src="./JS/JavaScript.js"></script>
<script type="text/javascript">
	function removeDisabled() {
		document.getElementById("ClienteCPF").removeAttribute("disabled");
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
		<c:if test="${alterado }">Alterado com sucesso!</c:if>
		<c:if test="${cadastrado }">Cadastrado com suceso!</c:if>
		<h1>Detalhes do Cliente</h1>
		<center>
			<form id="ClienteFormCadastro" action="ClienteController.do"
				method="post" onSubmit="removeDisabled();">
				<table class="FormTableCadastro">
					<tr>
						<td><label for="ClienteNome">Nome </label></td>
						<td><input id="ClienteNome" name="clienteNome"
							class="Disabled" type="text"
							value="${clienteSelecionado.getNome()}" disabled></td>
					</tr>
					<tr>
						<td><label for="ClienteSexo">Sexo</label></td>
						<td><input id="ClienteSexo" name="clienteSexo"
							class="Disabled" type="text"
							value="${clienteSelecionado.getSexo() }" disabled></td>
					</tr>
					<tr>
						<td><label for="ClienteNascimento">Nascimento</label></td>
						<td><input id="ClienteNascimento" name="clienteNascimento"
							class="Disabled" type="text"
							value="${clienteSelecionado.getNascimentoString() }" disabled></td>
					</tr>
					<tr>
						<td><label for="ClienteRG">RG</label></td>
						<td><input id="ClienteRG" name="clienteRG" class="Disabled"
							type="text" value="${clienteSelecionado.getRg() }" disabled></td>
					</tr>
					<tr>
						<td><label for="ClienteCPF">CPF</label></td>
						<td><input id="ClienteCPF" name="clienteCPF" class="Disabled"
							type="text" value="${clienteSelecionado.getCpf() }" disabled></td>
						</td>
					</tr>
					<tr>
						<td><label for="ClienteEmail">Email</label></td>
						<td><input id="ClienteEmail" name="clienteEmail" type="email"
							value="${clienteSelecionado.getEmail() }"></td>
					</tr>
					<tr>
						<td><label for="ClienteTelefone">Telefone</label></td>
						<td><input id="ClienteTelefone" name="clienteTelefone"
							type="" value="${clienteSelecionado.getTelefone() }"></td>
					</tr>
				</table>
				<br />
				<table align="center">
					<tr>
						<td><input type="submit" name="action" value="Excluir"></td>
						<td><input type="submit" name="action" value="Alterar"></td>
						<td><input type="button" name="action" value="Voltar"
							onClick="encaminharConfirm('cliente.jsp','Quer mesmo voltar?');"></td>
					</tr>
				</table>
			</form>
		</center>
		<br />
		<center>
			<p1 class="RodapeArticle">*Todos os campos são obrigatórios.</p1>
		</center>
	</section>
	<br />
	<br />
	<footer>
		<%@ include file="rodape.jsp"%>
	</footer>
</body>
</html>