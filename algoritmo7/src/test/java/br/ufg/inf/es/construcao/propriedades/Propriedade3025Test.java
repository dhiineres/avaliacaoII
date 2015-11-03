package br.ufg.inf.es.construcao.propriedades;

import org.junit.Test;

import org.junit.Assert;

import javax.swing.*;

public class Propriedade3025Test {

    @Test (expected = IllegalArgumentException.class)
    public void testParametroMenorInvalido() throws Exception {
        Propriedade3025.propriedade(-5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testParametroMaiorInvalido() throws Exception {
        Propriedade3025.propriedade(10000);
    }

    @Test
    public void testCasosFalsos() throws Exception {
        Assert.assertFalse(Propriedade3025.propriedade(15));
        Assert.assertFalse(Propriedade3025.propriedade(3026));
        Assert.assertFalse(Propriedade3025.propriedade(9999));
        Assert.assertFalse(Propriedade3025.propriedade(1855));
        Assert.assertFalse(Propriedade3025.propriedade(2000));
        Assert.assertFalse(Propriedade3025.propriedade(4000));
        Assert.assertFalse(Propriedade3025.propriedade(1577));
    }

    @Test
    public void testCasosVerdadeiros() throws Exception {
        Assert.assertTrue(Propriedade3025.propriedade(2025));
        Assert.assertTrue(Propriedade3025.propriedade(3025));
        Assert.assertTrue(Propriedade3025.propriedade(9801));
        Assert.assertTrue(Propriedade3025.propriedade(1));
    }
}