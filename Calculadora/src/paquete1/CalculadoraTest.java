package paquete1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora calcu= new Calculadora(20,10);
		int resultado = calcu.suma();
		assertEquals(30, resultado);
	}

	@Test
	public void testResta() {
		Calculadora calcu= new Calculadora(20,10);
		int resultado = calcu.resta();
		assertEquals(10, resultado);
	}

	@Test
	public void testMultiplicar() {
		Calculadora calcu= new Calculadora(20,10);
		int resultado = calcu.multiplicar();
		assertEquals(200, resultado);
	}

	@Test
	public void testDividir() {
		try {
			Calculadora calcu= new Calculadora(20,0);
			int resultado = calcu.dividir();
			fail("Fallo, Debería haber lanzado excepciones");
			assertEquals(2, resultado);
		}
		catch (ArithmeticException e) {
			System.out.println("PRUEBA satisfactoria");
		}
	}
	public class Calculadora0Test {
		@Test(expected = java.lang.ArithmeticException.class)
		public void testDividir0() {
			Calculadora calcu= new Calculadora(20,2);
			Integer resultado=calcu.dividir0();
		}
	}

}

