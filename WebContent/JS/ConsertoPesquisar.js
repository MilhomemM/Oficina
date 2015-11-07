function switchPlaceholder() {
		var TipoDePesquisa = document.getElementById("TipoDePesquisa");
		var CampoDePesquisa = document.getElementById("CampoDePesquisa");

		switch (TipoDePesquisa.value) {
		case "":
			CampoDePesquisa.setAttribute("placeholder",
					"Selecione uma opção...");
			break;
		case "Codigo":
			CampoDePesquisa.setAttribute("placeholder", "Cod###");
			break;
		case "Nome":
			CampoDePesquisa.setAttribute("placeholder", "Informe o Nome");
			break;
		case "Placa":
			CampoDePesquisa.setAttribute("placeholder", "Informe a Placa do Veiculo");
			break;
		case "Data":
			CampoDePesquisa.setAttribute("placeholder", "Informe a Data");
			break;
		case "TipoServico":
			CampoDePesquisa.setAttribute("placeholder", "Descrição do serviço");
			break;
		case "Preco":
			CampoDePesquisa.setAttribute("placeholder",
					"Informe o Preço Máximo");
			break;
		}
	}
