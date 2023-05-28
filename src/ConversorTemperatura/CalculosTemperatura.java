package ConversorTemperatura;

public class CalculosTemperatura {
	
	private double dato;
	private double resultado;
	private String tipo;

	public CalculosTemperatura(String dato, String tipo) {
		this.dato = Double.valueOf(dato);
		this.tipo = tipo;

	}

	public void CelsiusFahrenheit() {
		
		if (tipo =="De Celsius a Fahrenheit") {
			this.resultado = (double) Math.round(((this.dato * 9/5) + 32) * 100000d) / 100000;
		}
		
		if (tipo=="De Fahrenheit a Celsius") {
			this.resultado = (double) Math.round(((this.dato - 32)* 5/9) * 100000d) / 100000;
		}
	}

	public void CelsiusKelvin() {
		
		if (tipo =="De Celsius a Kelvin") {
			this.resultado = (double) Math.round((this.dato + 273.15) * 100000d) / 100000;
		}
		
		if (tipo =="De Kelvin a Celsius") {
			this.resultado = (double) Math.round((this.dato - 273.15) * 100000d) / 100000;
		}
	}

	public void FahrenheitKelvin() {
		
		if (tipo =="De Fahrenheit a Kelvin") {
			this.resultado = (double) Math.round((((5*(this.dato-32))/9) + 273.15) * 100000d) / 100000;
		}
		
		if (tipo =="De Kelvin a Fahrenheit") {
			this.resultado = (double) Math.round((((9*(this.dato - 273.15))/5)+32) * 100000d) / 100000;
		}
		
	}
	
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	
	



}
