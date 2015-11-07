package br.ufg.inf.es.construcao.amigos;

import org.junit.Test;

import static org.junit.Assert.*;

public class AmigosTest {

    @Test (expected = IllegalArgumentException.class)
    public void testNInvalido() throws Exception {
        Amigos.amigos(0, 5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMInvalido() throws Exception {
        Amigos.amigos(5, 0);
    }

    @Test
    public void testAmigos() throws Exception {
        assertEquals('V', Amigos.amigos(1, 1));
        assertEquals('V', Amigos.amigos(220, 284));
    }

    @Test
    public void testNaoAmigos() throws Exception {
        assertEquals('F', Amigos.amigos(25, 7));
        assertEquals('F', Amigos.amigos(40, 53));

    }
}