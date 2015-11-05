package br.ufg.inf.es.construcao.matematica.lognatural;

import org.junit.Test;
import static org.junit.Assert.*;

public class LogNaturalTest {

    @Test (expected = IllegalArgumentException.class)
    public void testParametroAInvalido() throws Exception {
        LogNatural.log(0, 3);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testParametroBInvalido() throws Exception {
        LogNatural.log(1, 1);
    }

    @Test
    public void testLog() throws Exception {
        assertEquals(2.5, LogNatural.log(1, 2), 0.1);
        assertEquals(18.5, LogNatural.log(5, 2), 0.01);
        assertEquals(39.333333, LogNatural.log(5, 3), 0.0001);
    }
}
