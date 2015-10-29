package br.ufg.inf.es.construcao.paridade;

import org.junit.*;


public class ParidadeTest {
    @Test
    public void testPares() throws Exception {
        Assert.assertTrue(Paridade.paridade(0));
        Assert.assertTrue(Paridade.paridade(2));
        Assert.assertTrue(Paridade.paridade(6));
        Assert.assertTrue(Paridade.paridade(10));
        Assert.assertTrue(Paridade.paridade(50));
        Assert.assertTrue(Paridade.paridade(190));
        Assert.assertTrue(Paridade.paridade(5800));
        Assert.assertTrue(Paridade.paridade(18000));
        Assert.assertTrue(Paridade.paridade(-88));
    }

    @Test
    public void testImpares() throws Exception {
        Assert.assertFalse(Paridade.paridade(-57));
        Assert.assertFalse(Paridade.paridade(-13));
        Assert.assertFalse(Paridade.paridade(1));
        Assert.assertFalse(Paridade.paridade(3));
        Assert.assertFalse(Paridade.paridade(7));
        Assert.assertFalse(Paridade.paridade(21));
        Assert.assertFalse(Paridade.paridade(53));
        Assert.assertFalse(Paridade.paridade(111));
        Assert.assertFalse(Paridade.paridade(1257));
        Assert.assertFalse(Paridade.paridade(1333));
        Assert.assertFalse(Paridade.paridade(6675));
    }
}
