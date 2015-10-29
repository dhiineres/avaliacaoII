package br.ufg.inf.es.construcao.DiaSemana;

import org.junit.*;

public class SemanaTest {
    @Test (expected = IllegalArgumentException.class)
    public void testDiaInvalidoMenos() throws Exception {
        Semana.dia(-3, 5, 1997);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testDiaInvalidoMais() throws Exception {
        Semana.dia(32, 5, 1997);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMesInvalidoMenos() throws Exception {
        Semana.dia(21, 0, 1997);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMesInvalidoMais() throws Exception {
        Semana.dia(301, 13, 1997);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testAnoInvalido() throws Exception {
        Semana.dia(2, 6, 1235);
    }

    @Test
    public void testDatasConhecidas() throws Exception {
        Assert.assertEquals(0, Semana.dia(2, 6, 1997));
        Assert.assertEquals(2, Semana.dia(21, 4, 1937));
        Assert.assertEquals(3, Semana.dia(29, 10, 2015));
        Assert.assertEquals(6, Semana.dia(5, 4, 2015));
    }
}
