package geometria;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class PuntoTest {

	@Test
	void test() {
		Punto p = new Punto(1,2);
		assertEquals(true, p.equals(new Punto(1,2)));		
	}
	@Test
	void test2() {
		Punto p = new Punto(2,2);
		assertEquals(false, p.equals(new Punto(1,2)));		
	}
	@Test
	void test3() {
		Punto p = new Punto(1,1);
		assertEquals(false, p.equals(new Punto(1,2)));		
	}
	@Test
	void test4() {
		Punto p = new Punto(2,1);
		assertEquals(false, p.equals(new Punto(1,2)));		
	}
	@Test
	void test5() {
		Punto p = new Punto();
		assertEquals(false, p.equals(new Punto()));		
	}
	@Test
	void test6() {
		Punto p = new Punto();
		assertEquals(false, p.equals(new Punto(1,2)));		
	}
	
}
