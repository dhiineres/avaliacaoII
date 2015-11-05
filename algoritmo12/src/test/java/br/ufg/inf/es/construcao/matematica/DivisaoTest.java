package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisaoTest {

    @Test (expected = IllegalArgumentException.class)
    public void testParametroAInvalido() throws Exception {
        Divisao.mdc2(5, 6);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testParametroBInvalido() throws Exception {
        Divisao.mdc2(5, 0);
    }

    @Test
    public void testMdc() throws Exception {
        assertEquals(1, Divisao.mdc2(5, 4));
        assertEquals(50, Divisao.mdc2(100, 50));
        assertEquals(4, Divisao.mdc2(12, 8));
        assertEquals(7, Divisao.mdc2(21, 14));
        assertEquals(1, Divisao.mdc2(13, 11));
        assertEquals(10, Divisao.mdc2(100, 30));
        assertEquals(13, Divisao.mdc2(39, 13));
    }
}