package model;

import java.util.Calendar;
import java.util.Date;

public class Data {
	private Date data;

	public Data() {
		this.data = new Date();
	}

	// dd/MM/yyyy 0 1 2
	public Data(String data) {
		Calendar dt = Calendar.getInstance();
		dt.set(Calendar.DAY_OF_MONTH, Integer.parseInt(data.split("/")[0]));
		dt.set(Calendar.MONTH, Integer.parseInt(data.split("/")[1]));
		dt.set(Calendar.YEAR, Integer.parseInt(data.split("/")[2]));
		this.data = dt.getTime();
	}

	public Data(int dia, int mes, int ano) {
		Calendar dt = Calendar.getInstance();
		dt.set(Calendar.DAY_OF_MONTH, dia);
		dt.set(Calendar.MONTH, mes);
		dt.set(Calendar.YEAR, ano);
		this.data = dt.getTime();
	}

	public Date getData() {
		return this.data;
	}

	public Date returnDate(int dia, int mes, int ano) {
		Calendar dt = Calendar.getInstance();
		dt.set(Calendar.DAY_OF_MONTH, dia);
		dt.set(Calendar.MONTH, mes);
		dt.set(Calendar.YEAR, ano);
		return dt.getTime();
	}

	public Date returnDate(String data) {
		Calendar dt = Calendar.getInstance();
		// 01 2 34 5 6789
		// dd / MM / yyyy
		int dia = Integer.parseInt(data.substring(0, 2));
		int mes = Integer.parseInt(data.substring(3, 5));
		int ano = Integer.parseInt(data.substring(6, data.length()));

		dt.set(Calendar.DAY_OF_MONTH, dia);
		dt.set(Calendar.MONTH, mes);
		dt.set(Calendar.YEAR, ano);

		// dt.set(Calendar.DAY_OF_MONTH, Integer.parseInt(data.split("/")[0]));
		// dt.set(Calendar.MONTH, Integer.parseInt(data.split("/")[1]));
		// dt.set(Calendar.YEAR, Integer.parseInt(data.split("/")[2]));
		return dt.getTime();
	}

	public Date returnDateInvertido(String data) {
		Calendar dt = Calendar.getInstance();
		// 0123 4 56 7 89
		// yyyy - MM - dd
		int dia = Integer.parseInt(data.substring(8, data.length()));
		int mes = Integer.parseInt(data.substring(5, 7));
		int ano = Integer.parseInt(data.substring(0, 4));

		dt.set(Calendar.DAY_OF_MONTH, dia);
		dt.set(Calendar.MONTH, mes);
		dt.set(Calendar.YEAR, ano);

		// dt.set(Calendar.DAY_OF_MONTH, Integer.parseInt(data.split("/")[0]));
		// dt.set(Calendar.MONTH, Integer.parseInt(data.split("/")[1]));
		// dt.set(Calendar.YEAR, Integer.parseInt(data.split("/")[2]));
		return dt.getTime();
	}

	public String filtroData(Date data) {
		Calendar dt = Calendar.getInstance();
		dt.setTime(data);

		String dia = String.valueOf(dt.get(Calendar.DAY_OF_MONTH));
		String mes = String.valueOf(dt.get(Calendar.MONTH));
		String ano = String.valueOf(dt.get(Calendar.YEAR));

		while (dia.length() < 2)
			dia = "0" + dia;
		while (mes.length() < 2)
			mes = "0" + mes;
		while (ano.length() < 4)
			ano = "0" + ano;

		String dataFormatada = dia + "/" + mes + "/" + ano;

		return dataFormatada;
	}
}
