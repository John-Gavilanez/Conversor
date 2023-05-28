package MenuConversor;

import javax.swing.JOptionPane;

import ConversorMonedas.MetodosMonedas;
import ConversorTemperatura.CalculosTemperatura;
import ConversorTemperatura.MetodoTemperatura;

public class Inicio {

	public static void main(String[] args) {

		int inicio = 0;
		String dato;
		String seleccion;

		while (inicio == 0) {

			try {
				seleccion = (JOptionPane.showInputDialog(null, "Seleccione el tipo de conversor", "Conversor",
						JOptionPane.PLAIN_MESSAGE, null,
						new Object[] { "Conversor de moneda", "Conversor de Temperatura" }, "selecciona")).toString();

				dato = JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea convertir");

				if (Double.valueOf(dato) >= 0) {
					if (seleccion == "Conversor de moneda") {
						MetodosMonedas conversorMonedas = new MetodosMonedas(dato);
					}
					
					if (seleccion == "Conversor de Temperatura") {
						MetodoTemperatura conversorTemperatura = new MetodoTemperatura(dato);
					}
				}

				else {
					JOptionPane.showMessageDialog(null, "Usted ha ingresado valores negativos", "title",
							JOptionPane.ERROR_MESSAGE);
				}
			}

			catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Usted ha decidido cancelar la operación", "¡Atención!",
						JOptionPane.WARNING_MESSAGE);
			}

			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Usted ingreso letras o dejo el campo vacio", "¡Aviso!",
						JOptionPane.ERROR_MESSAGE);
			}

			inicio = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?", "Mensaje de confirmación",
					JOptionPane.YES_NO_OPTION);
		}

	}

}
