<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<title>Oficina - Login</title>
<!----------------------------- CODIGOS CSS ----------------------------->
<!-- <link rel="stylesheet" type="text/css" href="./CSS/ARQUIVO.css"/> -->
<link rel="stylesheet" type="text/css" href="./CSS/Modelo.css" />
<link href="./CSS/Login.css" rel="stylesheet" />
<!-----------------------------   FIM CSS   ----------------------------->
<!----------------------------- CODIGOS JS ------------------------------>
<!--- <script type="text/javascript" src="./JS/ARQUIVO.js"></script> ---->
<script type="text/javascript" src="./JS/JavaScript.js"></script>
<!-----------------------------   FIM JS   ------------------------------>
</head>
<body>
	<header>
		<%@ include file="cabecalho-oficina.jsp"%>
	</header>
	<!--FECHA CABECALHO-->

	<section>
		<center>
			<img id="LogoOficina" name="logoOficina" title="Logo Oficina"
				alt="[Logo Oficina]" src="IMG/Logo Temporario.png" />

			<form id="FormLogin" name="formLogin" action="LoginController.do"
				method="post">
				<table>
					<tr>
						<td><center>
								<label for="UsuarioNome">Nome de Usuario</label>
							</center></td>
					</tr>

					<tr>
						<td><input id="UsuarioNome" type="text" name="usuarioNome"
							placeholder="Seu Usuário" required /></td>
					</tr>

					<tr>
						<td><center>
								<label for="UsuarioSenha">Senha</label>
							</center></td>
					</tr>

					<tr>
						<td><input id="UsuarioSenha" type="password"
							name="usuarioSenha" placeholder="Sua Senha" required /></td>
					</tr>
				</table>
				<table>
					<tr>
						<td><input id="BotaoLogin" type="submit" name="action"
							value="Entrar" /></td>
						<td><input type="button" name="action" value="Registrar"
							onClick="encaminhar('registrar-usuario.jsp');"></td>
					</tr>
				</table>
			</form>
			<!--FECHA FORMULARIO-->
		</center>
	</section>
	<!--FECHA CONTEUDO-->
	<footer class="footer_registrar">
		<center>
			<table>
				<tr>
					<td>FLF 2015.2</td>
				</tr>
			</table>
		</center>
	</footer>
	<!--FECHA RODAPE-->
</body>
</html>