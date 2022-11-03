package test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import JUnit.Junit09_Geometria.dto.*;

class GeometriaTest {

	private Geometria gm;
	
	@Test
	public void testAreaCuadrado() {
		
		int result = Geometria.areacuadrado(2);
		int esperado = 4;
		assertEquals(esperado, result);
		
	}
	
	@Test
	public void testAreaCirculo() {
		
		double result = Geometria.areaCirculo(2);
		int esperado = 13;
		assertEquals(esperado, result, 1);
		
	}
	
	@Test
	public void testAreaTriangulo() {
		
		int result = Geometria.areatriangulo(4,3);
		int esperado = 6;
		assertEquals(esperado, result);
		
	}
	
	@Test
	public void testAreaRectangulo() {
		
		int result = Geometria.arearectangulo(3,3);
		int esperado = 9;
		assertEquals(esperado, result);
		
	}
	
	@Test
	public void testAreaPentagono() {
		
		int result = Geometria.areapentagono(2,2);
		int esperado = 2;
		assertEquals(esperado, result);
		
	}
	
	@Test
	public void testAreaRombo() {
		
		int result = Geometria.arearombo(3,2);
		int esperado = 3;
		assertEquals(esperado, result);
		
	}
	
	@Test
	public void testAreaRomboide() {
		
		int result = Geometria.arearomboide(1,2);
		int esperado = 2;
		assertEquals(esperado, result);
		
	}
	
	@Test
	public void testAreaTrapecio() {
		
		int result = Geometria.areatrapecio(2,4,3);
		int esperado = 9;
		assertEquals(esperado, result);
		
	}
	
	@Test
	public void testFigura() {
		
		String result = Geometria.figura(1);
		String esperado = "cuadrado";
		assertEquals(esperado, result);
		
		result = Geometria.figura(2);
		esperado = "Circulo";
		assertEquals(esperado, result);
		
		result = Geometria.figura(3);
		esperado = "Triangulo";
		assertEquals(esperado, result);
		
		result = Geometria.figura(4);
		esperado = "Rectangulo";
		assertEquals(esperado, result);
		
		result = Geometria.figura(5);
		esperado = "Pentagono";
		assertEquals(esperado, result);
		
		result = Geometria.figura(6);
		esperado = "Rombo";
		assertEquals(esperado, result);
		
		result = Geometria.figura(7);
		esperado = "Romboide";
		assertEquals(esperado, result);
		
		result = Geometria.figura(8);
		esperado = "Trapecio";
		assertEquals(esperado, result);
		
		result = Geometria.figura(0);
		esperado = "Default";
		assertEquals(esperado, result);
	}
	
	@BeforeEach
	public void before() {
		System.out.println("Primera ejecucion");
		gm = new Geometria(2);
		new Geometria();
	}
	
	@Test
	public void testGetID() throws NoSuchFieldException, IllegalAccessException {
		
		gm = new Geometria();	//creamos instancia clase Geometria
		Field campId = gm.getClass().getDeclaredField("id");	//Con la clase Field creamos un campo y le asignamos el id
		campId.setAccessible(true);	
        campId.set(gm, 2);	//a la variable creada le seteamos un valor de id, p.ej.: 2
        
        int result = gm.getId();	//al hacer un get de la Id y compararla con la asignada, debería devolver el valor
        assertEquals(result, 2);
		
	}
	
	@Test
	public void testGetNom() throws NoSuchFieldException, IllegalAccessException {
		
		gm = new Geometria();	//creamos instancia clase Geometria
		Field campNom = gm.getClass().getDeclaredField("nom");	//Con la clase Field creamos un campo y le asignamos el nombre
		campNom.setAccessible(true);	
        campNom.set(gm, "cuadrado");	//a la variable creada le seteamos un valor de nombre
        
        String result = gm.getNom();	//al hacer un get del nombre y compararla con la asignada, debería devolver el valor
        assertEquals(result, "cuadrado");
		
	}
	
	@Test
	public void testGetArea() throws NoSuchFieldException, IllegalAccessException {
		
		gm = new Geometria();	//creamos instancia clase Geometria
		Field campArea = gm.getClass().getDeclaredField("area");	
		campArea.setAccessible(true);	
        campArea.set(gm, 22.6);	//a la variable creada le seteamos un valor de area
        
        double result = gm.getArea();	//al hacer un get del area y compararla con la asignada, debería devolver el valor
        assertEquals(result, 22.6, 1);	//cuando son doubles, hay que indicar el margen de error (delta)
		
	}
	
	@Test
	public void testSetID() throws NoSuchFieldException, IllegalAccessException {
		
		gm = new Geometria(3);	//creamos instancia clase Geometria
	
        gm.setId(4);	//a la instancia creada le seteamos un valor de id, p.ej.: 4
        Field campId = gm.getClass().getDeclaredField("id");	//Con la clase Field creamos un campo y le asignamos el id
        campId.setAccessible(true);
        assertEquals(campId.get(gm), 4);	//Si hacemos get de la instancia con el id seteado, obtendremos su valor
		
	}
	
	@Test
	public void testSetNom() throws NoSuchFieldException, IllegalAccessException {
		
		gm = new Geometria();	//creamos instancia clase Geometria
	
        gm.setNom("Triangulo");	//a la instancia creada le seteamos un valor de nombre
        Field campNom = gm.getClass().getDeclaredField("nom");	//Con la clase Field creamos un campo y le asignamos el nombre
        campNom.setAccessible(true);
        assertEquals(campNom.get(gm), "Triangulo");	//Si hacemos get de la instancia con el id seteado, obtendremos su valor
		
	}
	
	@Test
	public void testSetArea() throws NoSuchFieldException, IllegalAccessException {
		
		gm = new Geometria();	//creamos instancia clase Geometria
	
        gm.setArea(20.5);	//a la instancia creada le seteamos un valor de area
        Field campArea = gm.getClass().getDeclaredField("area");	//Con la clase Field creamos un campo y le asignamos el nombre
        campArea.setAccessible(true);
        assertEquals(campArea.get(gm), 20.5);	//Si hacemos get de la instancia con el id seteado, obtendremos su valor
		
	}
	
	@Test
    public void testToString() throws NoSuchFieldException, SecurityException
    {
		gm = new Geometria();	//creamos instancia clase Geometria
		
		int resultId = gm.getId();	//hacemos gets de los atributos
		String resultNom = gm.getNom();
		double resultArea = gm.getArea();
		
        String esperado = "Geometria [id=" + resultId + ", nom=" + resultNom + ", area=" + resultArea + "]"; //toString esperado
        assertEquals(esperado, gm.toString());
    }

}
