function switchPlaceholder() {
		var TipoDePesquisa = document.getElementById("TipoDePesquisa");
		var CampoDePesquisa = document.getElementById("CampoDePesquisa");

		switch (TipoDePesquisa.value) {
		case "":
			CampoDePesquisa.setAttribute("type","search")
			CampoDePesquisa.setAttribute("placeholder",
					"Selecione uma opção...");
			CampoDePesquisa.removeAttribute("Pattern");
			
			break;
		case "Codigo":
			CampoDePesquisa.setAttribute("type","search");
			CampoDePesquisa.setAttribute("Pattern","[A-Za-z1-9]+$");
			CampoDePesquisa.setAttribute("placeholder", "Informe o Código do Conserto");
			break;
		case "NomeCliente":
			CampoDePesquisa.setAttribute("type","search");
			CampoDePesquisa.setAttribute("pattern","[A-Za-z]+$");
			CampoDePesquisa.setAttribute("placeholder", "Informe o Nome");
			break;
		case "PlacaVeiculo":
			CampoDePesquisa.setAttribute("type","search");
			CampoDePesquisa.setAttribute("pattern","[A-Za-z]{3}[0-9]{4}");
			CampoDePesquisa.setAttribute("placeholder", "Informe a Placa do Veiculo");
			break;
		case "Data":
			CampoDePesquisa.setAttribute("type","date");
			CampoDePesquisa.setAttribute("placeholder", "Informe a Data");
			CampoDePesquisa.removeAttribute("pattern");
			break;
		case "TipoServico":
			CampoDePesquisa.setAttribute("type","search");
			CampoDePesquisa.setAttribute("pattern","[A-Za-z]+$");
			CampoDePesquisa.setAttribute("placeholder", "Descrição do serviço");
			break;
		}
	}
