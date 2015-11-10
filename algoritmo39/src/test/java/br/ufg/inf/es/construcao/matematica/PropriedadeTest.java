package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;

import static org.junit.Assert.*;

public class PropriedadeTest {

    /**
     * o teste do algoritmo 39 sempre dar� erro, pois faz uso
     * indireto do algoritmo 16, o qual n�o aceita o n�mero
     * 0 em seus testes;
     * @throws Exception quando algum n�mero que contenha o d�gito
     * zero chegue ao algoritmo 40;
     */
    @Test (expected = IllegalArgumentException.class)
    public void testPropriedade() throws Exception {
        Propriedade.propriedade();
    }
}