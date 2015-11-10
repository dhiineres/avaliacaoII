package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;

import static org.junit.Assert.*;

public class PropriedadeTest {

    /**
     * o teste do algoritmo 39 sempre dará erro, pois faz uso
     * indireto do algoritmo 16, o qual não aceita o número
     * 0 em seus testes;
     * @throws Exception quando algum número que contenha o dígito
     * zero chegue ao algoritmo 40;
     */
    @Test (expected = IllegalArgumentException.class)
    public void testPropriedade() throws Exception {
        Propriedade.propriedade();
    }
}