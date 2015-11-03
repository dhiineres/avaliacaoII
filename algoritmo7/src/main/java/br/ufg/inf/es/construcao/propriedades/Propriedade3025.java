package br.ufg.inf.es.construcao.propriedades;

/**
 * Algoritmo para verificação de propriedades matématicas em dados números;
 */
public class Propriedade3025 {

    /**
     * Verifica a existencia da propriedade 3025 em um inteiro.
     * @param n inteiro a ser verificado.
     * @return {@code true} caso o número apresente a propriedade;
     *         {@code false} caso contrário.
     * @throws IllegalArgumentException caso o inteiro apresentado não esteja
     * dentro dos parâmetros pré estabelecidos;
     * n deve ser maior que -1, inclusive
     * n deve ser menor que 10000.
     */
    public static boolean propriedade(int n){
        if (n < 0 || n > 9999){
            throw new IllegalArgumentException("Parâmetro de entrada inválido");
        }

        int i = n / 100; //Dois dígitos mais significativos;
        int j = n % 100; //Dois dígitos menos significativos;

        return ((i + j) * (i + j) == n);
    }
}
