package br.ufg.inf.es.construcao.matematica;

import br.ufg.inf.es.construcao.Array.*;

/**
 * Algoritmo que verifica a m�dia entre os elementos 0 e n de
 * um array de inteiros informado;
 */
public class Array {

    /**
     * verifica a m�dia do array A;
     * @param A array a ser verificado;
     * @param n �ndice max do array;
     * @return A m�dia dos componentes do array A;
     * @throws IllegalArgumentException caso:
     * n seja menor que 0;
     * n seja maior que o comprimento do array;
     */
    public static double media(int[] A, int n){
        if (n > A.length){
            throw new IllegalArgumentException("Tamanho de vetor Invalido");
        }

        if (n < 0){
            throw new IllegalArgumentException("Entrada N invalida");
        }

        double s = br.ufg.inf.es.construcao.Array.soma(A, n);

        return s/n;
    }
}
