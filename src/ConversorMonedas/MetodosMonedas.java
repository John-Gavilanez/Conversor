package ConversorMonedas;

import javax.swing.JOptionPane;

public class MetodosMonedas {

	private String opciones;
	private String valor;
	private String lista;
	private double resultado;
	
	/*public MetodosMonedas (String lista, String valor){
		
		
	}*/

	public String getOpciones() {

		Object[] opConversion = new Object[8];

		opConversion[0] = "De Dólar a Euros";
		opConversion[1] = "De Dólar a Libras Esterlinas";
		opConversion[2] = "De Dólar a Yen Japonés";
		opConversion[3] = "De Dólar a Won sul-coreano";
		opConversion[4] = "De Euros a Dólar";
		opConversion[5] = "De Libras Esterlinas a Dólar";
		opConversion[6] = "De Yen Japonés a Dólar";
		opConversion[7] = "De Won sul-coreano a Dólar";

		lista = (JOptionPane.showInputDialog(null, "Eleija la moneda a la que desea convertir su dinero", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, opConversion, "Selecciona")).toString();

		System.out.println(valor);
		
		return opciones;
	}

	public void setOpciones(String opciones) {
		this.opciones = opciones;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getLista() {
		return lista;
	}

	public void setLista(String lista) {
		this.lista = lista;
	}

	public double getResultado() {

		/*if (lista == "De Dólar a Euros") {

			resultado = Double.valueOf(valor) * 0.92;

		}
		
		System.out.println(resultado);*/

		return resultado;
	}

	public void setResultado(double resultado) {
		
		this.resultado = resultado+44;
		
	}

}
