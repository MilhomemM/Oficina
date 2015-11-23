<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Oficina - Registrar Usuário</title>
<meta name="description" content="Registro de Usuário" />
<link rel="stylesheet" type="text/css" href="./CSS/Modelo.css" />
<link rel="stylesheet" href="CSS/RegistrarUsuario.css" />
<script type="text/javascript" src="JS/JavaScript.js"></script>
</head>
<body>
	<header>
		<%@ include file="cabecalho-oficina.jsp"%>
	</header>
	<!--FECHA CABEÇALHO-->

	<section>
		<center>
			<img id="LogoOficina" name="logoOficina" title="logo" alt="[logo]"
				src="IMG/Logo Temporario.png" width="150px" />

			<form id="FormRegistro" name="formRegistro"
				action="AdministradorController.do" method="post">
				<table>
					<tr>
						<td><label for="UsuarioNomeCompleto">Nome Completo: </label></td>
						<td><input id="UsuarioNomeCompleto" type="text"
							name="usuarioNomeCompleto" placeholder="Informe o Nome Completo"
							required /></td>
					</tr>

					<tr>
						<td><label for="UsuarioRG">RG: </label></td>
						<td><input id="UsuarioRG" type="text" name="usuarioRG"
							placeholder="Informe o RG" required /></td>
					</tr>

					<tr>
						<td><label for="UsuarioCPF">CPF: </label></td>
						<td><input id="UsuarioCPF" type="text" name="usuarioCPF"
							placeholder="Informe o CPF" required /></td>
					</tr>

					<tr>
						<td><label for="UsuarioDataNascimento">Data de
								Nascimento: </label></td>
						<td><input id="UsuarioNascimento" type="date"
							name="usuarioNascimento"></td>
					</tr>

					<tr>
						<td><label for="UsuarioEmail">Email: </label></td>
						<td><input id="UsuarioEmail" type="email" name="usuarioEmail"
							placeholder="exemplo@exemplo.com" required /></td>
					</tr>

					<tr>
						<td><label for="UsuarioConfirmarEmail">Confirmar
								Email: </label></td>
						<td><input id="UsuarioConfirmarEmail" type="email"
							name="usuarioConfirmarEmail" placeholder="exemplo@exemplo.com"
							required /></td>
					</tr>

					<tr>
						<td><label for="UsuarioNomeDeUsuario">Nome de
								Usuário: </label></td>
						<td><input id="UsuarioNomeDeUsuario" type="text"
							name="usuarioNomeDeUsuario"
							placeholder="Informe o Nome de Usuário" required /></td>
					</tr>

					<tr>
						<td><label for="UsuarioSenha">Senha: </label></td>
						<td><input id="UsuarioSenha" type="password"
							name="usuarioSenha" placeholder="Informe a Senha" required /></td>
					</tr>

					<tr>
						<td><label for="UsuarioConfirmeSenha">Confirme a
								Senha: </label></td>
						<td><input id="UsuarioConfirmeSenha" type="password"
							name="usuarioConfirmeSenha" placeholder="Confirme a Senha"
							required /></td>
					</tr>

					<tr>
						<td><label for="UsuarioSexo">Sexo: </label></td>
						<td><table>
								<tr>
									<td><input id="UsuarioSexoM" type="radio"
										name="usuarioSexo" value="Masculino" requerid /></td>
									<td><label for="UsuarioSexoM">Masculino</label></td>
									<td><input id="UsuarioSexoF" type="radio"
										name="usuarioSexo" value="Feminino" requerid /></td>
									<td><label for="UsuarioSexoF">Feminino</label></td>
								</tr>
							</table></td>
					</tr>
				</table>

				<table>
					<tr>
						<td><input id="BotaoEnviar" type="submit" name="action"
							value="Registrar" /></td>
						<td><input id="BotaoResetar" type="reset" name="redefinir"
							value="Redefinir" /></td>
						<td><input id="BotaoCancelar" type="submit" name="action"
							value="Cancelar" /></td>
					</tr>
				</table>
			</form>
			<!--FECHA FORMULÁRIO-->

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
	<!--FECHA RODAPÉ-->
</body>
</html>