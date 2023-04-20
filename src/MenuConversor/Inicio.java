package MenuConversor;

import javax.swing.JOptionPane;

import ConversorMonedas.MetodosMonedas;
import ConversorTemperatura.CalculosTemperatura;

public class Inicio {

	public static void main(String[] args) {
		
		int inicio = 0;
		
		while(inicio==0) {
			
			String seleccion = (JOptionPane.showInputDialog(null, "Seleccione el tipo de conversor", "Conversor",
					JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Conversor de moneda", "Conversor de Temperatura" },
					"selecciopna")).toString();

			String dato = JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea convertir");

			if (seleccion == "Conversor de moneda") {
				
				MetodosMonedas conversorMonedas = new MetodosMonedas(dato);
				//System.out.println(JOptionPane.showConfirmDialog(null,"¿Desea Continuar?"));

			}

			
			if (seleccion == "Conversor de Temperatura") {

				CalculosTemperatura conversorTemperaturas = new CalculosTemperatura();
				conversorTemperaturas.getOpciones();

			}
			
			inicio = JOptionPane.showConfirmDialog(null,"¿Desea Continuar?");
			
		}	

	}

}
