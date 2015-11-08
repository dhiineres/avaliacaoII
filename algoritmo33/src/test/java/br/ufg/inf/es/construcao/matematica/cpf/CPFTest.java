package br.ufg.inf.es.construcao.matematica.cpf;

import org.junit.Test;

import static org.junit.Assert.*;

public class CPFTest {

    @Test (expected = IllegalArgumentException.class)
    public void testTamanhodeVetorInvalido() throws Exception {
        int[] cpf = new int[10];
        CPF.cpf(cpf);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testConteudoVetorInvalido0() throws Exception{
        int[] cpf = {0, 1, 1, 3, -1, 7, 5, 6, 7, 0, 0, 0};
        CPF.cpf(cpf);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testConteudoVetorInvalido10() throws Exception{
        int[] cpf = {0, 1, 1, 3, 11, 7, 5, 6, 7, 0, 0, 0};
        CPF.cpf(cpf);
    }

    @Test
    public void testCpfValido() throws Exception {
        int[] cpf1 = {0, 7, 0, 0, 7, 6, 9, 3, 9, 1, 1, 1};
        assertTrue(CPF.cpf(cpf1));
        int[] cpf2 = {0, 4, 6, 4, 5, 0, 7, 1, 8, 1, 5, 3};
        assertTrue(CPF.cpf(cpf2));
    }

    @Test
    public void testCpfInvalido() throws Exception {
        int[] cpf = {0, 7, 0, 1, 7, 6, 9, 3, 9, 1, 1, 1};
        assertFalse(CPF.cpf(cpf));
    }
}