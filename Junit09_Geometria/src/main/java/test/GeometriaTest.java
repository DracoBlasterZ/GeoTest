package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {
	Geometria geo= new Geometria();
	Geometria geo2= new Geometria(1);
	Geometria geo3= new Geometria(2);
	Geometria geo4= new Geometria(3);
	Geometria geo5= new Geometria(4);
	Geometria geo6= new Geometria(5);
	Geometria geo7= new Geometria(6);
	Geometria geo8= new Geometria(8);
	Geometria geo9= new Geometria(9);

	@Test
	void testAreacuadrado() {
		int respuesta=geo.areacuadrado(8);
		int esperado=64;
		assertEquals(esperado, respuesta);
	}

	@Test
	void testAreaCirculo() {
		double respuesta=geo.areaCirculo(2);
		double esperado= 12.56;
		double delta= 1;
		assertEquals(esperado,respuesta,delta);
	}

	@Test
	void testAreatriangulo() {
		int respuesta= geo.areatriangulo(2, 3);
		int esperado= 3;
		assertEquals(esperado, respuesta);
	}

	@Test
	void testArearectangulo() {
		int respuesta= geo.arearectangulo(3,4);
		int esperado=12;
		assertEquals(esperado,respuesta);
	}

	@Test
	void testAreapentagono() {
		int respuesta= geo.areapentagono(2, 3);
		int esperado= 3;
		assertEquals(esperado, respuesta);
	}

	@Test
	void testArearombo() {
		int respuesta= geo.arearombo(2, 3);
		int esperado= 3;
		assertEquals(esperado, respuesta);
	}

	@Test
	void testArearomboide() {
		int respuesta= geo.arearomboide(3,4);
		int esperado=12;
		assertEquals(esperado,respuesta);
	}

	@Test
	void testAreatrapecio() {
		int respuesta= geo.areatrapecio(3, 4, 2);
		int esperado=6;
		System.out.println(respuesta);
		assertEquals(esperado,respuesta);
		
	}

	@Test
	void testFigura() {
		String respuesta= geo.figura(7);
		String esperado="Romboide";
		assertEquals(esperado,respuesta);
	}

	

	@Test
	void testSetGetId() {
		geo.setId(20);
		int respuesta= geo.getId();
		int esperado=20;
		assertEquals(esperado,respuesta);
	}
		

	@Test
	void testGetSetNom() {
		geo.setNom("Pedro");
		String respuesta= geo.getNom();
		String esperado="Pedro";
		assertEquals(esperado, respuesta);
	}

	@Test
	void testGetSetArea() {
		geo.setArea(20.20);
		double respuesta= geo.getArea();
		double esperado= 20.20;
		assertEquals(esperado, respuesta);
		
	}

	@Test
	void testToString() {
		double area=2.0;
		int id=0;
		String nombre="Base";
		geo.setArea(area);
		geo.setId(id);
		geo.setNom(nombre);
		String respuesta=geo.toString();
		String esperado= "Geometria [id=" + id + ", nom=" + nombre + ", area=" + area + "]";
		assertEquals(esperado,respuesta);
	}

}
