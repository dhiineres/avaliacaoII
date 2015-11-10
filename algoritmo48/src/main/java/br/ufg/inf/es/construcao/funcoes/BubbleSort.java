package br.ufg.inf.es.construcao.funcoes;

/**
 * Algoritmo de organiza��o de Array por meio do m�todo
 * Bubble Sort;
 */
public class BubbleSort{

    /**
     * Aplica o m�todo Bubble Sort entre os �ndices
     * @param A Vetor a ser organizado;
     * @param n �ndice Max do vetor;
     * @throws IllegalArgumentException caso:
     * n seja menor que zero;
     * n seja maior que o comprimento do vetor;
     */
    public static void bubleSort(int[] A, int n){
        if (n > A.length){
            throw new IllegalArgumentException("Tamanho de vetor Invalido");
        }

        if (n < 0){
            throw new IllegalArgumentException("Entrada N invalida");
        }

        int p = n;
        while (p >= 1){
            int i = 0;
            while (i < p - 1){
                if (A[i] < A[i + 1]){
                    int t = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = t;
                }

                i = i + 1;
            }

            p = p - 1;
        }
    }
}
