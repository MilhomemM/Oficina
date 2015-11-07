<form id="FormLogout" action="LoginController.do"
	onSubmit="return confirmar('Quer mesmo sair?')">
	<table class="CabecalhoUsuario" width="100%">
		<tr>
			<td>Bem vindo, ${ usuarioLogado } <input type="submit" name="action" value="Sair"></td>
		</tr>
	</table>
</form>