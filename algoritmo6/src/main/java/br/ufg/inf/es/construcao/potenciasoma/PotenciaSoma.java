package br.ufg.inf.es.construcao.potenciasoma;

/**
 * Algoritmo para efetuar opera��es de exponencia��o com o uso de fun��es de
 * produto pr� estabelecidas;
 */
public class PotenciaSoma {

    /**
     * realiza a opera��o;
     * @param x base da opera��o;
     * @param y expoente da opera��o;
     * @return o valor da exponencia��o;
     * @throws IllegalArgumentException caso ocorra uma entrada de par�metro
     * inadequado
     * x deve ser um valor maior que 0, inclusive
     * y deve ser um valor maior que 0;
     */
    public static int potencia(int x, int y){
        if (x <= 0 || y < 1){
            throw new IllegalArgumentException("Par�metros de entrada inv�lidos");
        }

        int i = 1;
        int p = x;

        while (i < y){
            p = produto(p, x);
            i = i + 1;
        }

        return p;
    }

    public static int produto(int a, int b){
        if (a < 0 || b < 0){
            throw new IllegalArgumentException("a e/ou b menor(es) que zero");
        }

        int i = 1;
        int s = 0;

        while (i <= b){
            s = s + a;
            i = i + 1;
        }

        return s;
    }
}
