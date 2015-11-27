<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<title>Oficina - Detalhes Conserto</title>
<!----------------------------- CODIGOS CSS ----------------------------->
<!-- <link rel="stylesheet" type="text/css" href="./CSS/ARQUIVO.css"/> -->
<link rel="stylesheet" type="text/css" href="./CSS/Modelo.css" />
<!-----------------------------   FIM CSS   ----------------------------->
<!----------------------------- CODIGOS JS ------------------------------>
<!--- <script type="text/javascript" src="./JS/ARQUIVO.js"></script> ---->
<script type="text/javascript" src="./JS/JavaScript.js"></script>
<script type="text/javascript">
	
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

	<!-- INCOMPLETO	 -->
	<table>
		<tr>
			<td>
				<table>
					<tr>
						<td>Codigo</td>
						<td><input type="text"
							value="${consertoSelecionado.getCodigo() }"></td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td>
				<table>
					<tr>
						<td valign="top">
							<fieldset>
								<legend> Informações do Proprietário </legend>
								<table>
									<tr>
										<td><label for="ClienteNome">Nome </label></td>
										<td><input id="ClienteNome" name="clienteNome"
											class="Disabled" type="text"
											value="${consertoSelecionado.getVeiculo().getProprietario().getNome() }"
											disabled></td>
									</tr>
									<tr>
										<td><label for="ClienteSexo">Sexo</label></td>
										<td><input id="ClienteSexo" name="clienteSexo"
											class="Disabled" type="text"
											value="${consertoSelecionado.getVeiculo().getProprietario().getSexo() }"
											disabled></td>
									</tr>
									<tr>
										<td><label for="ClienteNascimento">Nascimento</label></td>
										<td><input id="ClienteNascimento"
											name="clienteNascimento" class="Disabled" type="text"
											value="${consertoSelecionado.getVeiculo().getProprietario().getNascimentoString() }"
											disabled></td>
									</tr>
									<tr>
										<td><label for="ClienteRG">RG</label></td>
										<td><input id="ClienteRG" name="clienteRG"
											class="Disabled" type="text"
											value="${consertoSelecionado.getVeiculo().getProprietario().getRg() }"
											disabled></td>
									</tr>
									<tr>
										<td><label for="ClienteCPF">CPF</label></td>
										<td><input id="ClienteCPF" name="clienteCPF"
											class="Disabled" type="text"
											value="${consertoSelecionado.getVeiculo().getProprietario().getCpf() }"
											disabled></td>
										</td>
									</tr>
									<tr>
										<td><label for="ClienteEmail">Email</label></td>
										<td><input id="ClienteEmail" name="clienteEmail"
											type="email"
											value="${consertoSelecionado.getVeiculo().getProprietario().getEmail() }"></td>
									</tr>
									<tr>
										<td><label for="ClienteTelefone">Telefone</label></td>
										<td><input id="ClienteTelefone" name="clienteTelefone"
											type="tel"
											value="${consertoSelecionado.getVeiculo().getProprietario().getTelefone() }"></td>
									</tr>
								</table>
							</fieldset>
						</td>
						<td>
							<table>
								<tr>
									<td valign="top"><fieldset>
											<legend> Informações do Veículo </legend>
											<table>
												<tr>
													<td><label label="veiculoTipo">Veículo</label></td>
													<td><input id="VeiculoTipo" size="25"
														name="veiculoTipo" type="text"></td>
												</tr>
												<tr>
													<td><label for="VeiculoMarca">Marca</label></td>
													<td><input id="VeiculoMarca" name="veiculoMarca"
														type="text" placeholder="Informe a marca do veículo"
														size="25" required></td>
												</tr>
												<tr>
													<td><label for="VeiculoModelo">Modelo</label></td>
													<td><input id="VeiculoModelo" name="veiculoModelo"
														type="text" placeholder="Informe o modelo do veículo"
														size="25" required></td>
												</tr>
												<tr>
													<td><label for="VeiculoAnoModelo">Ano Modelo</label></td>
													<td><input id="VeiculoAnoModelo"
														name="veiculoAnoModelo" type="number"
														placeholder="Informe o ano de fabricação do veículo"
														size="25" required min=1980 max=2016></td>
												</tr>
												<tr>
													<td><label for="VeiculoCor">Cor</label></td>
													<td><input id="VeiculoCor" name="veiculoCor"
														type="text" placeholder="Informe a cor do veículo"
														size="25"
														pattern="[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$"
														required></td>
												</tr>
												<tr>
													<td><label for="VeiculoPlaca">Placa</label></td>
													<td><input id="VeiculoPlaca" name="veiculoPlaca"
														type="text" placeholder="ABC1234" size="25" required
														minlength=7 maxlength=7 pattern="[A-Za-z]{3}[0-9]{4}"></td>
												</tr>
												<tr>
													<td><label for="VeiculoChassi">Chassi</label></td>
													<td><input id="VeiculoChassi" name="veiculoChassi"
														type="text" placeholder="XX.XX.XXXXX.X.X.XXXXXX" size="25"
														required
														pattern="[A-Za-z0-9]{2}.[A-Za-z0-9]{2}.[A-Za-z0-9]{5}.[A-Za-z0-9]{1}.[A-Za-z0-9]{1}.[A-Za-z0-9]{6}"></td>
												</tr>
												<tr>
													<td><label for="VeiculoCidade">Cidade</label></td>
													<td><input id="VeiculoCidade" name="veiculoCidade"
														type="text" placeholder="Informe a cidade do veículo"
														size="25"
														pattern="[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$"
														required></td>
												</tr>
												<tr>
													<td><label for="VeiculoEstado">Estado</label></td>
													<td><input size="25" type="text" name="veiculoEstado"
														id="VeiculoEstado"></td>
												</tr>
											</table>
										</fieldset></td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td>
				<fieldset>
					<legend>Informações dos Serviços</legend>
					<table>
						<tr>
							<c:forEach var="servico"
								items="${consertoSelecionado.getServicos() }">
								<c:choose>
									<c:when
										test="${servico.getClass().getName() eq 'model.Pintura' }">
										<fieldset>
											<legend>Pintura</legend>

										</fieldset>
									</c:when>
									<c:when
										test="${servico.getClass().getName() eq 'model.Funilaria' }">
										<fieldset>
											<legend>Funilaria</legend>

										</fieldset>
									</c:when>
									<c:when
										test="${servico.getClass().getName() eq 'model.Mecanica' }">
										<fieldset>
											<legend>Mecanica</legend>

										</fieldset>
									</c:when>
								</c:choose>
							</c:forEach>
						</tr>
					</table>
				</fieldset>
			</td>
		</tr>
	</table>
	<!-- FIM INCOMPLETO -->

</body>
</html>