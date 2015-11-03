function mostrarConteudoOculto(radio)
	{
		if(radio.value.localeCompare("Pintura") == 0)
		{
			document.servicoFormCadastroPintura.style.display = "";
			document.servicoFormCadastroMecanica.style.display = "none";
			document.servicoFormCadastroFunilaria.style.display = "none";
		}
		else if(radio.value.localeCompare("Mecanica") == 0)
		{
			document.servicoFormCadastroPintura.style.display = "none";
			document.servicoFormCadastroMecanica.style.display = "";
			document.servicoFormCadastroFunilaria.style.display = "none";
		}
		else if(radio.value.localeCompare("Funilaria") == 0)
		{
			document.servicoFormCadastroPintura.style.display = "none";
			document.servicoFormCadastroMecanica.style.display = "none";
			document.servicoFormCadastroFunilaria.style.display = "";
		}
		else
		{
			document.servicoFormCadastroPintura.style.display = "none";
			document.servicoFormCadastroMecanica.style.display = "none";
			document.servicoFormCadastroFunilaria.style.display = "none";
		}
	}
