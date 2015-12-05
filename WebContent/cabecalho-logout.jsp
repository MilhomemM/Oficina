<form id="FormLogout" action="LoginController.do"
	onSubmit="return confirmar('Quer mesmo sair?')">
	<table class="CabecalhoUsuario">
		<tr>
			<td>Bem vindo, <a href="perfil.jsp">${ usuarioLogado.getUsuario().getLogin() }</a> <input type="submit" name="action" value="Sair"></td>
		</tr>
	</table>
</form>