package br.ufg.inf.es.construcao.matematica.divisao;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivideSomasTest {

    @Test (expected = IllegalArgumentException.class)
    public void testXInvalido() throws Exception {
        DivideSomas.divideSomas(-1, 3);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testYInvalido() throws Exception {
        DivideSomas.divideSomas(5, 0);
    }

    @Test
    public void test() throws Exception {
        assertEquals(2, DivideSomas.divideSomas(5, 2));
        assertEquals(5, DivideSomas.divideSomas(11, 2));
        assertEquals(1, DivideSomas.divideSomas(17, 13));
        assertEquals(100, DivideSomas.divideSomas(200, 2));
        assertEquals(9, DivideSomas.divideSomas(81, 9));
        assertEquals(150, DivideSomas.divideSomas(600, 4));
    }
}