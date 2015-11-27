<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<h1 id="ClienteTitulo" class="titulo">Cadastro de Cliente</h1>
		<form id="FormCadastrarCliente" name="formCadastrarCliente"
			action="ClienteController.do" method="post" accept-charset="UTF-8">
			<center>
				<table id="TableFormCadastro" class="FormTableCadastro">
					<tr>
						<td><label for="ClienteNome">Nome </label></td>
						<td><input id="ClienteNome" name="clienteNome" type="text"
							placeholder="Nome Completo" required
							pattern="[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$"></td>
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
							placeholder="Somente Numeros" required pattern="[0-9]+$"></td>
					</tr>
					<tr>
						<td><label for="ClienteCPF">CPF</label></td>
						<td><input id="ClienteCPF" name="clienteCPF" type="text"
							placeholder="Somente Numeros" required minlength=11 maxlength=11
							pattern="[0-9]+$"></td>
					</tr>
					<tr>
						<td><label for="ClienteEmail">Email</label></td>
						<td><input id="ClienteEmail" name="clienteEmail" type="email"
							placeholder="exemplo@exemplo.com" required></td>
					</tr>
					<tr>
						<td><label for="ClienteTelefone">Telefone</label></td>
						<td><table>
								<tr>
									<td><input type="tel" id="ClienteDDD" name="clienteDDD"
										placeholder="DDD" required minlength=2 maxlength=2 size="2"
										pattern="[0-9]+$" onKeyUp="autoTab(this,'ClienteTelefone')"></td>
									<td><input id="ClienteTelefone" name="clienteTelefone"
										type="tel" placeholder="Somente Numeros" required minlength=8
										maxlength=9 pattern="[0-9]+$"></td>
								</tr>
							</table></td>
					</tr>
				</table>
				<br />
				<table>
					<tr>
						<td><input id="ClienteBotaoCadastrar" name="action"
							type="submit" value="Cadastrar"></td>
						<td><input id="ClienteBotadaoResetar" name="action"
							type="reset" value="Redefinir"></td>
						<td><input id="ClienteBotaoCancelar" name="action"
							type="button" value="Cancelar"
							onClick="encaminharConfirm('cliente.jsp','Quer mesmo cancelar?');"></td>
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