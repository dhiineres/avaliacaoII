package br.ufg.inf.es.construcao.matematica.fatoriais;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomaFatoriaisTest {

    @Test (expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception{
        SomaFatoriais.soma(-1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNumeroContemZeros() throws Exception{
        SomaFatoriais.soma(100);
    }

    @Test
    public void testFatorialCorreto() throws Exception {
        assertTrue(SomaFatoriais.soma(145));
    }

    @Test
    public void testFatorialIncorreto() throws Exception{
        assertFalse(SomaFatoriais.soma(111));
    }
}