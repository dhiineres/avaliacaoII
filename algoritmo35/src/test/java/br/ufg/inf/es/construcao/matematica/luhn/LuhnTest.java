package br.ufg.inf.es.construcao.matematica.luhn;

import org.junit.Test;

import java.util.function.LongUnaryOperator;

import static org.junit.Assert.*;

public class LuhnTest {

    @Test (expected = IllegalArgumentException.class)
    public void testLuhnVetorInvalido() throws Exception {
        int[] n = {1};
        Luhn.luhn(n);
    }

    @Test
    public void testLunhValidos() throws Exception {
        int[] Ae = {3, 7, 8, 2, 8, 2, 2, 4, 6, 3, 1, 0, 0, 0, 5};
        assertEquals(5, Luhn.luhn(Ae));
        int[] Ae2 = {3, 7, 1, 4, 4, 9, 6, 3, 5, 3, 9, 8, 4, 3, 1};
        assertEquals(1, Luhn.luhn(Ae2));
        int[] Dc = {3, 0, 5, 6, 9, 3, 0, 9, 0, 2, 5, 9, 0, 4};
        assertEquals(4, Luhn.luhn(Dc));
    }
}