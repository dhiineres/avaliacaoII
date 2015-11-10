package br.ufg.inf.es.construcao.matematica.fatoriais;

import br.ufg.inf.es.construcao.matematica.fatorial.Fatorial;

/**
 * Algoritmo que verifica se a soma dos fatorias dos dígitos de
 * um inteiro n maior que zero correspondem a esse número;
 */
public class SomaFatoriais {

    /**
     * verifica se a propriedade dos fatoriais é compatível com um inteiro n;
     * @param n inteiro a ser verificado;
     * @return {@code true} caso o número satisfaça à propriedade;
     *         {@code false} caso contrário;
     * @throws IllegalArgumentException caso o número de entrada seja menor
     * que zero;
     * o número informado não pode conter zeros;
     */
    public static boolean soma(int n){
        if (n < 0){
            throw new IllegalArgumentException("Numero invalido");
        }

        /**
         * if (n / 100 == 0 || (n % 100) / 10 == 0 || (n % 100) % 10 == 0){
         * throw new IllegalArgumentException("O número informado não pode" +
         * "conter zeros como algarismos");
         * /**
         *  * devido à limitações do algarismo de verificação de fatoriais;
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
