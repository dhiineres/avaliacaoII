package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Usuario on 05/11/2015.
 */
public class HarmonicosTest {

    @Test (expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Harmonicos.harmonico(0);
    }

    @Test
     public void testHarmonico4() throws Exception {
        assertEquals(2.0833, Harmonicos.harmonico(4), 0.001);
    }

    @Test
    public void testHarmonico10() throws Exception {
        assertEquals(2.928968, Harmonicos.harmonico(10), 0.001);
    }

    @Test
    public void testHarmonico20() throws Exception {
        assertEquals(3.59773965, Harmonicos.harmonico(20), 0.001);
    }
}