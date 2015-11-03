package br.ufg.inf.es.construcao.propriedades;

/**
 * Algoritmo para verifica��o de propriedades mat�maticas em dados n�meros;
 */
public class Propriedade3025 {

    /**
     * Verifica a existencia da propriedade 3025 em um inteiro.
     * @param n inteiro a ser verificado.
     * @return {@code true} caso o n�mero apresente a propriedade;
     *         {@code false} caso contr�rio.
     * @throws IllegalArgumentException caso o inteiro apresentado n�o esteja
     * dentro dos par�metros pr� estabelecidos;
     * n deve ser maior que -1, inclusive
     * n deve ser menor que 10000.
     */
    public static boolean propriedade(int n){
        if (n < 0 || n > 9999){
            throw new IllegalArgumentException("Par�metro de entrada inv�lido");
        }

        int i = n / 100; //Dois d�gitos mais significativos;
        int j = n % 100; //Dois d�gitos menos significativos;

        return ((i + j) * (i + j) == n);
    }
}
