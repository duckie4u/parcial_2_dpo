package logica;

public class Parcial {
	private int base;
	private int exponente;
	
	int elevarNum () throws resultadoDecimalException{
		double resultado = Math.pow(base, exponente);
		if (resultado % 1 != 0) {
			throw new resultadoDecimalException("Elevasión de enteros no válida: resultado no entero.");
		}
		return (int) resultado;
	}
}
