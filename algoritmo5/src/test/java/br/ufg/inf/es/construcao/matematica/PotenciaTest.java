package br.ufg.inf.es.construcao.matematica;

import com.sun.deploy.association.AssociationService;
import org.junit.Test;

import org.junit.Assert;


public class PotenciaTest {

    @Test (expected = IllegalArgumentException.class)
    public void testParametroXInvalido() throws Exception {
        Potencia.potencia(0, 5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testParametroYInvalido() throws Exception {
        Potencia.potencia(7, -3);
    }

    @Test
    public void testCasosTriviais() throws Exception {
        Assert.assertEquals(1, Potencia.potencia(1, 1));
        Assert.assertEquals(1, Potencia.potencia(10, 0));
        Assert.assertEquals(1000, Potencia.potencia(1000, 1));
        Assert.assertEquals(4, Potencia.potencia(2, 2));
        Assert.assertEquals(9, Potencia.potencia(3, 2));
        Assert.assertEquals(25, Potencia.potencia(5, 2));
        Assert.assertEquals(27, Potencia.potencia(3, 3));
        Assert.assertEquals(169, Potencia.potencia(13, 2));
    }
}