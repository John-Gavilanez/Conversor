package ConversorTemperatura;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import ConversorMonedas.CalculoMonedas;

public class MetodoTemperatura {
	
	private String opcion;

	public MetodoTemperatura(String dato) {
		
		Object[] lista = new Object[6];

		lista [0] = "De Celsius a Fahrenheit";
		lista [1] = "De Celsius a Kelvin";
		lista [2] = "De Fahrenheit a Celsius";
		lista [3] = "De Fahrenheit a Kelvin";
		lista [4] = "De Kelvin a Celsius";
		lista [5] = "De Kelvin a Fahrenheit";
		
		opcion = (JOptionPane.showInputDialog(null, "Eleija la moneda a la que desea convertir su dinero", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, lista, "Selecciona")).toString();

		CalculosTemperatura calculo = new CalculosTemperatura(dato, opcion);

		ArrayList<String> ListaA = new ArrayList<>();

		ListaA.add(String.valueOf(lista[0]));
		ListaA.add(String.valueOf(lista[1]));
		ListaA.add(String.valueOf(lista[2]));
		ListaA.add(String.valueOf(lista[3]));
		ListaA.add(String.valueOf(lista[4]));
		ListaA.add(String.valueOf(lista[5]));

		int op = Integer.valueOf(ListaA.indexOf(opcion));

		switch (op) {

		case 0:
			
			calculo.CelsiusFahrenheit();
			JOptionPane.showMessageDialog(null, dato + " °C es igual a " + calculo.getResultado() + " °F");

			break;

		case 1:

			calculo.CelsiusKelvin();
			JOptionPane.showMessageDialog(null, dato + " °C es igual a " + calculo.getResultado() + " °K");

			break;

		case 2:

			calculo.CelsiusFahrenheit();
			JOptionPane.showMessageDialog(null, dato + " °F es igual a " + calculo.getResultado() + " °C");

			break;

		case 3:

			calculo.FahrenheitKelvin();
			JOptionPane.showMessageDialog(null, dato + " °F es igual a " + calculo.getResultado() + " °K");

			break;

		case 4:

			calculo.CelsiusKelvin();
			JOptionPane.showMessageDialog(null, dato +  " °K es igual a " + calculo.getResultado() + " °C");

			break;

		case 5:

			calculo.FahrenheitKelvin();
			JOptionPane.showMessageDialog(null, dato +  " °K es igual a " + calculo.getResultado() + " °F");

			break;

		}
	}

}
