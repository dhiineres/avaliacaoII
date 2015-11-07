package br.ufg.inf.es.construcao.matematica.divisao;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModSimplesTest {

    @Test (expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        ModSimples.mod(0, 5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        ModSimples.mod(1, 0);
    }

    @Test
    public void testCasosDeFronteira() throws Exception {
        assertEquals(0, ModSimples.mod(1, 1));
        assertEquals(0, ModSimples.mod(2, 1));
    }

    @Test
    public void testCasosTriviais() throws Exception {
        assertEquals(2, ModSimples.mod(5, 3));
        assertEquals(2, ModSimples.mod(7, 5));
        assertEquals(0, ModSimples.mod(6, 3));
        assertEquals(0, ModSimples.mod(81, 9));
        assertEquals(2, ModSimples.mod(83, 9));
        assertEquals(1, ModSimples.mod(10, 3));
        assertEquals(2, ModSimples.mod(30, 7));
    }
}