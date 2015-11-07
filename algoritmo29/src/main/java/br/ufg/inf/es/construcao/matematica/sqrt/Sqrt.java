package br.ufg.inf.es.construcao.matematica.sqrt;

/**
 * Algoritmo que verifica a raiz quadrada de um número n;
 */
public class Sqrt {

    /**
     * verifica a raiz quadrada;
     * @param n número a ser verificado;
     * @param i grau de exatidão da raiz;
     * @return a raiz quadrada de n;
     * @throws IllegalArgumentException caso n seja menor que 1;
     */
    public static double raiz(double n, int i){
        if (n <= 0){
            throw new IllegalArgumentException("N inválido");
        }

        double r = 1;
        while (i >= 0){
            r = (r + (n / r)) / 2;
            i = i - 1;
        }

        return r;
    }
}
