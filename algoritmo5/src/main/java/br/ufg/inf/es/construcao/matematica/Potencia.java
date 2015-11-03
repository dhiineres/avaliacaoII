package br.ufg.inf.es.construcao.matematica;

/**
 * Algoritmo para realização de operações com expoente.
 */
public class Potencia {

    /**
     * Realiza a exponenciação.
     * @param x base da operação.
     * @param y expoente da operação.
     * @return valor da exponenciação.
     * @throws IllegalArgumentException caso:
     *         x seja menor que 1;
     *         y seja menor que 0;
     */
    public static int potencia(int x, int y){
        if (x <= 0 || y < 0){
            throw new IllegalArgumentException("Parâmetros de entrada" +
                    " inválidos");
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
