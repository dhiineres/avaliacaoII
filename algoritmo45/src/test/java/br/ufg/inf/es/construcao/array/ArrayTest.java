package br.ufg.inf.es.construcao.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTest {

    @Test (expected = IllegalArgumentException.class)
    public void testTamanhoInvalido() throws Exception {
        char[] A = {'5', '7', 'B', '6', '8', 'J', 'S', '4'};
        Array.imprime(A, 10);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testEntradaNInvalido() throws Exception {
        char[] A = {'5', '7', 'B', '6', '8', 'J', 'S', '4'};
        Array.imprime(A, -1);
    }

    @Test
    public void testImprime() throws Exception {
        char[] A = {'5', '7', 'B', '6', '8', 'J', 'S', '4'};
        Array.imprime(A, 8);
    }
}