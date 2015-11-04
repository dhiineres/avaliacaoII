package br.ufg.inf.es.construcao.matematica;

/**
 * Algoritmo de verifica��o de n�meros primos;
 */
public class Primo {

    /**
     * verifica se um dado inteiro � primo ou n�o;
     * @param n inteiro a ser verificado.
     * @return {@code true} caso o inteiro seja primo;
     *         {@code false} caso contr�rio.
     * @throws IllegalArgumentException caso a entrada
     *         seja um inteiro menor que 2.
     */
    public static boolean primo(int n){
        if (n <= 1){
            throw new IllegalArgumentException("N menor que 1");
        }

        int i = 2;

        while (i <= (n - 1)){
            if (n % i == 0){
                return false;
            }

            i = i + 1;
        }

        return true;
    }
}
