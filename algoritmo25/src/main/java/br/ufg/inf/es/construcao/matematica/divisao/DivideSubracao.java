package br.ufg.inf.es.construcao.matematica.divisao;

/**
 * Implementa��o de algoritmo que resolve uma divis�o entre dois
 * inteiros por meio de opera��es simples de subtra��o;
 */
public class DivideSubracao {

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
