package ConversorMonedas;

import javax.swing.JOptionPane;

import MenuConversor.Inicio;

public class MetodosMonedas {

private String opcion;

	public MetodosMonedas (String dato){
		
		Object[] lista = new Object[8];

		lista[0] = "De Dólar a Euros";
		lista[1] = "De Dólar a Libras Esterlinas";
		lista[2] = "De Dólar a Yen Japonés";
		lista[3] = "De Dólar a Won sul-coreano";
		lista[4] = "De Euros a Dólar";
		lista[5] = "De Libras Esterlinas a Dólar";
		lista[6] = "De Yen Japonés a Dólar";
		lista[7] = "De Won sul-coreano a Dólar";

		opcion = (JOptionPane.showInputDialog(null, "Eleija la moneda a la que desea convertir su dinero", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, lista, "Selecciona")).toString();
		
		
		
		
		
		
		CalculoMonedas operaciones = new CalculoMonedas(opcion, Double.valueOf(dato));
		
		JOptionPane.showMessageDialog(null, operaciones.getResultado());
		
	}



}
