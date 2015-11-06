package br.ufg.inf.es.construcao.matematica.logn;

/**
 * Implementa��o de algoritmo para obten��o de Log natural com uso de opera��es
 * simples;
 */
public class Logaritmo {

    /**
     * verifica log natural;
     * @param n n�mero a ser verificado;
     * @param k grau de precisao;
     * @return log;
     * @throws IllegalArgumentException caso um ou mais par�metros de entrada
     * sejam inv�lidos:
     * n deve ser maior que 0;
     * k deve ser maior que 1;
     */
    public static double log(double n, double k){
        if (n < 1) {
            throw new IllegalArgumentException("N invalido");
        }

        if (k < 2) {
            throw new IllegalArgumentException("K invalido");
        }

        double i = 2;
        double e = n + 1;
        double t = n;

        while (i <= k){
            t = ((t * n) / i);
            e = e + t;
            i = i + 1;
        }

        return e;
    }
}
