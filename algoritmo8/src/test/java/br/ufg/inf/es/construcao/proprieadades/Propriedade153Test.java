package br.ufg.inf.es.construcao.proprieadades;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Usuario on 03/11/2015.
 */
public class Propriedade153Test {

    @Test (expected = IllegalArgumentException.class)
    public void testEntradaNegativa() throws Exception {
        Propriedade153.propriedade(-5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testEntradaMaiorInvalida() throws Exception {
        Propriedade153.propriedade(1000);
    }

    @Test
    public void testCasosVerdadeiros() throws Exception {
        assertTrue(Propriedade153.propriedade(153));
        assertTrue(Propriedade153.propriedade(370));
        assertTrue(Propriedade153.propriedade(371));
        assertTrue(Propriedade153.propriedade(407));
    }

    @Test
    public void testCasosFalsos() throws Exception {
        assertFalse(Propriedade153.propriedade(557));
        assertFalse(Propriedade153.propriedade(993));
        assertFalse(Propriedade153.propriedade(154));
        assertFalse(Propriedade153.propriedade(247));
        assertFalse(Propriedade153.propriedade(408));
        assertFalse(Propriedade153.propriedade(999));
    }
}