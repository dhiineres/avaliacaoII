package br.ufg.inf.es.construcao.matematica.pi;


import org.junit.Test;
import static org.junit.Assert.*;

public class PiTest {

    @Test (expected = IllegalArgumentException.class)
    public void testEntradaInvalida() throws Exception {
        Pi.pi(0);
    }

    @Test
    public void testPiPrecisao10() throws Exception {
        assertEquals(Math.PI, Pi.pi(10), 0.1);
    }

    @Test
    public void testPiPrecisao50() throws Exception {
        assertEquals(Math.PI, Pi.pi(50), 0.1);
    }

    @Test
    public void testPiPrecisao1000() throws Exception {
        assertEquals(Math.PI, Pi.pi(1000), 0.01);
    }

    @Test
    public void testPiPrecisao100000() throws Exception {
        assertEquals(Math.PI, Pi.pi(100000), 0.0001);
    }

}
