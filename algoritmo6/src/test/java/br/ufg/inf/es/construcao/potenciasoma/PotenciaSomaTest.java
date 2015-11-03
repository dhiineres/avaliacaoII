package br.ufg.inf.es.construcao.potenciasoma;

import org.junit.Test;

import org.junit.Assert;

/**
 * Created by Usuario on 03/11/2015.
 */
public class PotenciaSomaTest {

    @Test (expected = IllegalArgumentException.class)
    public void testInvalidoX() throws Exception {
        PotenciaSoma.potencia(0, 5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testInvalidoY() throws Exception {
        PotenciaSoma.potencia(5, -3);
    }

    @Test
    public void testCasosTriviais() throws Exception {
        Assert.assertEquals(1, PotenciaSoma.potencia(1, 1));
        Assert.assertEquals(100000, PotenciaSoma.potencia(10, 5));
        Assert.assertEquals(1000, PotenciaSoma.potencia(1000, 1));
        Assert.assertEquals(4, PotenciaSoma.potencia(2, 2));
        Assert.assertEquals(9, PotenciaSoma.potencia(3, 2));
        Assert.assertEquals(25, PotenciaSoma.potencia(5, 2));
        Assert.assertEquals(27, PotenciaSoma.potencia(3, 3));
        Assert.assertEquals(169, PotenciaSoma.potencia(13, 2));
    }
}