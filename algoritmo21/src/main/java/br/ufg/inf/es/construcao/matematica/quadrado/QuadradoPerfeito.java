package br.ufg.inf.es.construcao.matematica.quadrado;

/**
 * Algoritmo de verifica��o de inteiros, indicando se os mesmos s�o
 * ou n�o quadrados perfeitos;
 */
public class QuadradoPerfeito {

    /**
     * verifica se o n�mero informado � um quadrado perfeito;
     * @param k n�mero a ser verificado;
     * @return {@code true} caso k seja um quadrado perfeito;
     *         {@code false} caso contr�rio;
     * @throws IllegalArgumentException caso a entrada n�o satisfa�a
     * os padr�es do c�digo
     * k deve ser maior que zero;
     */
    public static boolean quadrado(int k) {
        if(k < 1) {
            throw new IllegalArgumentException("Entrada invalida");
        }

        int i = 1;
        int q = 1; /* quadrado perfeito */

        while (q < k) {
            i = i + 2;
            q = q + i;
        }

        return (q == k);
    }
}
