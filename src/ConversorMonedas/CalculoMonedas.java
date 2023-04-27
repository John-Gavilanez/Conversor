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
			this.resultado = (double) Math.round((this.dato * 0.9067) * 100000d) / 100000;
		}

		if (tipo == "De Euros a Dólar") {
			this.resultado = (double) Math.round((this.dato * 1.1024) * 100000d) / 100000;
		}
	}

	public void DolarLibrasEsterlinas() {

		if (tipo == "De Dólar a Libras Esterlinas") {
			this.resultado = (double) Math.round((this.dato * 0.8002) * 100000d) / 100000;
		}

		if (tipo == "De Libras Esterlinas a Dólar") {
			this.resultado = (double) Math.round((this.dato * 1.2498) * 100000d) / 100000;
		}

	}

	public void DolarYenJapones() {

		if (tipo == "De Dólar a Yen Japonés") {
			this.resultado = (double) Math.round((this.dato * 134.0205) * 100000d) / 100000;
		}

		if (tipo == "De Yen Japonés a Dólar") {
			this.resultado = (double) Math.round((this.dato * 0.0075) * 100000d) / 100000;
		}

	}

	public void DolarWonsurcoreano() {

		if (tipo == "De Dólar a Won sur-coreano") {
			this.resultado = (double) Math.round((this.dato * 1339.5650) * 100000d) / 100000;
		}

		if (tipo == "De Won sul-coreano a Dólar") {
			this.resultado = (double) Math.round((this.dato * 0.00075) * 100000d) / 100000;
		}

	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

}
