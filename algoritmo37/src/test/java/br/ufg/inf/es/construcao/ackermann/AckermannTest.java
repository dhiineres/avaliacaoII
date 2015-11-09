package br.ufg.inf.es.construcao.ackermann;

import org.junit.Test;

import static org.junit.Assert.*;

public class AckermannTest {

    @Test (expected = IllegalArgumentException.class)
    public void testParametroXInvalido() throws Exception {
        Ackermann.funcao(-1, 3);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testParametroYInvalido() throws Exception {
        Ackermann.funcao(1, -1);
    }

    @Test
    public void testFuncao() throws Exception {
        assertEquals(1, Ackermann.funcao(0, 0));
        assertEquals(2, Ackermann.funcao(0, 1));
        assertEquals(2, Ackermann.funcao(1, 0));
        assertEquals(4, Ackermann.funcao(1, 2));
        assertEquals(7, Ackermann.funcao(2, 2));
        assertEquals(29, Ackermann.funcao(3, 2));
        assertEquals(61, Ackermann.funcao(3, 3));
    }
}