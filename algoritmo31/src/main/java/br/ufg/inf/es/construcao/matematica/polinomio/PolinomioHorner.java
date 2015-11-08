package br.ufg.inf.es.construcao.matematica.polinomio;

/**
 * Implementação de algoritmo que utiliza o esquema de Horner
 * (multiplicação alinhada);
 */
public class PolinomioHorner {

    /**
     * verifica o polinomio;
     * @param x inteiro a ser verificado;
     * @param g índice do vetor;
     * @param a vetor;
     * @return o resultado do polinomio;
     * @throws IllegalArgumentException caso os parâmetros de entrada sejam inválidos:
     * caso g seja menor que 1, inclusive;
     * caso o tamanho do vetor a seja menor que g + 1, inclusive;
     */
    public static int horner(int x, int g, int[] a){
        if (g < 1){
            throw new IllegalArgumentException("G menor que 1");
        }

        if (a.length < g + 1){
            throw new IllegalArgumentException("Tamanho de vetor invalido");
        }

        int p = a[g];
        int i = g - 1;

        while (i >= 0) {
            p = p * x + a[i];
            i = i - 1;
        }

        return p;
    }
}
