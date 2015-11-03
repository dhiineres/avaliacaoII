package br.ufg.inf.es.construcao.matematica;

/**
 * Algoritmo para realiza��o de opera��es com expoente.
 */
public class Potencia {

    /**
     * Realiza a exponencia��o.
     * @param x base da opera��o.
     * @param y expoente da opera��o.
     * @return valor da exponencia��o.
     * @throws IllegalArgumentException caso:
     *         x seja menor que 1;
     *         y seja menor que 0;
     */
    public static int potencia(int x, int y){
        if (x <= 0 || y < 0){
            throw new IllegalArgumentException("Par�metros de entrada" +
                    " inv�lidos");
        }

        int i = 1;
        int p = 1;

        while (i <= y){
            p = p * x;
            i = i + 1;
        }

        return p;
    }

}
