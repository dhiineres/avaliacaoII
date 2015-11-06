package br.ufg.inf.es.construcao.matematica.numeroDourado;

import org.junit.Test;

import static org.junit.Assert.*;


public class RazaoAureaTest {

    @Test (expected = IllegalArgumentException.class)
    public void testT1Invalido() throws Exception {
        RazaoAurea.razao(0, 2, 5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testT2Invalido() throws Exception {
        RazaoAurea.razao(5, 3, 2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFatorInvalido() throws Exception {
        RazaoAurea.razao(5, 7, -3);
    }

    @Test
    public void testRazaoAurea() throws Exception {
        assertEquals(1.61803399d, RazaoAurea.razao(99, 100, 1000), 0.00000001d);
        assertEquals(1.61803399d, RazaoAurea.razao(13, 100, 20), 0.00000001d);
        assertEquals(1.61803399d, RazaoAurea.razao(20, 400, 557), 0.00000001d);
    }
}