function swapPlaceholder() {
	var TipoDePesquisa = document.getElementById("TipoDePesquisa");
	var CampoDePesquisa = document.getElementById("CampoDePesquisa");

	switch (TipoDePesquisa.value) {
	case "":
		CampoDePesquisa.setAttribute("placeholder", "Selecione uma opção...");
		break;
	case "Nome":
		CampoDePesquisa.setAttribute("placeholder", "Digite um Nome");
		break;
	case "Sexo":
		CampoDePesquisa.setAttribute("placeholder", "Masculino ou Feminino");
		break;
	case "Nascimento":
		CampoDePesquisa.setAttribute("placeholder", "dd/mm/aaaa");
		break;
	case "Rg":
		CampoDePesquisa.setAttribute("placeholder", "Somente Números");
		break;
	case "Cpf":
		CampoDePesquisa.setAttribute("placeholder", "123.456.789-00");
		break;
	case "Email":
		CampoDePesquisa.setAttribute("placeholder", "exemplo@exemplo.com");
		break;
	case "Telefone":
		CampoDePesquisa.setAttribute("placeholder", "Somente Números");
		break;
	}
}