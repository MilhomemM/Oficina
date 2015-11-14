// JavaScript Document

function confirmar(mensagem) {
	if (confirm(mensagem))
		return true;
	else
		return false;
}

function encaminhar(destino) {
	location.href = destino;
}

function encaminharConfirm(destino, mensagem) {
	if (confirm(mensagem))
		location.href = destino;
}

function comparar(string1, string2, msgErro) {
	var entrada = document.getElementsByName(string1)[0].value;

	if (entrada.localeCompare(string2) == 0)
		return true;
	else {
		alert(msgErro);
		return false;
	}
}

function autoTab(origem, idDestino) {
	var destino = document.getElementById(idDestino);
	if (origem.getAttribute
			&& origem.value.length == origem.getAttribute("maxlength")) {
		destino.focus();

	}
}

//onInvalid="balaozin(this,'olá')"
function balaozin(origem, mensagem) {
	origem.setCustomValidity(mensagem);
}