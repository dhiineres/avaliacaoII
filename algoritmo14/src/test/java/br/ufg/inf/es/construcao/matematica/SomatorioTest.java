package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomatorioTest {

    @Test (expected = IllegalArgumentException.class)
    public void testEntradaInvalida() throws Exception {
        Somatorio.somatorio(0);
    }

    @Test
    public void testSomatorio2() throws Exception {
        assertEquals(0.7, Somatorio.somatorio(2), 0.01);
    }

    @Test
    public void testSomatorio11() throws Exception {
        assertEquals(0.9899, Somatorio.somatorio(11), 0.001);
    }

    @Test
    public void testSomatorio20() throws Exception {
        assertEquals(1.027, Somatorio.somatorio(20), 0.001);
    }

    @Test
    public void testSomatorio50() throws Exception {
        assertEquals(1.05687, Somatorio.somatorio(50), 0.0001);
    }

    @Test
    public void testSomatorio100() throws Exception {
        assertEquals(1.06672, Somatorio.somatorio(100), 0.0001);
    }

    @Test
    public void testSomatorio1000() throws Exception {
        assertEquals(1.07568, Somatorio.somatorio(1000), 0.0001);
    }
}