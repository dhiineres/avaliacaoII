package br.ufg.inf.es.construcao.matematica.sqrt;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {

    @Test (expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception{
        Sqrt.raiz(0, 5);
    }

    @Test
    public void testSegundoParametroNegativo() throws Exception {
        assertNotEquals(4, Sqrt.raiz(16, -5), 1);
    }

    @Test
    public void testRaiz() throws Exception {
        assertEquals(4, Sqrt.raiz(16, 5), 0.001);
        assertEquals(1.41, Sqrt.raiz(2, 7), 0.01);
        assertEquals(3.16, Sqrt.raiz(10, 100), 0.01);
        assertEquals(9, Sqrt.raiz(81, 100), 0.0001);
    }
}