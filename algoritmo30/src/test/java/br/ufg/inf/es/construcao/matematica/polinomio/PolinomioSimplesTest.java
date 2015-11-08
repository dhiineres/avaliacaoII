package br.ufg.inf.es.construcao.matematica.polinomio;

import org.junit.Test;

import static org.junit.Assert.*;

public class PolinomioSimplesTest {

    @Test (expected = IllegalArgumentException.class)
    public void testGInvalido() throws Exception {
        int[] vetor = {1, 2, 3, 4};
        PolinomioSimples.pol(5, 0, vetor);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testTamanhoVetorInvalido() throws Exception {
        int[] vetor = {1, 2, 3, 4, 5};
        PolinomioSimples.pol(5, 5, vetor);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIndiceGInvalido() throws Exception {
        int[] vetor = {1, 2, 3, 4, 5, 0};
        PolinomioSimples.pol(5, 5, vetor);
    }

    @Test
    public void testCasosValidos() throws Exception {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(321, PolinomioSimples.pol(2, 5, vetor));
        assertEquals(49, PolinomioSimples.pol(2, 3, vetor));
    }
}