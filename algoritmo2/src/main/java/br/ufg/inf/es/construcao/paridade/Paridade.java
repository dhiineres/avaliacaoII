package br.ufg.inf.es.construcao.paridade;

/**
 * Algoritmo de verificação de paridade em números inteiros;
 */
public class Paridade {

    /**
     * Verifica a paridade de dado número.
     *
     * @param n Inteiro a ser verificado.
     * @return  {@code true} caso o número seja par;
     *          {@code false} caso contrário;
     */
    public static boolean paridade(int n) {
        return (n % 2 == 0);
    }
}
