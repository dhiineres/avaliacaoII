package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomaDivisoresTest {

    @Test (expected = IllegalArgumentException.class)
    public void testEntradaInvalida() throws Exception {
        SomaDivisores.somaDivisores(0);
    }

    @Test
    public void testSomaDosDivisores() throws Exception {
        assertEquals(6, SomaDivisores.somaDivisores(25));
        assertEquals(54, SomaDivisores.somaDivisores(42));
        assertEquals(1, SomaDivisores.somaDivisores(13));
        assertEquals(1, SomaDivisores.somaDivisores(7));
        assertEquals(117, SomaDivisores.somaDivisores(100));
        assertEquals(41, SomaDivisores.somaDivisores(111));
        assertEquals(240, SomaDivisores.somaDivisores(120));
        assertEquals(222, SomaDivisores.somaDivisores(150));
        assertEquals(568, SomaDivisores.somaDivisores(300));
        assertEquals(592, SomaDivisores.somaDivisores(500));
        assertEquals(400, SomaDivisores.somaDivisores(524));
        assertEquals(1260, SomaDivisores.somaDivisores(600));
        assertEquals(1340, SomaDivisores.somaDivisores(1000));
    }
}