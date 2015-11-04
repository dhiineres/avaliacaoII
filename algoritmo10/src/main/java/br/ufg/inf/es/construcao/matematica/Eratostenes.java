package br.ufg.inf.es.construcao.matematica;

/**
 * Algoritmo para verificar números primos com uso de um vetor de inteiros;
 */
public class Eratostenes {

    /**
     * verifica números primos;
     * @param a vetor a ser trabalhado;
     * @param n posição final a ser verificada no vetor;
     * @throws IllegalArgumentException caso os parâmetros de entrada
     *         sejam inválidos, inclusive:
     *         - n seja menor ou igual a um;
     *         - o comprimento do vetor seja menor que n + 1;
     *         - o vetor contenha algum valor entre suas posições [2] e [n]
     *           que seja diferente de zero.
     */
    public static void crivo(int[] a, int n){
        if (n <= 1){
            throw new IllegalArgumentException("N menor que 1");
        }

        if (a.length < n + 1){
            throw new IllegalArgumentException("Tamanho insuficiente do vetor");
        }

        for (int k = 2; k <= n; k++){
            if (a[k] != 0){
                throw new IllegalArgumentException("Vetor inválido");
            }
        }

        int i = 2;

        while (i <= (n / 2)) {
            if (a[i] == 0){
                int  c = i + i;

                while (c <= n){
                    a[c] = 1;
                    c = c + i;
                }
            }

            i = i + 1;
        }
    }
}
