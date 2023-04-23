package ConversorMonedas;

public class CalculoMonedas {

	private double dato;
	private double resultado;
	private String tipo;

	public CalculoMonedas(String dato, String tipo) {
		this.dato = Double.valueOf(dato);
		this.tipo = tipo;
	}

	public void DolarEuros() {

		if (tipo == "De Dólar a Euros") {
			this.resultado = this.dato * 0.90;
		}

		if (tipo == "De Euros a Dólar") {
			this.resultado = this.dato * 1.11;
		}
	}

	public void DolarLibrasEsterlinas() {

		if (tipo == "De Dólar a Libras Esterlinas") {
			this.resultado = this.dato * 0.80;
		}

		if (tipo == "De Libras Esterlinas a Dólar") {
			this.resultado = this.dato * 1.24;
		}

	}

	public void DolarYenJapones() {

		if (tipo == "De Dólar a Yen Japonés") {
			this.resultado = this.dato * 134.17;
			System.out.println(tipo);
		}

		if (tipo == "De Yen Japonés a Dólar") {
			this.resultado = this.dato * 0.0075;
			System.out.println(tipo);
		}

	}

	public void DolarWonsurcoreano() {
		this.resultado = this.dato * 1330.37;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

}
