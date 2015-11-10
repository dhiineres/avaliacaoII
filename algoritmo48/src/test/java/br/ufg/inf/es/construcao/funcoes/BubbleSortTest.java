package br.ufg.inf.es.construcao.funcoes;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test (expected = IllegalArgumentException.class)
    public void testTamanhoVetorInvalido() throws Exception {
        int[] a = new int[3];
        BubbleSort.bubleSort(a, 4);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testEntradaNInvalida() throws Exception {
        int[] a = new int[5];
        BubbleSort.bubleSort(a, -1);
    }

    @Test
    public void testBubbleSort() throws Exception {
        int[] a = {3, 5, 4, 1, 2};
        int[] as = {5, 4, 3, 2, 1};
        int[] b = {10, 20, 15, 17, 13, 25, 14};
        int[] bs = {25, 20, 17, 15, 14 , 13, 10};
        BubbleSort.bubleSort(a, 5);
        BubbleSort.bubleSort(b, 7);
        for (int i = 0; i < a.length; i++){
            assertEquals(as[i], a[i]);
        }
        for (int i = 0; i < b.length; i++){
            assertEquals(bs[i], b[i]);
        }
    }
}