package br.ufg.inf.es.construcao;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayTest {

    @Test (expected = IllegalArgumentException.class)
    public void TestTamanhoInvalido() throws Exception{
        int[] a = {1, 2, 3, 4, 5, 6};
        Array.soma(a, 7);
    }

    @Test (expected = IllegalArgumentException.class)
    public void TestEntradaNInvalido() throws Exception{
        int[] a = {1, 2, 3, 4, 5, 6};
        Array.soma(a, -1);
    }

    @Test
    public void testSomas() throws Exception{
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 2, 3};
        int[] c = {10 ,15, 20, 25, 100};
        assertEquals(21, Array.soma(a, 6));
        assertEquals(6, Array.soma(b, 3));
        assertEquals(170, Array.soma(c, 5));
    }

}