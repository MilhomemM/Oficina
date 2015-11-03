function mostrarConteudoOculto(radio)
	{
		var Pintura = document.getElementById("ServicoTipoPintura")
		var Mecanica = document.getElementById("ServicoTipoMecanica")
		var Funilaria = document.getElementById("ServicoTipoFunilaria")
		if(Pintura.checked == true)
		{
			document.getElementById("EntradaVeiculo").setAttribute("style","display:");
			
			document.getElementById("EntradaServico").setAttribute("style","display:");
			document.getElementById("Sevico").required = true;

			document.getElementById("EntradaCor").setAttribute("style","display:");
			document.getElementById("SevicoCor").required = true;

			document.getElementById("EntradaPeca").setAttribute("style","display:");
			document.getElementById("SevicoPeca").required = true;
			
			document.getElementById("EntradaPreco").setAttribute("style","display:");
			document.getElementById("SevicoPreco").required = true;
			
		}
		else if(Mecanica.checked == true)
		{
			document.getElementById("EntradaVeiculo").setAttribute("style","display:");
			
			document.getElementById("EntradaVeiculo").setAttribute("style","display:");
			document.getElementById("Sevico").required = true;
			
			document.getElementById("EntradaServico").setAttribute("style","display:");
			document.getElementById("Sevico").required = true;

			document.getElementById("EntradaCor").setAttribute("style","display:none");
			document.getElementById("SevicoCor").required = false;

			document.getElementById("EntradaPeca").setAttribute("style","display:none");
			document.getElementById("SevicoPeca").required = false;
			
			document.getElementById("EntradaPreco").setAttribute("style","display:");
			document.getElementById("SevicoPreco").required = true;
		}
		else if(Funilaria.checked == true)
		{
			document.getElementById("EntradaVeiculo").setAttribute("style","display:");
			
			document.getElementById("EntradaVeiculo").setAttribute("style","display:");
			document.getElementById("Sevico").required = true;
			
			document.getElementById("EntradaServico").setAttribute("style","display:");
			document.getElementById("Sevico").required = true;

			document.getElementById("EntradaCor").setAttribute("style","display:none");
			document.getElementById("SevicoCor").required = false;

			document.getElementById("EntradaPeca").setAttribute("style","display:");
			document.getElementById("SevicoPeca").required = true;
			
			document.getElementById("EntradaPreco").setAttribute("style","display:");
			document.getElementById("SevicoPreco").required = true;
		}
		else
		{
			document.getElementById("EntradaVeiculo").setAttribute("style","display:none");
			document.getElementById("EntradaServico").setAttribute("style","display:none");
			document.getElementById("Sevico").required = false;
			document.getElementById("EntradaCor").setAttribute("style","display:none");
			document.getElementById("SevicoCor").required = false;
			document.getElementById("EntradaPeca").setAttribute("style","display:none");
			document.getElementById("SevicoPeca").required = false;
			document.getElementById("EntradaPreco").setAttribute("style","display:none");
			document.getElementById("SevicoPreco").required = false;
		}
	}
