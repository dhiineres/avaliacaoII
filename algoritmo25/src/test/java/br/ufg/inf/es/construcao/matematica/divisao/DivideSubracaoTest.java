package br.ufg.inf.es.construcao.matematica.divisao;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivideSubracaoTest {

    @Test (expected = IllegalArgumentException.class)
    public void testXInvalido() throws Exception {
        DivideSubracao.divide(-1, 3);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testYInvalido() throws Exception {
        DivideSubracao.divide(5, 0);
    }

    @Test
    public void test() throws Exception {
        assertEquals(2, DivideSubracao.divide(5, 2));
        assertEquals(5, DivideSubracao.divide(11, 2));
        assertEquals(1, DivideSubracao.divide(17, 13));
        assertEquals(100, DivideSubracao.divide(200, 2));
        assertEquals(9, DivideSubracao.divide(81, 9));
        assertEquals(150, DivideSubracao.divide(600, 4));
    }
}