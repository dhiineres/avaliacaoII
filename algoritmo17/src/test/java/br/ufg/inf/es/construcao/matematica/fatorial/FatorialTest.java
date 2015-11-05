package br.ufg.inf.es.construcao.matematica.fatorial;

import org.junit.Test;
import static org.junit.Assert.*;

public class FatorialTest {

    @Test (expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Fatorial.fatorialSoma(0);
    }

    @Test
    public void testCasosTriviais() throws Exception {
        assertEquals(1, Fatorial.fatorialSoma(1));
        assertEquals(6, Fatorial.fatorialSoma(3));
        assertEquals(24, Fatorial.fatorialSoma(4));
        assertEquals(120, Fatorial.fatorialSoma(5));
        assertEquals(720, Fatorial.fatorialSoma(6));
    }
}
