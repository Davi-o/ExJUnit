package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Davi Alves
 * @since 19/03 - 9:20
 * @version 1.0 T
 */
public class NumeroTest {
    
    private static final Numero n = new Numero();
   
    public NumeroTest() { }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Entrou no setUpClass");
        n.setN1(10);
        n.setN2(10);
        System.out.println("N1:"+n.getN1()+"\nN2:"+n.getN2()); 
   }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Entrou no tearDownClass");
    }
    
    @Before
    public void setUp() { }
    
    @After
    public void tearDown() { }

    @Test
    public void testSomeMethod() { }
    
    @Test
    public void testSomar() {
        assertEquals(20, n.somar(), 0.0);
    }
    
    @Test
    public void testSubtrair() {
        assertEquals(0, n.subtrair(), 0.0);
    }
    
    @Test
    public void testMultiplicar() {
        assertEquals(100, n.multiplicar(), 0.0);
    }
    
    @Test
    public void testDividir() {
        assertEquals(1, n.dividir(), 0.0);
    }
    
    @Test
    public void testVerificarParN1() {
        assertTrue(n.verificarParN1());
    }
    
    @Test
    public void testVerificarParNum() {
        assertTrue(n.verificarNum(2));
        assertFalse(n.verificarNum(3));
    }

    @Test
    public void testBla() {
        assertEquals("um",n.bla(1));
        assertEquals("erro",n.bla(3));
    }    
    
}
