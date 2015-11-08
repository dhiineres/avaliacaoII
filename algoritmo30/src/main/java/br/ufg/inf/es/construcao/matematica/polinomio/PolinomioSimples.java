package br.ufg.inf.es.construcao.matematica.polinomio;

import br.ufg.inf.es.construcao.matematica.Potencia;

/**
 * Algoritmo que verifica a solução de polinômios simples;
 */
public class PolinomioSimples {

    /**
     * verifica o polinomio;
     * @param x inteiro a ser verificado;
     * @param g índice do vetor;
     * @param a vetor;
     * @return o resultado do polinomio;
     * @throws IllegalArgumentException caso os parâmetros de entrada sejam inválidos:
     * caso g seja menor que 1, inclusive;
     * caso o tamanho do vetor a seja menor que g + 1, inclusive;
     * caso o vetor a no índice [g] seja igual a zero;
     */
    public static int pol(int x, int g, int[] a){
        if (g < 1){
            throw new IllegalArgumentException("G menor que 1");
        }

        if (a.length < g + 1){
            throw new IllegalArgumentException("Tamanho de vetor invalido");
        }

        if (a[g] == 0){
            throw new IllegalArgumentException("Vetor invalido");
        }

        int t = Potencia.potencia(x, g);
        int p = a[0];
        int i = 1;
        while (i <= g){
            t = Potencia.potencia(x, i);
            p = p + (a[i] * t);
            i = i + 1;
        }

        return p;
    }
}
