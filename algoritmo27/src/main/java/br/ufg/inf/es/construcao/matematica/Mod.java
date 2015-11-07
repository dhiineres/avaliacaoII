package br.ufg.inf.es.construcao.matematica;

/**
 * Algoritmo para verificação do resto de uma divisão;
 */
public class Mod {

    /**
     * Verifica o mod entre dois inteiros;
     * @param x
     * @param y
     * @return
     */
    public static int mod(int x, int y) {
        if (x < 0) {
            throw new IllegalArgumentException("X invalido");
        }

        if (y <= 0){
            throw new IllegalArgumentException("Y invalido");
        }

        int s = x;

        while(s >= y) {
            s = s - y;
        }

        return s;
    }
}
