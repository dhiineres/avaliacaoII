package br.ufg.inf.es.construcao.matematica;

import br.ufg.inf.es.construcao.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTest {

    @Test (expected = IllegalArgumentException.class)
    public void testVetorInvalido() throws Exception {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        Array.media(a, 8);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testEntradaNInvalido() throws Exception {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        Array.media(a, -1);
    }

    @Test
    public void testMedias() throws Exception {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {2, 4, 6, 8, 10, 12};
        int[] c = {1, 7, 9};

        assertEquals(4, Array.media(a, 7), 0.1);
        assertEquals(7, Array.media(b, 6), 0.1);
        assertEquals(5.66, Array.media(c, 3), 0.01);
    }
}