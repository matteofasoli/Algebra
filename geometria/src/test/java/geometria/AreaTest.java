package geometria;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreaTest {

	@Test
	public void testTriangolo() {
		int base=2;
		int altezza=3;
		int valoreAtteso=3;
		int valoreAttuale=Area.Triangolo(base,altezza);
		assertEquals(valoreAtteso, valoreAttuale);
	}

	@Test
	public void testQuadrato() {
		int lato=2;
		int valoreAtteso=4;
		int valoreAttuale=Area.quadrato(lato);
		assertEquals(valoreAtteso, valoreAttuale);
	}

	@Test
	public void testRombo() {
		int base=2;
		int altezza=3;
		int valoreAtteso=3;
		int valoreAttuale=Area.rombo(base,altezza);
		assertEquals(valoreAtteso, valoreAttuale);
	}

}
