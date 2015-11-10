package br.ufg.inf.es.construcao.matematica.fatoriais;

import br.ufg.inf.es.construcao.matematica.fatorial.Fatorial;

/**
 * Algoritmo que verifica se a soma dos fatorias dos d�gitos de
 * um inteiro n maior que zero correspondem a esse n�mero;
 */
public class SomaFatoriais {

    /**
     * verifica se a propriedade dos fatoriais � compat�vel com um inteiro n;
     * @param n inteiro a ser verificado;
     * @return {@code true} caso o n�mero satisfa�a � propriedade;
     *         {@code false} caso contr�rio;
     * @throws IllegalArgumentException caso o n�mero de entrada seja menor
     * que zero;
     * o n�mero informado n�o pode conter zeros;
     */
    public static boolean soma(int n){
        if (n < 0){
            throw new IllegalArgumentException("Numero invalido");
        }

        /**
         * if (n / 100 == 0 || (n % 100) / 10 == 0 || (n % 100) % 10 == 0){
         * throw new IllegalArgumentException("O n�mero informado n�o pode" +
         * "conter zeros como algarismos");
         * /**
         *  * devido � limita��es do algarismo de verifica��o de fatoriais;
         *   *
         *   }
         */


        int a = n / 100;
        int b = (n - 100 * a) / 10;
        int c = n % 10;
        int s = Fatorial.fat(a) + Fatorial.fat(b) + Fatorial.fat(c);

        return (s == n);
    }
}
