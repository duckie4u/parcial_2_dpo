package logica;

public class Parcial {
	private int base;
	private int exponente;
	
	public Parcial (int base, int exp) {
		this.base = base;
		this.exponente = exp;
	}
	
	public int elevarNum () throws resultadoDecimalException{
		double resultado = Math.pow(this.base, this.exponente);
		if (resultado % 1 != 0) {
			throw new resultadoDecimalException("Elevasión de enteros no válida: resultado no entero.");
		}
		return (int) resultado;
	}
}
