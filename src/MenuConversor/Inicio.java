package MenuConversor;

import javax.swing.JOptionPane;

import ConversorMonedas.MetodosMonedas;
import ConversorTemperatura.CalculosTemperatura;

public class Inicio {

	public static void main(String[] args) {

		String opcion = (JOptionPane.showInputDialog(null, "Seleccione el tipo de conversor", "Conversor",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Conversor de moneda", "Conversor de Temperatura" },
				"selecciopna")).toString();
		
		String dato = JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea convertir");

		if (opcion == "Conversor de moneda") {
			
			MetodosMonedas conversorMonedas = new MetodosMonedas();
			conversorMonedas.setValor(dato);
			conversorMonedas.getOpciones();
			
			//conversorMonedas.operacion(0);
			
			JOptionPane.showMessageDialog(null, conversorMonedas.getResultado());
			
		}

		if (opcion == "Conversor de Temperatura") {

			CalculosTemperatura conversorTemperaturas = new CalculosTemperatura();
			conversorTemperaturas.getOpciones();
			
			
			
			
			
		}

	}

}
