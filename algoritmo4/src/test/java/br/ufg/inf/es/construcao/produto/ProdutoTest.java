package br.ufg.inf.es.construcao.produto;

import org.junit.*;

public class ProdutoTest {
    @Test (expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Produto.produto(-5, 3);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Produto.produto(8, -13);
    }

    @Test
    public void testCasosTriviais() throws Exception {
        Assert.assertEquals(1, Produto.produto(1, 1));
        Assert.assertEquals(8, Produto.produto(4, 2));
        Assert.assertEquals(25, Produto.produto(5, 5));
        Assert.assertEquals(9, Produto.produto(3, 3));
        Assert.assertEquals(169, Produto.produto(13, 13));
    }

    @Test
    public void testOutrosCasos() throws Exception {
        Assert.assertEquals(887 * 123, Produto.produto(887, 123));
        Assert.assertEquals(12345 * 54321, Produto.produto(12345, 54321));
        Assert.assertEquals(97 * 33, Produto.produto(97, 33));
        Assert.assertEquals(50 * 125, Produto.produto(50, 125));
        Assert.assertEquals(1457 * 33, Produto.produto(1457, 33));
    }
}
