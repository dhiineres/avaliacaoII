package br.ufg.inf.es.construcao.matematica.divisao;

/**
 * Implementação de algoritmo que resolve uma divisão entre dois
 * inteiros por meio de operações simples de subtração;
 */
public class DivideSubracao {

    /**
     * realiza a divisão;
     * @param x dividendo;
     * @param y divisor;
     * @return resultado da divisão;
     * @throws IllegalArgumentException caso os parâmetros de entrada sejam
     * inválidos segundo o algoritmo:
     * x deve ser maior que -1, inclusive
     * y deve ser maior que zero;
     */
    public static int divide(int x, int y) {
        if (x < 0){
            throw new IllegalArgumentException("X invalido");
        }

        if (y <= 0){
            throw new IllegalArgumentException("Y invalido");
        }

        int d = 0;
        int s = x;

        while (s >= y){
            s = s - y;
            d = d + 1;
        }

        return d;
    }
}
