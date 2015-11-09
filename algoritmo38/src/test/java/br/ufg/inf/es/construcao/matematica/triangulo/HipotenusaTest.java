package br.ufg.inf.es.construcao.matematica.triangulo;

import org.junit.Test;

import static org.junit.Assert.*;

public class HipotenusaTest {

    @Test (expected = IllegalArgumentException.class)
    public void testCatetoAInvalido() throws Exception {
        Hipotenusa.h(0, 5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCatetoBInvalido() throws Exception {
        Hipotenusa.h(6, 0);
    }

    @Test
    public void testHipotenusas() throws Exception {
        assertEquals(5, Hipotenusa.h(3, 4), 0.1);
        assertEquals(10, Hipotenusa.h(6, 8), 0.1);
        assertEquals(30, Hipotenusa.h(24, 18), 0.1);

    }
}