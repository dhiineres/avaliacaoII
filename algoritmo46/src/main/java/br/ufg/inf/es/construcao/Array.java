package br.ufg.inf.es.construcao;

/**
 * Algoritmo que soma todos os componentes de um Array
 * de inteiros com indice menor ou igual a n;
 */
public class Array {

    /**
     * Soma os componentes de A;
     * @param A array a ser somado;
     * @param n índice máximo do array A;
     * @return a soma dos componenentes de A variando do
     * índice 0 até n;
     * @throws IllegalArgumentException caso:
     * n seja menor que zero;
     * n seja maior que o tamanho do vetor;
     */
    public static int soma(int[] A, int n){
        if (n > A.length){
            throw new IllegalArgumentException("Tamanho de vetor Invalido");
        }

        if (n < 0){
            throw new IllegalArgumentException("Entrada N invalida");
        }

        int s = 0; //acumula valores dos elementos do array;
        int i = 0;
        while (i < n){
            s = s + A[i];
            i = i + 1;
        }

        return s;
    }
}
