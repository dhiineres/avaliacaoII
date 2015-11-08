package br.ufg.inf.es.construcao.matematica.polinomio;

import org.junit.Test;

import static org.junit.Assert.*;

public class PolinomioHornerTest {

    @Test (expected = IllegalArgumentException.class)
    public void testGInvalido() throws Exception {
        int[] vetor = {1, 2, 3, 4};
        PolinomioHorner.horner(5, 0, vetor);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testTamanhoVetorInvalido() throws Exception {
        int[] vetor = {1, 2, 3, 4, 5};
        PolinomioHorner.horner(5, 5, vetor);
    }

    @Test
    public void testHorner() throws Exception {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(586, PolinomioHorner.horner(5, 3, vetor));
        assertEquals(86, PolinomioHorner.horner(5, 2, vetor));
        assertEquals(49, PolinomioHorner.horner(2, 3, vetor));
        assertEquals(321, PolinomioHorner.horner(2, 5, vetor));
    }
}