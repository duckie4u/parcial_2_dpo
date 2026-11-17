package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;
import logica.resultadoDecimalException;

class ParcialTests {
	private Parcial parcial;

	@Test
	void testElevarNegativo () throws resultadoDecimalException {
		this.parcial = new Parcial(2, -4);
		try {
			this.parcial.elevarNum();
			fail("Super error porque no se dio cuenta que al elevar a menos cuatro nos da decimal");
			} 
		catch (resultadoDecimalException e) {}
	}
	
	@Test
	void testElevarPositivo () throws resultadoDecimalException {
		this.parcial = new Parcial(2,4);
		assertEquals(16, this.parcial.elevarNum(), "No eleva correctamente el número");
	}
}
