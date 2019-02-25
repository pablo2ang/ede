package paquete1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calculadora1Test {
	
	private Calculadora calcu;
	private int resultado;

	@Before
	public void crearCalculadora () {
		 calcu= new Calculadora(20,10);
	}

	@After
	public void borrarCalculadora() {
		calcu=null;
	}

	@Test
	public void testSuma() {
		 resultado= calcu.suma();
		assertEquals(30,resultado);
	}

	@Test
	public void testResta() {
		 resultado= calcu.resta();
		assertEquals(10,resultado);
	}

	@Test
	public void testMultiplicar() {
		 resultado= calcu.multiplicar();
		assertEquals("Fallo en la multiplicacion",200,resultado);
	}

	@Test
	public void testDividir() {
		 resultado= calcu.dividir();
		assertEquals(2,resultado);
	}

}
