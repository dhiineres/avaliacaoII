package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;

import static org.junit.Assert.*;

public class ModTest {

    @Test (expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Mod.mod(-1, 5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Mod.mod(1, 0);
    }

    @Test
    public void testCasosDeFronteira() throws Exception {
        assertEquals(0, Mod.mod(1, 1));
        assertEquals(0, Mod.mod(2, 1));
    }

    @Test
    public void testCasosTriviais() throws Exception {
        assertEquals(2, Mod.mod(5, 3));
        assertEquals(2, Mod.mod(7, 5));
        assertEquals(0, Mod.mod(6, 3));
        assertEquals(0, Mod.mod(81, 9));
        assertEquals(2, Mod.mod(83, 9));
        assertEquals(1, Mod.mod(10, 3));
        assertEquals(2, Mod.mod(30, 7));
    }
}