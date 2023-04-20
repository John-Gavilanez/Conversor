package ConversorMonedas;

public class CalculoMonedas{

	double valor;
	double resultado;
	
	public CalculoMonedas(String opcion, double dato){
		
		valor =dato;
		
		if (opcion=="De Dólar a Euros") {
			
			System.out.println(opcion);
			
		}
		
	}
	
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getResultado() {
		
		this.resultado = Double.valueOf(valor)*50;
		
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
		//if (moneda.getLista()=="De Dólar a Euros") {
			
			//moneda.operacion(Double.valueOf(moneda.getValor()));
			
			
		//}
		
	
}
