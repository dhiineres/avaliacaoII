package br.ufg.inf.es.construcao.matematica;

/**
 * Algoritmo que define o valor de uma série harmônica até o valor 1/n;
 */
public class Harmonicos {

    public static double harmonico(int n){
        if (n < 1){
            throw new IllegalArgumentException("N menor que 1");
        }

        double i = 2;
        double s = 1;

        while (i <= n){
            s = s + (1 / i);
            i = i + 1;
        }

        return s;
    }
}
