<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<title>Oficina - Perfil</title>
<link rel="stylesheet" href="./CSS/Perfil.css" />
<link rel="stylesheet" type="text/css" href="./CSS/Modelo.css" />
<script type="text/javascript" src="./JS/JavaScript.js"></script>
</head>

<body>
	<header>
		<%@ include file="cabecalho-logout.jsp"%>
		<br />
		<%@ include file="cabecalho-logo.jsp"%>
		<br />
		<%@ include file="cabecalho-menu.jsp"%>
	</header>
	<!--FECHA CABECALHO-->

	<br />
	<br />
	<br />
	<section>
			<h1>Perfil</h1>

			<form id="FormPerfil" class="centraliza_form" name="formPerfil"
				action="AdministradorController.do" method="post">
					<table class="centraliza_table">
						<tr>
							<td><label for="UsuarioNomeCompleto">Nome Completo:
							</label></td>
							<td><input id="UsuarioNomeCompleto" class="Disabled"
								type="text" name="usuarioNomeCompleto"
								value="${usuarioLogado.getNome() }" disabled /></td>
						</tr>

						<tr>
							<td><label for="UsuarioRG">RG: </label></td>
							<td><input id="UsuarioRG" class="Disabled" type="text"
								name="usuarioRG" value="${usuarioLogado.getRg() }" disabled /></td>
						</tr>

						<tr>
							<td><label for="UsuarioCPF">CPF: </label></td>
							<td><input id="UsuarioCPF" class="Disabled" type="text"
								name="usuarioCPF" value="${usuarioLogado.filtroCPF() }" disabled /></td>
						</tr>

						<tr>
							<td><label for="UsuarioDataNascimento">Data de
									Nascimento: </label></td>
							<td><input id="UsuarioDataDeNascimento" type="text"
								name="usuarioDataDeNascimento"
								value="${usuarioLogado.getNascimentoString() }" disabled /></td>
						</tr>

						<tr>
							<td><label for="UsuarioEmail">Email: </label></td>
							<td><input id="UsuarioEmail" type="email"
								name="usuarioEmail" placeholder="exemplo@exemplo.com"
								value="${usuarioLogado.getEmail() }" required /></td>
						</tr>

						<tr>
							<td><label for="UsuarioConfirmarEmail">Confirmar
									Email: </label></td>
							<td><input id="UsuarioConfirmarEmail" type="email"
								name="usuarioConfirmarEmail" placeholder="exemplo@exemplo.com"
								value="" required /></td>
						</tr>

						<tr>
							<td><label for="UsuarioNomeDeUsuario">Nome de
									Usuário: </label></td>
							<td><input id="UsuarioNomeDeUsuario" class="Disabled"
								type="text" name="usuarioNomeDeUsuario"
								value="${usuarioLogado.getUsuario().getLogin() }" disabled /></td>
						</tr>

						<tr>
							<td><label for="UsuarioSenha">Senha Antiga: </label></td>
							<td><input id="UsuarioSenha" type="password"
								name="usuarioSenha" placeholder="Informe a Senha" value="" required /></td>
						</tr>

						<tr>
							<td><label for="UsuarioConfirmeSenha">Nova Senha: *</label></td>
							<td><input id="UsuarioConfirmeSenha" type="password"
								name="usuarioConfirmeSenha" placeholder="Informe a Nova Senha"
								required /></td>
						</tr>

						<tr>
							<td><label for="UsuarioSexo">Sexo: </label></td>
							<td><input id="UsuarioSexo" class="Disabled" type="text"
								name="usuarioSexo" value="${usuarioLogado.getSexo() }" disabled></td>
						</tr>
					</table>

					<table class="centraliza_table">
						<tr>
							<td><input id="BotaoAlterar" type="submit" name="action"
								value="Alterar" /></td>
							<td><input id="BotaoLimpar" type="reset" name="limpar"
								value="Redefinir" /></td>
							<td><input id="BotaoVoltar" type="button" name="voltar"
								value="Voltar" onClick="encaminhar('home.jsp');"/></td>
						</tr>
					</table>
			</form>
			<!--FECHA FORMULARIO-->

	</section>
	<!--FECHA CONTEUDO-->

	<br />
	<br />
	<footer>
		<%@ include file="rodape.jsp"%>
	</footer>
	<!--FECHA RODAPE-->
</body>

</html>