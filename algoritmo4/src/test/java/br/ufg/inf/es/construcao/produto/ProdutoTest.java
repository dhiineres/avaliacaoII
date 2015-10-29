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
    }

}
