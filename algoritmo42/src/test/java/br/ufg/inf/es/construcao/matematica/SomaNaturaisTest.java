package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;
import static org.junit.Assert.*;


public class SomaNaturaisTest {

    @Test (expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        SomaNaturais.soma(-2);
    }

    @Test
    public void testSomatorio5() throws Exception {
        int s = 5;
        int n = SomaNaturais.soma(s);
        assertEquals((s * (s + 1) / 2), n);
    }

    @Test
    public void testSomatorio10() throws Exception {
        int s = 10;
        int n = SomaNaturais.soma(s);
        assertEquals((s * (s + 1) / 2), n);
    }

    @Test
    public void testSomatorio98() throws Exception {
        int s = 98;
        int n = SomaNaturais.soma(s);
        assertEquals((s * (s + 1) / 2), n);
    }

    @Test
    public void testSomatorio1000() throws Exception {
        int s = 1000;
        int n = SomaNaturais.soma(s);
        assertEquals((s * (s + 1) / 2), n);
    }
}
