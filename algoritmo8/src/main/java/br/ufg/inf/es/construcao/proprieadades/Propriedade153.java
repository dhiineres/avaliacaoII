package br.ufg.inf.es.construcao.proprieadades;

/**
 * Algoritmo para verificação de propriedades matématicas em dados números;
 */
public class Propriedade153 {

    /**
     * Verifica a existencia da propriedade 153 em um inteiro n;
     * @param n Inteiro a ser verificado.
     * @return {@code true} caso o número satisfaça a propriedade;
     *         {@code false} caso contrário.
     * @throws IllegalArgumentException caso o número de entrada não satisfaça
     * os parâmetros pré-estabelecidos:
     * n deve ser maior que 0, inclusive
     * n deve ser menor que 1000;
     */
    public static boolean propriedade(int n){
        if (n < 0 || n > 999){
            throw new IllegalArgumentException("Parâmetro de entrada invalido");
        }

        int i = n / 100;
        int j = (n - 100 * i) / 10;
        int k = n % 10;

        return (i * i * i + j * j * j + k * k * k == n);
    }
}
