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
}
