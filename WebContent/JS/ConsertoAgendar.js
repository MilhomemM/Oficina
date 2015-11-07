function filtrarOpcoes()
{
    var radioCarro = document.getElementById("ServicoTipoVeiculoCarro");
    var radioMoto = document.getElementById("ServicoTipoVeiculoMoto");

    var opcoesCarro = document.getElementsByClassName("optionCarro");
    var opcoesMoto = document.getElementsByClassName("optionMoto");
    if (radioCarro.checked == true)
    {
        for (i = 0; i < opcoesCarro.length; i++)
        {
            opcoesCarro.item(i).setAttribute("style", "display:");
        }
        for (i = 0; i < opcoesMoto.length; i++)
        {
            opcoesMoto.item(i).setAttribute("style", "display:none");
        }

    }
    else if (radioMoto.checked == true)
    {
        for (i = 0; i < opcoesCarro.length; i++)
        {
            opcoesCarro.item(i).setAttribute("style", "display:none");
        }
        for (i = 0; i < opcoesMoto.length; i++)
        {
            opcoesMoto.item(i).setAttribute("style", "display:");
        }
    }
    else
    {
        for (i = 0; i < opcoesCarro.length; i++)
        {
            opcoesCarro.item(i).setAttribute("style", "display:none");
        }
        for (i = 0; i < opcoesMoto.length; i++)
        {
            opcoesMoto.item(i).setAttribute("style", "display:none");
        }
    }

    document.getElementById("ServicoPintura").options[0].selected = "true";
    document.getElementById("ServicoPinturaCor").options[0].selected = "true";
    document.getElementById("ServicoPinturaPeca").options[0].selected = "true";
    document.getElementById("ServicoPinturaPreco").setAttribute("value", "00,00");

    document.getElementById("ServicoFunilaria").options[0].selected = "true";;
    document.getElementById("ServicoFunilariaPeca").options[0].selected = "true";
    document.getElementById("ServicoFunilariaPreco").setAttribute("value", "00,00");

    document.getElementById("ServicoMecanica").options[0].selected = "true";
    document.getElementById("ServicoMecanicaPreco").setAttribute("value", "00,00");

    valorTotal();
}

function mostrarConteudoOculto()
{
    var Pintura = document.getElementById("ServicoTipoPintura");
    var Mecanica = document.getElementById("ServicoTipoMecanica");
    var Funilaria = document.getElementById("ServicoTipoFunilaria");

    if (Pintura.checked == true)
    {
        document.getElementById("FormServicoPintura").style.display = "";
        document.getElementById("FormServicoPintura").style.height = "150px";

        document.getElementById("ServicoPintura").setAttribute("required", "true");
        document.getElementById("ServicoPinturaCor").setAttribute("required", "true");
        document.getElementById("ServicoPinturaPeca").setAttribute("required", "true");
        document.getElementById("ServicoPinturaPreco").setAttribute("required", "true");
    }
    else
    {
        document.getElementById("FormServicoPintura").style.display = "none";
        document.getElementById("FormServicoPintura").style.height = "";

        document.getElementById("ServicoPintura").options[0].selected = "true";
        document.getElementById("ServicoPinturaCor").options[0].selected = "true";
        document.getElementById("ServicoPinturaPeca").options[0].selected = "true";
        document.getElementById("ServicoPinturaPreco").setAttribute("value", "00,00");

        document.getElementById("ServicoPintura").required = false;
        document.getElementById("ServicoPinturaCor").required = false;;
        document.getElementById("ServicoPinturaPeca").required = false;;
        document.getElementById("ServicoPinturaPreco").required = false;;
    }

    if (Funilaria.checked == true)
    {
        document.getElementById("FormServicoFunilaria").style.display = "";
        document.getElementById("FormServicoFunilaria").style.height = "150px";

        document.getElementById("ServicoFunilaria").setAttribute("required", "true");
        document.getElementById("ServicoFunilariaPeca").setAttribute("required", "true");
        document.getElementById("ServicoFunilariaPreco").setAttribute("required", "true");
    }
    else
    {
        document.getElementById("FormServicoFunilaria").style.display = "none";
        document.getElementById("FormServicoFunilaria").style.height = "";

        document.getElementById("ServicoFunilaria").options[0].selected = "true";;
        document.getElementById("ServicoFunilariaPeca").options[0].selected = "true";
        document.getElementById("ServicoFunilariaPreco").setAttribute("value", "00,00");

        document.getElementById("ServicoFunilaria").required = false;;
        document.getElementById("ServicoFunilariaPeca").required = false;;
        document.getElementById("ServicoFunilariaPreco").required = false;;
    }

    if (Mecanica.checked == true)
    {
        document.getElementById("FormServicoMecanica").style.display = "";
        document.getElementById("FormServicoMecanica").style.height = "150px";

        document.getElementById("ServicoMecanica").setAttribute("required", "true");
        document.getElementById("ServicoMecanicaPreco").setAttribute("required", "true");
    }
    else
    {
        document.getElementById("FormServicoMecanica").style.display = "none";
        document.getElementById("FormServicoMecanica").style.height = "";

        document.getElementById("ServicoMecanica").options[0].selected = "true";
        document.getElementById("ServicoMecanicaPreco").setAttribute("value", "00,00");

        document.getElementById("ServicoMecanica").required = false;;
        document.getElementById("ServicoMecanicaPreco").required = false;;
    }
    valorTotal();
}

function valorPintura()
{
    var CheckPintura = document.getElementById("ServicoTipoPintura");
    var SelectServico = document.getElementById("ServicoPintura");
    var SelectCor = document.getElementById("ServicoPinturaCor");
    var SelectPeca = document.getElementById("ServicoPinturaPeca");
    var PrecoPintura = document.getElementById("ServicoPinturaPreco");

    if (CheckPintura.checked == true)
    {
        if (SelectServico.value.localeCompare("") != 0)
        {
            if (SelectCor.value.localeCompare("") != 0)
            {
                if (SelectPeca.value.localeCompare("") != 0)
                {
                    if (SelectServico.value.localeCompare("Tira Risco") == 0 && SelectCor.value.localeCompare("Vermelho") == 0 && SelectPeca.value.localeCompare("Porta Lateral Direita") == 0)
                    {
                        PrecoPintura.setAttribute("value", "300,00");
                    }
                    else if (SelectServico.value.localeCompare("Pintura Completa") == 0 && SelectCor.value.localeCompare("Preto") == 0 && SelectPeca.value.localeCompare("Tanque") == 0)
                    {
                        PrecoPintura.setAttribute("value", "400,00");
                    }
                }
                else
                {
                    PrecoPintura.setAttribute("value", "00,00");
                }
            }
            else
            {
                PrecoPintura.setAttribute("value", "00,00");
            }
        }
        else
        {
            PrecoPintura.setAttribute("value", "00,00");
        }
    }
    else
    {
        PrecoPintura.setAttribute("value", "00,00");
    }
    valorTotal();
}

function valorFunilaria()
{
    var CheckFunilaria = document.getElementById("ServicoTipoFunilaria");
    var SelectServico = document.getElementById("ServicoFunilaria");
    var SelectPeca = document.getElementById("ServicoFunilariaPeca");
    var PrecoFunilaria = document.getElementById("ServicoFunilariaPreco");

    if (CheckFunilaria.checked == true)
    {
        if (SelectServico.value.localeCompare("") != 0)
        {
            if (SelectPeca.value.localeCompare("") != 0)
            {
                if (SelectServico.value.localeCompare("Martelinho De Ouro") == 0 && SelectPeca.value.localeCompare("Parachoque") == 0)
                {
                    PrecoFunilaria.setAttribute("value", "600,00");
                }
                else if (SelectServico.value.localeCompare("Desamassamento") == 0 && SelectPeca.value.localeCompare("Paralama Frontal") == 0)
                {
                    PrecoFunilaria.setAttribute("value", "250,00");
                }
            }
            else
            {
                PrecoFunilaria.setAttribute("value", "00,00");
            }
        }
        else
        {
            PrecoFunilaria.setAttribute("value", "00,00");
        }
    }
    else
    {
        PrecoFunilaria.setAttribute("value", "00,00");
    }
    valorTotal();
}

function valorMecanica()
{
    var CheckMecanica = document.getElementById("ServicoTipoMecanica");
    var SelectServico = document.getElementById("ServicoMecanica");
    var PrecoMecanica = document.getElementById("ServicoMecanicaPreco");

    if (CheckMecanica.checked == true)
    {
        if (SelectServico.value.localeCompare("") != 0)
        {
            if (SelectServico.value.localeCompare("Troca De Óleo") == 0)
            {
                PrecoMecanica.setAttribute("value", "150,00");
            }
            else if (SelectServico.value.localeCompare("Troca De Fluído De Freio") == 0)
            {
                PrecoMecanica.setAttribute("value", "90,00");
            }
        }
        else
        {
            PrecoMecanica.setAttribute("value", "00,00");
        }
    }
    else
    {
        PrecoMecanica.setAttribute("value", "00,00");
    }
    valorTotal();
}

function stringToMoeda(string)
{
    string = string.replace(",", ".");
    return parseFloat(string);
}

function moedaToString(moeda)
{
    var string = moeda.toString();
    string = string.replace(".", ",");
    return string;
}

function valorTotal()
{
    var PrecoTotal = document.getElementById("ConsertoTotal");

    var PrecoPintura = document.getElementById("ServicoPinturaPreco");
    var PrecoFunilaria = document.getElementById("ServicoFunilariaPreco");
    var PrecoMecanica = document.getElementById("ServicoMecanicaPreco");

    var CheckPintura = document.getElementById("ServicoTipoPintura");
    var CheckFunilaria = document.getElementById("ServicoTipoFunilaria");
    var CheckMecanica = document.getElementById("ServicoTipoMecanica");

    var acumulador = 0.00;

    if (CheckPintura.checked == true)
    {
        acumulador += stringToMoeda(PrecoPintura.value);
    }
    if (CheckFunilaria.checked == true)
    {
        acumulador += stringToMoeda(PrecoFunilaria.value);
    }
    if (CheckMecanica.checked == true)
    {
        acumulador += stringToMoeda(PrecoMecanica.value);
    }

    PrecoTotal.setAttribute("value", moedaToString(acumulador));
}

function validarSubmit()
{
    var Proprietario = document.getElementById("VeiculoProprietario");
    var TipoVeiculoCarro = document.getElementById("ServicoTipoVeiculoCarro");
    var TipoVeiculoMoto = document.getElementById("ServicoTipoVeiculoMoto");
    var VeiculoPlaca = document.getElementById("VeiculoPlaca");
    var CheckPintura = document.getElementById("ServicoTipoPintura");
    var CheckFunilaria = document.getElementById("ServicoTipoFunilaria");
    var CheckMecanica = document.getElementById("ServicoTipoMecanica");
    var Data = document.getElementById("ConsertoData");

    if (!CheckPintura.checked && !CheckFunilaria.checked && !CheckMecanica.checked)
    {
        alert("Pelo menos um serviço deve ser selecionado");
        return false;
    }
    else if (Proprietario.value.localeCompare("Flavio Alves da Costa") == 0)
    {
        if (TipoVeiculoMoto.checked)
        {
            alert("Esse cliente não possui esse tipo de veículo");
            return false;
        }
        else
        {
            if (VeiculoPlaca.value.localeCompare("NXZ2015") == 0)
            {
                if (Data.value.toString().localeCompare("2015-04-16") == 0)
                {
                    alert("Ja há um conserto para esse mesmo veículo neste dia");
                    return false;
                }
                else
                {
                    return true;
                }
            }
            else if (VeiculoPlaca.value.localeCompare("ABC0532") == 0)
            {
                alert("Veículo pertencente à outro cliente");
                return false;
            }
            else
            {
                alert("Veículo não encontrado");
                return false;
            }
        }
    }
}
