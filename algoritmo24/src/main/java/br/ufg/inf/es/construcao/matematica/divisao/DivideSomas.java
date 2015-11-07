package br.ufg.inf.es.construcao.matematica.divisao;

/**
 * Algoritmo que realiza divis�es inteiras utilizando apenas
 * opera��es de soma;
 */
public class DivideSomas {

    /**
     * realiza a divis�o;
     * @param x dividendo;
     * @param y divisor;
     * @return resultado da divis�o;
     * @throws IllegalArgumentException caso os par�metros de entrada sejam
     * inv�lidos segundo o algoritmo:
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
