function verificarCheckbox() {
	var checkP = document.getElementById("ConsertoCheckP");
	var checkF = document.getElementById("ConsertoCheckF");
	var checkM = document.getElementById("ConsertoCheckM");

	if (checkP.checked || checkF.checked || checkM.checked)
		return true;
	else {
		alert("É preciso escolher no mínimo um serviço.");
		return false;
	}
}

function swapDisplay() {
	var checkP = document.getElementById("ConsertoCheckP");
	var checkF = document.getElementById("ConsertoCheckF");
	var checkM = document.getElementById("ConsertoCheckM");

	var textP = document.getElementById("ConsertoCodigoPintura");
	var textF = document.getElementById("ConsertoCodigoFunilaria");
	var textM = document.getElementById("ConsertoCodigoMecanica");

	if (checkP.checked) {
		textP.setAttribute("style", "display:");
		textP.setAttribute("required", true);
	} else {
		textP.setAttribute("style", "display:none");
		textP.removeAttribute("required");
	}

	if (checkF.checked) {
		textF.setAttribute("style", "display:");
		textF.setAttribute("required", true);
	} else {
		textF.setAttribute("style", "display:none");
		textF.removeAttribute("required");
	}

	if (checkM.checked) {
		textM.setAttribute("style", "display:");
		textM.setAttribute("required", true);
	} else {
		textM.setAttribute("style", "display:none");
		textM.removeAttribute("required");
	}
}