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
	<br />
	<section>
		<h1 id="TituloClienteDetalhes" class="titulo">Detalhes do
			Conserto</h1>

			<form id="ClienteFormCadastro" class="centraliza_form" action="ClienteController.do"
				method="post" onSubmit="removeDisabled();">
				<table id="TableFormCadastro" class="FormTableCadastro centraliza_table">
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
									<td valign="top" width="33%">
										<fieldset>
											<legend> Informações do Proprietário </legend>
											<table style="height:250px">
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
														<table style="height:250px">
															<tr>
																<td><label for="veiculoTipo">Veículo</label></td>
																<td><c:choose>
																		<c:when
																			test="${consertoSelecionado.getVeiculo().getClass().getName() eq 'model.Carro' }">
																			<input id="VeiculoTipo" size="25" name="veiculoTipo"
																				type="text" value="Carro">
																		</c:when>
																		<c:when
																			test="${consertoSelecionado.getVeiculo().getClass().getName() eq 'model.Moto' }">
																			<input id="VeiculoTipo" size="25" name="veiculoTipo"
																				type="text" value="Moto">
																		</c:when>
																	</c:choose></td>
															</tr>
															<tr>
																<td><label for="VeiculoMarca">Marca</label></td>
																<td><input id="VeiculoMarca" name="veiculoMarca"
																	type="text"
																	value="${consertoSelecionado.getVeiculo().getMarca() }"></td>
															</tr>
															<tr>
																<td><label for="VeiculoModelo">Modelo</label></td>
																<td><input id="VeiculoModelo" name="veiculoModelo"
																	type="text" value="${consertoSelecionado.getVeiculo().getModelo() }"></td>
															</tr>
															<tr>
																<td><label for="VeiculoAnoModelo">Ano
																		Modelo</label></td>
																<td><input id="VeiculoAnoModelo"
																	name="veiculoAnoModelo" type="number" value="${consertoSelecionado.getVeiculo().getAno() }"></td>
															</tr>
															<tr>
																<td><label for="VeiculoCor">Cor</label></td>
																<td><input id="VeiculoCor" name="veiculoCor"
																	type="text" value="${consertoSelecionado.getVeiculo().getCor() }"></td>
															</tr>
															<tr>
																<td><label for="VeiculoPlaca">Placa</label></td>
																<td><input id="VeiculoPlaca" name="veiculoPlaca"
																	type="text" value="${consertoSelecionado.getVeiculo().getPlaca() }"></td>
															</tr>
															<tr>
																<td><label for="VeiculoChassi">Chassi</label></td>
																<td><input id="VeiculoChassi" name="veiculoChassi"
																	type="text" value="${consertoSelecionado.getVeiculo().getChassi() }"></td>
															</tr>
															<tr>
																<td><label for="VeiculoCidade">Cidade</label></td>
																<td><input id="VeiculoCidade" name="veiculoCidade"
																	type="text" value="${consertoSelecionado.getVeiculo().getCidade() }"></td>
															</tr>
															<tr>
																<td><label for="VeiculoEstado">Estado</label></td>
																<td><input size="25" type="text"
																	name="veiculoEstado" id="VeiculoEstado" value="${consertoSelecionado.getVeiculo().getEstado() }"></td>
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
						<td><table>
								<tr>
									<c:forEach var="servico"
										items="${consertoSelecionado.getServicos() }">
										<c:choose>
											<c:when
												test="${servico.getClass().getName() eq 'model.Pintura' }">
												<td valign="top">
													<fieldset>
														<legend>Pintura</legend>
														<table style="height:110px">
															<tr id="EntradaServico">
																<td><label for="Sevico">Serviço:</label></td>
																<td><input id="Sevico" name="servico" type="text"
																	value="${servico.getDescricao() }"></td>
															</tr>
															<tr id="EntradaCor">
																<td><label for="SevicoCor">Cor:</label></td>
																<td><input id="SevicoCor" name="servicoCor"
																	type="text" value="${servico.getCor() }"></td>
															</tr>
															<tr id="EntradaPeca">
																<td><label for="SevicoPeca">Peça:</label></td>
																<td><input id="SevicoPeca" name="servicoPeca"
																	type="text" value="${servico.getPeca() }"></td>
															</tr>
															<tr id="EntradaPreco">
																<td><label for="SevicoPreco">Preço:</label></td>
																<td><input id="SevicoPreco" name="servicoPreco"
																	type="text" value="${servico.getPreco() }"></td>
															</tr>
														</table>
													</fieldset>
												</td>
											</c:when>
											<c:when
												test="${servico.getClass().getName() eq 'model.Funilaria' }">
												<td valign="top">
													<fieldset>
														<legend>Funilaria</legend>
														<table style="height:110px">
															<tr id="EntradaServico">
																<td><label for="Sevico">Serviço:</label></td>
																<td><input id="Sevico" name="servico" type="text"
																	value="${servico.getDescricao() }"></td>
															</tr>
															<tr id="EntradaPeca">
																<td><label for="SevicoPeca">Peça:</label></td>
																<td><input id="SevicoPeca" name="servicoPeca"
																	type="text" value="${servico.getPeca() }"></td>
															</tr>
															<tr id="EntradaPreco">
																<td><label for="SevicoPreco">Preço:</label></td>
																<td><input id="SevicoPreco" name="servicoPreco"
																	type="text" value="${servico.getPreco() }"></td>
															</tr>
														</table>
													</fieldset>
												</td>
											</c:when>
											<c:when
												test="${servico.getClass().getName() eq 'model.Mecanica' }">
												<td valign="top">
													<fieldset>
														<legend>Mecanica</legend>
														<table style="height:110px">
															<tr id="EntradaServico">
																<td><label for="Sevico">Serviço:</label></td>
																<td><input id="Sevico" name="servico" type="text"
																	value="${servico.getDescricao() }"></td>
															</tr>
															<tr id="EntradaPreco">
																<td><label for="SevicoPreco">Preço:</label></td>
																<td><input id="SevicoPreco" name="servicoPreco"
																	type="text" value="${servico.getPreco() }"></td>
															</tr>
														</table>
													</fieldset>
												</td>
											</c:when>
										</c:choose>
									</c:forEach>
								</tr>
							</table></td>
					</tr>
					<tr>
						<td>
							<table>
								<tr>
									<td>
										<label>Total:</label>
									</td>
									<td>
										<input type="text" id="ConsertoTotal" name="consertoTotal" value="${consertoSelecionado.getTotal() }">
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</form>
		<br />
	
		<footer class="RodapeArticle">*Todos os campos são obrigatórios.</footer>
	</section>
	<br />
	<br />
	<footer>
		<table class="Rodape">
			<tr>
				<th>FLF 2015.2</th>
			</tr>
		</table>
	</footer>
</body>
</html>