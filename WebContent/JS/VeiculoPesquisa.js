function switchPlaceholder() {
	var TipoDePesquisa = document.getElementById("TipoDePesquisa");
	var CampoDePesquisa = document.getElementById("CampoDePesquisa");

	switch (TipoDePesquisa.value) {
	case "":
		CampoDePesquisa.setAttribute("type", "search");
		CampoDePesquisa.setAttribute("placeholder", "Selecione uma opção...");
		CampoDePesquisa.removeAttribute("pattern");
		CampoDePesquisa.removeAttribute("minLength");
		CampoDePesquisa.removeAttribute("maxLength");
		CampoDePesquisa.removeAttribute("min");
		CampoDePesquisa.removeAttribute("max");
		break;
	case "Nome":
		CampoDePesquisa.setAttribute("type", "search");
		CampoDePesquisa.setAttribute("placeholder", "Digite um Nome");
		CampoDePesquisa.setAttribute("pattern",
				"[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$");
		CampoDePesquisa.removeAttribute("minLength");
		CampoDePesquisa.removeAttribute("maxLength");
		CampoDePesquisa.removeAttribute("min");
		CampoDePesquisa.removeAttribute("max");
		break;
	case "MarcaVeiculo":
		CampoDePesquisa.setAttribute("type", "search");
		CampoDePesquisa.setAttribute("placeholder", "Digite um Marca");
		CampoDePesquisa.removeAttribute("minLength");
		CampoDePesquisa.removeAttribute("maxLength");
		CampoDePesquisa.removeAttribute("min");
		CampoDePesquisa.removeAttribute("max");
		CampoDePesquisa.removeAttribute("pattern");
		break;
	case "ModeloVeiculo":
		CampoDePesquisa.setAttribute("type", "search");
		CampoDePesquisa.setAttribute("placeholder", "Digite um Modelo");
		CampoDePesquisa.removeAttribute("minLength");
		CampoDePesquisa.removeAttribute("maxLength");
		CampoDePesquisa.removeAttribute("min");
		CampoDePesquisa.removeAttribute("max");
		CampoDePesquisa.removeAttribute("pattern");
		break;
	case "AnoVeiculo":
		CampoDePesquisa.setAttribute("type", "number");
		CampoDePesquisa.setAttribute("placeholder", "AAAA");
		CampoDePesquisa.setAttribute("min", 1980);
		CampoDePesquisa.setAttribute("max", 2016);
		CampoDePesquisa.removeAttribute("minLength");
		CampoDePesquisa.removeAttribute("maxLength");
		CampoDePesquisa.removeAttribute("pattern");
		break;
	case "CorVeiculo":
		CampoDePesquisa.setAttribute("type", "search");
		CampoDePesquisa.setAttribute("placeholder", "Digite uma Cor");
		CampoDePesquisa.setAttribute("pattern",
				"[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$");
		CampoDePesquisa.removeAttribute("minLength");
		CampoDePesquisa.removeAttribute("maxLength");
		CampoDePesquisa.removeAttribute("max");
		CampoDePesquisa.removeAttribute("min");
		break;
	case "Placa":
		CampoDePesquisa.setAttribute("type", "search");
		CampoDePesquisa.setAttribute("placeholder", "ABC1234");
		CampoDePesquisa.setAttribute("pattern", "[A-Za-z]{3}[0-9]{4}");
		CampoDePesquisa.setAttribute("minLength", 7);
		CampoDePesquisa.setAttribute("maxLength", 7);
		CampoDePesquisa.removeAttribute("min");
		CampoDePesquisa.removeAttribute("max");
		break;
	case "Chassi":
		CampoDePesquisa.setAttribute("type", "search");
		CampoDePesquisa.setAttribute("placeholder", "12.12.12345.1.1.123456");
		CampoDePesquisa.setAttribute("pattern","[A-Za-z0-9]+$");
		CampoDePesquisa.setAttribute("minLength", 17);
		CampoDePesquisa.setAttribute("maxLength", 17);
		CampoDePesquisa.removeAttribute("min");
		CampoDePesquisa.removeAttribute("max");
		break;
	case "Cidade":
		CampoDePesquisa.setAttribute("type", "search");
		CampoDePesquisa.setAttribute("placeholder", "Digite uma Cidade");
		CampoDePesquisa.setAttribute("pattern",
				"[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$");
		CampoDePesquisa.removeAttribute("minLength");
		CampoDePesquisa.removeAttribute("maxLength");
		CampoDePesquisa.setAttribute("min");
		CampoDePesquisa.setAttribute("max");
		break;
	case "Estado":
		CampoDePesquisa.setAttribute("type", "search");
		CampoDePesquisa.setAttribute("placeholder", "Digite um Estado");
		CampoDePesquisa.setAttribute("pattern",
				"[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$");
		CampoDePesquisa.removeAttribute("minLength");
		CampoDePesquisa.removeAttribute("maxLength");
		CampoDePesquisa.setAttribute("min");
		CampoDePesquisa.setAttribute("max");
		break;
	}
}
