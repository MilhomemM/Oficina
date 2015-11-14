function swapPlaceholder() {
	var TipoDePesquisa = document.getElementById("TipoDePesquisa");
	var CampoDePesquisa = document.getElementById("CampoDePesquisa");

	switch (TipoDePesquisa.value) {
	case "":
		CampoDePesquisa.setAttribute("type","search");
		CampoDePesquisa.setAttribute("placeholder", "Selecione uma opção...");
		CampoDePesquisa.removeAttribute("pattern");
		CampoDePesquisa.removeAttribute("minlength");
		CampoDePesquisa.removeAttribute("maxlength");
		break;
	case "Nome":
		CampoDePesquisa.setAttribute("type","search");
		CampoDePesquisa.setAttribute("placeholder", "Digite um Nome");
		CampoDePesquisa.setAttribute("pattern","[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$");
		CampoDePesquisa.removeAttribute("minlength");
		CampoDePesquisa.removeAttribute("maxlength");
		break;
	case "Sexo":
		CampoDePesquisa.setAttribute("type","search");
		CampoDePesquisa.setAttribute("placeholder", "Masculino ou Feminino");
		CampoDePesquisa.setAttribute("pattern","[a-zA-Z\s]+$");
		CampoDePesquisa.removeAttribute("minlength");
		CampoDePesquisa.removeAttribute("maxlength");
		break;
	case "Nascimento":
		CampoDePesquisa.setAttribute("type", "date");
		CampoDePesquisa.setAttribute("placeholder", "dd/mm/aaaa");
		CampoDePesquisa.removeAttribute("pattern");
		CampoDePesquisa.removeAttribute("minlength");
		CampoDePesquisa.removeAttribute("maxlength");
		break;
	case "Rg":
		CampoDePesquisa.setAttribute("type","search");
		CampoDePesquisa.setAttribute("placeholder", "Somente Números");
		CampoDePesquisa.setAttribute("pattern", "[0-9]+$");
		CampoDePesquisa.removeAttribute("minlength");
		CampoDePesquisa.removeAttribute("maxlength");
		break;
	case "Cpf":
		CampoDePesquisa.setAttribute("type","search");
		CampoDePesquisa.setAttribute("placeholder", "Somente Números");
		CampoDePesquisa.setAttribute("pattern", "[0-9]+$");
		CampoDePesquisa.setAttribute("minlegth", 11);
		CampoDePesquisa.setAttribute("maxlength", 11)
		break;
	case "Email":
		CampoDePesquisa.setAttribute("type","email");
		CampoDePesquisa.setAttribute("placeholder", "exemplo@exemplo.com");
		CampoDePesquisa.removeAttribute("pattern");
		CampoDePesquisa.removeAttribute("minlength");
		CampoDePesquisa.removeAttribute("maxlength");
		break;
	case "Telefone":
		CampoDePesquisa.setAttribute("type","tel");
		CampoDePesquisa.setAttribute("placeholder", "Somente Números");
		CampoDePesquisa.setAttribute("pattern","[0-9]+$");
		CampoDePesquisa.setAttribute("minlength",10);
		CampoDePesquisa.setAttribute("maxlength",11);
		break;
	}
}