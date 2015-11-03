function mostrarTabela()
{
	var radioTodos = document.getElementById("Todos");
	var radioPintura = document.getElementById("Pintura");
	var radioFunilaria = document.getElementById("Funilaria");
	var radioMecanica = document.getElementById("Mecanica");
	
	var linhaPintura = document.getElementsByClassName("TipoPintura");
	var linhaFunilaria = document.getElementsByClassName("TipoFunilaria");
	var linhaMecanica = document.getElementsByClassName("TipoMecanica");
	
	var colunaVeiculo = document.getElementsByClassName("ColunaVeiculo");
	var colunaTipoServico = document.getElementsByClassName("ColunaTipoServico");
	var colunaServico = document.getElementsByClassName("ColunaServico");
	var colunaCor = document.getElementsByClassName("ColunaCor");
	var colunaPeca = document.getElementsByClassName("ColunaPeca");
	var colunaPreco = document.getElementsByClassName("ColunaPreco");
	
	if(radioTodos.checked == true)
	{
		for(i=0; i<linhaPintura.length; i++)
		{
			linhaPintura.item(i).setAttribute("style","display:");
		}
		for(i=0; i<linhaFunilaria.length; i++)
		{
			linhaFunilaria.item(i).setAttribute("style","display:");
		}
		for(i=0; i<linhaMecanica.length; i++)
		{
			linhaMecanica.item(i).setAttribute("style","display:");
		}
		
		for(i=0; i<colunaVeiculo.length; i++)
		{
			colunaVeiculo.item(i).setAttribute("style","display:");
		}
		for(i=0; i<colunaTipoServico.length; i++)
		{
			colunaTipoServico.item(i).setAttribute("style","display:");
		}
		for(i=0; i<colunaServico.length; i++)
		{
			colunaServico.item(i).setAttribute("style","display:");
		}
		for(i=0; i<colunaCor.length; i++)
		{
			colunaCor.item(i).setAttribute("style","display:");
		}
		for(i=0; i<colunaPeca.length; i++)
		{
			colunaPeca.item(i).setAttribute("style","display:");
		}
		for(i=0; i<colunaPreco.length; i++)
		{
			colunaPreco.item(i).setAttribute("style","display:");
		}
	}
	else if(radioPintura.checked == true)
	{
		for(i=0; i<linhaPintura.length; i++)
		{
			linhaPintura.item(i).setAttribute("style","display:");
		}
		for(i=0; i<linhaFunilaria.length; i++)
		{
			linhaFunilaria.item(i).setAttribute("style","display:none");
		}
		for(i=0; i<linhaMecanica.length; i++)
		{
			linhaMecanica.item(i).setAttribute("style","display:none");
		}
		
		for(i=0; i<colunaVeiculo.length; i++)
		{
			colunaVeiculo.item(i).setAttribute("style","display:");
		}
		for(i=0; i<colunaTipoServico.length; i++)
		{
			colunaTipoServico.item(i).setAttribute("style","display:");
		}
		for(i=0; i<colunaServico.length; i++)
		{
			colunaServico.item(i).setAttribute("style","display:");
		}
		for(i=0; i<colunaCor.length; i++)
		{
			colunaCor.item(i).setAttribute("style","display:");
		}
		for(i=0; i<colunaPeca.length; i++)
		{
			colunaPeca.item(i).setAttribute("style","display:");
		}
		for(i=0; i<colunaPreco.length; i++)
		{
			colunaPreco.item(i).setAttribute("style","display:");
		}
	}
	else if(radioFunilaria.checked == true)
	{
		for(i=0; i<linhaPintura.length; i++)
		{
			linhaPintura.item(i).setAttribute("style","display:none");
		}
		for(i=0; i<linhaFunilaria.length; i++)
		{
			linhaFunilaria.item(i).setAttribute("style","display:");
		}
		for(i=0; i<linhaMecanica.length; i++)
		{
			linhaMecanica.item(i).setAttribute("style","display:none");
		}
			
		for(i=0; i<colunaVeiculo.length; i++)
		{
			colunaVeiculo.item(i).setAttribute("style","display:");
		}
		for(i=0; i<colunaTipoServico.length; i++)
		{
			colunaTipoServico.item(i).setAttribute("style","display:");
		}
		for(i=0; i<colunaServico.length; i++)
		{
			colunaServico.item(i).setAttribute("style","display:");
		}
		for(i=0; i<colunaCor.length; i++)
		{
			colunaCor.item(i).setAttribute("style","display:none");
		}
		for(i=0; i<colunaPeca.length; i++)
		{
			colunaPeca.item(i).setAttribute("style","display:");
		}
		for(i=0; i<colunaPreco.length; i++)
		{
			colunaPreco.item(i).setAttribute("style","display:");
		}
	}
	else if(radioMecanica.checked == true)
	{

		for(i=0; i<linhaPintura.length; i++)
		{
			linhaPintura.item(i).setAttribute("style","display:none");
		}
		for(i=0; i<linhaFunilaria.length; i++)
		{
			linhaFunilaria.item(i).setAttribute("style","display:none");
		}
		for(i=0; i<linhaMecanica.length; i++)
		{
			linhaMecanica.item(i).setAttribute("style","display:");
		}
		
		for(i=0; i<colunaVeiculo.length; i++)
		{
			colunaVeiculo.item(i).setAttribute("style","display:");
		}
		for(i=0; i<colunaTipoServico.length; i++)
		{
			colunaTipoServico.item(i).setAttribute("style","display:");
		}
		for(i=0; i<colunaServico.length; i++)
		{
			colunaServico.item(i).setAttribute("style","display:");
		}
		for(i=0; i<colunaCor.length; i++)
		{
			colunaCor.item(i).setAttribute("style","display:none");
		}
		for(i=0; i<colunaPeca.length; i++)
		{
			colunaPeca.item(i).setAttribute("style","display:none");
		}
		for(i=0; i<colunaPreco.length; i++)
		{
			colunaPreco.item(i).setAttribute("style","display:");
		}
	}
}
