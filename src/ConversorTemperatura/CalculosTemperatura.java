package ConversorTemperatura;

import javax.swing.JOptionPane;

public class CalculosTemperatura {
	
	String opciones;

	public String getOpciones() {
		
		Object[] opConversion = new Object[6];

		opConversion [0] = "De Celsius a Fahrenheit";
		opConversion [1] = "De Celsius a Kelvin";
		opConversion [2] = "De Fahrenheit a Celsius";
		opConversion [3] = "De Fahrenheit a Kelvin";
		opConversion [4] = "De Kelvin a Celsius";
		opConversion [5] = "De Kelvin a Fahrenheit";
		
		
		String lista = (JOptionPane.showInputDialog(null, "Eleija la moneda a la que desea convertir su dinero",
				"Monedas", JOptionPane.PLAIN_MESSAGE, null, opConversion, "Selecciona")).toString();

		
		return opciones;
	}

	public void setOpciones(String opciones) {
		this.opciones = opciones;
	}
	
	
	

}
