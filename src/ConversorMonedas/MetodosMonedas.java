package ConversorMonedas;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import MenuConversor.Inicio;

public class MetodosMonedas {

	private String opcion;

	public MetodosMonedas(String dato) {

		Object[] lista = new Object[8];

		lista[0] = "De Dólar a Euros";
		lista[1] = "De Dólar a Libras Esterlinas";
		lista[2] = "De Dólar a Yen Japonés";
		lista[3] = "De Dólar a Won sur-coreano";
		lista[4] = "De Euros a Dólar";
		lista[5] = "De Libras Esterlinas a Dólar";
		lista[6] = "De Yen Japonés a Dólar";
		lista[7] = "De Won sul-coreano a Dólar";

		opcion = (JOptionPane.showInputDialog(null, "Eleija la moneda a la que desea convertir su dinero", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, lista, "Selecciona")).toString();

		CalculoMonedas calculo = new CalculoMonedas(dato, opcion);

		ArrayList<String> ListaA = new ArrayList<>();

		ListaA.add(String.valueOf(lista[0]));
		ListaA.add(String.valueOf(lista[1]));
		ListaA.add(String.valueOf(lista[2]));
		ListaA.add(String.valueOf(lista[3]));
		ListaA.add(String.valueOf(lista[4]));
		ListaA.add(String.valueOf(lista[5]));
		ListaA.add(String.valueOf(lista[6]));
		ListaA.add(String.valueOf(lista[7]));

		int op = Integer.valueOf(ListaA.indexOf(opcion));

		switch (op) {

		case 0:

			calculo.DolarEuros();
			JOptionPane.showMessageDialog(null, "Tienes € " + calculo.getResultado() + " Euros");

			break;

		case 1:

			calculo.DolarLibrasEsterlinas();
			JOptionPane.showMessageDialog(null, "Tienes £ " + calculo.getResultado() + " Libras Esterlinas");

			break;

		case 2:

			calculo.DolarYenJapones();
			JOptionPane.showMessageDialog(null, "Tienes ¥ " + calculo.getResultado() + " Yen Japonés");

			break;

		case 3:

			calculo.DolarWonsurcoreano();
			JOptionPane.showMessageDialog(null, "Tienes ₩ " + calculo.getResultado() + " Won Surcoreano");

			break;

		case 4:

			calculo.DolarEuros();
			JOptionPane.showMessageDialog(null, "Tienes $ " + calculo.getResultado() + " Dólares");

			break;

		case 5:

			calculo.DolarLibrasEsterlinas();
			JOptionPane.showMessageDialog(null, "Tienes $ " + calculo.getResultado() + " Dólares");

			break;

		case 6:

			calculo.DolarYenJapones();
			JOptionPane.showMessageDialog(null, "Tienes $ " + calculo.getResultado() + " Dólares");

			break;

		case 7:

			calculo.DolarWonsurcoreano();
			JOptionPane.showMessageDialog(null, "Tienes $ " + calculo.getResultado() + " Dólares");

			break;

		}

	}

}
