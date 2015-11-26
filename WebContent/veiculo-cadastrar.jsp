<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Oficina - Cadastro de Veiculo</title>

<!----------------------------- CODIGOS CSS ----------------------------->
<link rel="stylesheet" type="text/css" href="./CSS/Modelo.css" />
<!-----------------------------   FIM CSS   ----------------------------->

<!----------------------------- CODIGOS JS ------------------------------>
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
	<section style="text-align: center">
		<h1>Cadastrar Veículo</h1>
		<center>
			<form id="VeiculoFormCadastro" action="VeiculoController.do" method="post">
				
				<table class="FormTableCadastro">
					<tr>
						<td><label for="VeiculoProprietario">Proprietário</label></td>
						<td><select id="VeiculoProprietario"
							name="veiculoProprietario" required>
								<option value="">Selecione...</option>
								<c:forEach var="proprietario" items="${bancoCliente.getBanco()}">
									<option value="${proprietario.getCpf()}"> ${proprietario.getNome()}</option>
								</c:forEach>
						</select></td>
					</tr>
					<tr>
						<td><label>Veículo</label></td>
						<td><table>
								<tr>
									<td><input id="VeiculoTipoCarro" name="veiculoTipo"
										type="radio" value="Carro" required></td>
									<td><label for="VeiculoTipoCarro">Carro</label></td>
									<td><input id="VeiculoTipoMoto" name="veiculoTipo"
										type="radio" value="Moto" required></td>
									<td><label for="VeiculoTipoMoto">Moto</label></td>
								</tr>
							</table></td>
					</tr>
					<tr>
						<td><label for="VeiculoMarca">Marca</label></td>
						<td><input id="VeiculoMarca" name="veiculoMarca" type="text"
							placeholder="Informe a marca do veículo" size="25" required></td>
					</tr>
					<tr>
						<td><label for="VeiculoModelo">Modelo</label></td>
						<td><input id="VeiculoModelo" name="veiculoModelo"
							type="text" placeholder="Informe o modelo do veículo" size="25"
							required></td>
					</tr>
					<tr>
						<td><label for="VeiculoAnoModelo">Ano Modelo</label></td>
						<td><input id="VeiculoAnoModelo" name="veiculoAnoModelo"
							type="number"
							placeholder="Informe o ano de fabricação do veículo" size="25"
							required min=1980 max=2016></td>
					</tr>
					<tr>
						<td><label for="VeiculoCor">Cor</label></td>
						<td><input id="VeiculoCor" name="veiculoCor" type="text"
							placeholder="Informe a cor do veículo" size="25" pattern="[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$" required ></td>
					</tr>
					<tr>
						<td><label for="VeiculoPlaca">Placa</label></td>
						<td><input id="VeiculoPlaca" name="veiculoPlaca" type="text"
							placeholder="ABC1234" size="25" required minlength=7 maxlength=7 pattern="[A-Za-z]{3}[0-9]{4}" ></td>
					</tr>
					<tr>
						<td><label for="VeiculoChassi">Chassi</label></td>
						<td><input id="VeiculoChassi" name="veiculoChassi"
							type="text" placeholder="XX.XX.XXXXX.X.X.XXXXXX" size="25"
							required pattern="[A-Za-z0-9]{2}.[A-Za-z0-9]{2}.[A-Za-z0-9]{5}.[A-Za-z0-9]{1}.[A-Za-z0-9]{1}.[A-Za-z0-9]{6}"></td>
					</tr>
					<tr>
						<td><label for="VeiculoCidade">Cidade</label></td>
						<td><input id="VeiculoCidade" name="veiculoCidade"
							type="text" placeholder="Informe a cidade do veículo" size="25" pattern="[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$"
							required></td>
					</tr>
					<tr>
						<td><label for="VeiculoEstado">Estado</label></td>
						<td><select id="VeiculoEstado" name="veiculoEstado" required>
								<option value="">Selecione...</option>
								<option value="AC">AC</option>
								<option value="AL">AL</option>
								<option value="AM">AM</option>
								<option value="AP">AP</option>
								<option value="BA">BA</option>
								<option value="CE">CE</option>
								<option value="DF">DF</option>
								<option value="ES">ES</option>
								<option value="GO">GO</option>
								<option value="MA">MA</option>
								<option value="MG">MG</option>
								<option value="MS">MS</option>
								<option value="MT">MT</option>
								<option value="PA">PA</option>
								<option value="PB">PB</option>
								<option value="PE">PE</option>
								<option value="PI">PI</option>
								<option value="PR">PR</option>
								<option value="RJ">RJ</option>
								<option value="RN">RN</option>
								<option value="RS">RS</option>
								<option value="RO">RO</option>
								<option value="RR">RR</option>
								<option value="SC">SC</option>
								<option value="SE">SE</option>
								<option value="SP">SP</option>
								<option value="TO">TO</option>
						</select></td>
					</tr>
				</table>
				<br />
				<table>
					<tr>
						<td><input type="submit" value="Cadastrar" name="action"></td>
						<td><input type="reset" value="Redefinir" name="action"></td>
						<td><input type="button" value="Cancelar" name="action"
							onClick="encaminharConfirm('veiculo.jsp','Quer mesmo cancelar?');"></td>
					</tr>
				</table>
			</form>
		</center>
		<br />
		<footer class="RodapeArticle"> *Todos os campos são
			obrigatórios. </footer>
		</article>
		<footer>
			<%@ include file="rodape.jsp"%>
		</footer>
</body>