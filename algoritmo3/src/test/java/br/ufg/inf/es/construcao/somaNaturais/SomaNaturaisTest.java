package br.ufg.inf.es.construcao.somaNaturais;

import org.junit.*;

public class SomaNaturaisTest {
    @Test (expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        SomaNaturais.somatorio(-2);
    }

    @Test
    public void testSomatorio5() throws Exception {
        int s = 5;
        int n = SomaNaturais.somatorio(s);

        Assert.assertEquals((s * (s + 1)/2), n);
    }

    @Test
    public void testSomatorio10() throws Exception {
        int s = 10;
        int n = SomaNaturais.somatorio(s);

        Assert.assertEquals((s * (s + 1)/2), n);
    }

    @Test
    public void testSomatorio98() throws Exception {
        int s = 98;
        int n = SomaNaturais.somatorio(s);

        Assert.assertEquals((s * (s + 1)/2), n);
    }


    @Test
    public void testSomatorio1000() throws Exception {
        int s = 1000;
        int n = SomaNaturais.somatorio(s);

        Assert.assertEquals((s * (s + 1)/2), n);
    }
}
