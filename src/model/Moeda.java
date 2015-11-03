package model;

import java.math.BigDecimal;

public class Moeda {
	private BigDecimal valor;

	public Moeda(String valor) {
		// 1234567,89
		valor.replace(',', '.');
		this.valor = new BigDecimal(valor);
	}

	public String getValor() {
		return this.valor.toString();
	}
}
