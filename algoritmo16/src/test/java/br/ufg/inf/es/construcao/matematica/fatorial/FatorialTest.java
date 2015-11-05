package br.ufg.inf.es.construcao.matematica.fatorial;

import org.junit.Test;
import static org.junit.Assert.*;

public class FatorialTest {

    @Test (expected = IllegalArgumentException.class)
    public void testNInvalido() throws Exception {
        Fatorial.fat (0);
    }

    @Test
    public void testFatoriais() throws Exception {
        assertEquals(1, Fatorial.fat(1));
        assertEquals(2, Fatorial.fat(2));
        assertEquals(6, Fatorial.fat(3));
        assertEquals(24, Fatorial.fat(4));
        assertEquals(120, Fatorial.fat(5));
        assertEquals(720, Fatorial.fat(6));
        assertEquals(5040, Fatorial.fat(7));
    }
}
