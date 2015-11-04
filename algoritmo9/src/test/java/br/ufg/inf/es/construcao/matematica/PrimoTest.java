package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimoTest {

    @Test (expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Primo.primo(1);
    }

    @Test
    public void testCasosVerdadeiros() throws Exception {
        assertTrue(Primo.primo(2));
        assertTrue(Primo.primo(3));
        assertTrue(Primo.primo(47));
        assertTrue(Primo.primo(733));
        assertTrue(Primo.primo(1009));
        assertTrue(Primo.primo(1451));
    }

    @Test
    public void testCasosFalsos() throws Exception {
        assertFalse(Primo.primo(15));
        assertFalse(Primo.primo(20));
        assertFalse(Primo.primo(500));
        assertFalse(Primo.primo(1020));
        assertFalse(Primo.primo(1365));
        assertFalse(Primo.primo(1437));
    }
}