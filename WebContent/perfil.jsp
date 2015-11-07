<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE html>
	<html lang="pt-br">
	<head>
		<title>Oficina - Perfil</title>
		<meta name="description" content="Perfil do Usuário" />
		<link rel="stylesheet" href="CSS/Perfil.css" />
		<link rel="stylesheet" type="text/css" href="./CSS/Modelo.css" />
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
		
	<br/>
	<br/>
	<br/>
		<section>
			<center>
			<img id="OficinaLogo" name="oficinaLogo" class="logo" title="Logo da Oficina" alt="[Logo da Oficina]" src="IMG/Logo Temporario.png">

			<img id="OficinaAvatar"  name="oficinaAvatar" class="avatar" title="Avatar Oficina" alt="[Avatar Oficina]" src="IMG/AvatarOficina.jpg">

			<form id="FormPerfil" name="formPerfil" action="" method="post">
				<center>
					<table>
						<tr>
							<td>
								<label for="UsuarioNomeCompleto">Nome Completo: </label>
							</td>
							<td>
								<input id="UsuarioNomeCompleto" class="Disabled" type="text" name="usuarioNomeCompleto" disabled/>
							</td>
						</tr>

						<tr>
							<td>
								<label for="UsuarioRG">RG: </label>
							</td>
							<td>
								<input id="UsuarioRG" class="Disabled" type="text" name="usuarioRG" disabled/>
							</td>
						</tr>

						<tr>
							<td>
								<label for="UsuarioCPF">CPF: </label>
							</td>
							<td>
								<input id="UsuarioCPF" class="Disabled" type="text" name="usuarioCPF" disabled/>
							</td>
						</tr>

						<tr>
							<td>
								<label for="UsuarioNomeDeUsuario">Nome de Usuário: </label>
							</td>
							<td>
								<input id="UsuarioNomeDeUsuario" class="Disabled" type="text" name="usuarioNomeDeUsuario" disabled/>
							</td>
						</tr>

						<tr>
							<td>
								<label for="UsuarioSenha">Senha: </label>
							</td>
							<td>
								<input id="UsuarioSenha" type="password" name="usuarioSenha"  placeholder="Informe a Senha"required/>
							</td>
						</tr>

						<tr>
							<td><label for="UsuarioSexo">Sexo: </label></td>
							<td><input id="UsuarioSexo" class="Disabled" type="text" name="usuarioSexo" value="" disabled></td>
						</tr>

						<tr>
							<td><label for="UsuarioDataNascimento">Data de Nascimento: </label></td>
							<td><input id="UsuarioDataDeNascimento" type="date" name="usuarioDataDeNascimento" disabled/></td>
						</tr>
					</table>
					
					<table>
						<tr>
							<td><input id="BotaoAlterar" type="submit" name="alterar" value="Alterar"/></td>
							<td><input id="BotaoLimpar" type="reset" name="limpar" value="Limpar"/></td>
							<td><input id="BotaoVoltar" type="submit" name="voltar" value="Voltar"/></td>
						</tr>
					</table>
				</center>
			</form>
			<!--FECHA FORMULARIO-->
			
			</center>
		</section>
		<!--FECHA CONTEUDO-->
		
		<br/>
		<br/>
		<footer>
			<%@ include file="rodape.jsp"%>
		</footer>
		<!--FECHA RODAPE-->
	</body>

	</html>