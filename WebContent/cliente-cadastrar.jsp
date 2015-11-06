<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<title>Oficina - Cadastro de Cliente</title>
<!----------------------------- CODIGOS CSS ----------------------------->
<!-- <link rel="stylesheet" type="text/css" href="./CSS/ARQUIVO.css"/> -->
<link rel="stylesheet" type="text/css" href="./CSS/Modelo.css" />
<link rel="stylesheet" type="text/css" href="./CSS/Cadastrar.css" />
<!-----------------------------   FIM CSS   ----------------------------->
<!----------------------------- CODIGOS JS ------------------------------>
<!--- <script type="text/javascript" src="./JS/ARQUIVO.js"></script> ---->
<script type="text/javascript" src="./JS/JavaScript.js"></script>
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
		<h1>Cadastro de Cliente</h1>
		<form id="FormCadastrarCliente" name="formCadastrarCliente"
			action="ClienteController.do" method="post">
			<center>
				<table class="FormTableCadastro">
					<tr>
						<td><label for="ClienteNome">Nome </label></td>
						<td><input id="ClienteNome" name="clienteNome" type="text"
							placeholder="Nome Completo" required></td>
					</tr>
					<tr>
						<td><label>Sexo</label></td>
						<td><table>
								<tr>
									<td><input id="ClienteSexoM" name="clienteSexo"
										type="radio" value="Masculino" required></td>
									<td><label for="ClienteSexoM">Masculino</label></td>
									<td><input id="ClienteSexoF" name="clienteSexo"
										type="radio" value="Feminino" required></td>
									<td><label for="ClienteSexoF">Feminino</label></td>
								</tr>
							</table></td>
					</tr>
					<tr>
						<td><label for="ClienteNascimento">Nascimento</label></td>
						<td><input id="ClienteNascimento" name="clienteNascimento"
							type="date" placeholder="Data de Nascimento" required></td>
					</tr>
					<tr>
						<td><label for="ClienteRG">RG</label></td>
						<td><input id="ClienteRG" name="clienteRG" type="text"
							placeholder="Somente Numeros" required></td>
					</tr>
					<tr>
						<td><label for="ClienteCPF">CPF</label></td>
						<td><input id="ClienteCPF" name="clienteCPF" type="text"
							placeholder="Somente Numeros" required></td>
					</tr>
					<tr>
						<td><label for="ClienteEmail">Email</label></td>
						<td><input id="ClienteEmail" name="clienteEmail" type="email"
							placeholder="exemplo@exemplo.com" required></td>
					</tr>
					<tr>
						<td><label for="ClienteTelefone">Telefone</label></td>
						<td><input id="ClienteTelefone" name="clienteTelefone"
							type="text" placeholder="Somente Numeros" required></td>
					</tr>
				</table>
				<br />
				<table>
					<tr>
						<td><input type="submit" value="Cadastrar" name="action"></td>
						<td><input type="reset" value="Redefinir"></td>
						<td><input type="submit" value="Cancelar" name="action"></td>
					</tr>
				</table>
			</center>
		</form>
		<br />
		<footer class="RodapeArticle">*Todos os campos são
			obrigatórios.</footer>
	</section>
	<br />
	<br />
	<footer>
		<%@ include file="rodape.jsp"%>
	</footer>
</body>
</html>