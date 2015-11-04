package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;

import static org.junit.Assert.*;

public class EratostenesTest {

    @Test (expected = IllegalArgumentException.class)
    public void testNInvalido() throws Exception {
        int[] vetor = new int[6];
        Eratostenes.crivo(vetor, 1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testTamanhoVetorInvalido() throws Exception {
        int[] vetor = {0, 0, 0, 0, 0, 0, 0};
        Eratostenes.crivo(vetor, 7);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testVetorInvalido() throws Exception {
        int [] vetor = { 0, 0, 0, 1, 0, 0, 0, 0, 0};
        Eratostenes.crivo(vetor, 6);
    }

    @Test
    public void testCrivoEratostenes() throws Exception {
        int[] vetor = new int[501];
        int n = 500;

        Eratostenes.crivo(vetor, n);

        assertEquals(0, vetor[2]);
        assertEquals(0, vetor[5]);
        assertEquals(0, vetor[23]);
        assertEquals(0, vetor[277]);
        assertEquals(0, vetor[401]);
        assertEquals(1, vetor[4]);
        assertEquals(1, vetor[100]);
        assertEquals(1, vetor[143]);
        assertEquals(1, vetor[459]);
        assertEquals(1, vetor[497]);
    }
}