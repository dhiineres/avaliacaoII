package br.ufg.inf.es.construcao.matematica.quadrado;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.junit.Assert.*;

public class QuadradoPerfeitoTest {

    @Test (expected = IllegalArgumentException.class)
    public void testKInvalido() throws Exception {
        QuadradoPerfeito.quadrado(0);
    }

    @Test
    public void testQuadradosPerfeitos() throws Exception {
        assertTrue(QuadradoPerfeito.quadrado(4));
        assertTrue(QuadradoPerfeito.quadrado(9));
        assertTrue(QuadradoPerfeito.quadrado(16));
        assertTrue(QuadradoPerfeito.quadrado(144));
        assertTrue(QuadradoPerfeito.quadrado(169));
        assertTrue(QuadradoPerfeito.quadrado(400));
        assertTrue(QuadradoPerfeito.quadrado(625));
        assertTrue(QuadradoPerfeito.quadrado(10000));
    }

    @Test
    public void testNaoQuadrados() throws Exception {
        assertFalse(QuadradoPerfeito.quadrado(3));
        assertFalse(QuadradoPerfeito.quadrado(17));
        assertFalse(QuadradoPerfeito.quadrado(145));
        assertFalse(QuadradoPerfeito.quadrado(200));
        assertFalse(QuadradoPerfeito.quadrado(557));
        assertFalse(QuadradoPerfeito.quadrado(666));
        assertFalse(QuadradoPerfeito.quadrado(999));
    }
}