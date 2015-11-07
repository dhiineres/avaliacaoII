package br.ufg.inf.es.construcao.matematica.divisao;

/**
 * Algoritmo que realiza divisões inteiras utilizando apenas
 * operações de soma;
 */
public class DivideSomas {

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
    public static int divideSomas(int x, int y){
        if (x < 0){
            throw new IllegalArgumentException("X invalido");
        }

        if (y <= 0){
            throw new IllegalArgumentException("Y invalido");
        }

        int d = 0;
        int s = y;

        while (s <= x) {
            s = s + y;
            d = d + 1;
        }

        return d;
    }
}
