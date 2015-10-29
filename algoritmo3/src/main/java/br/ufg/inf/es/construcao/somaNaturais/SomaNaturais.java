package br.ufg.inf.es.construcao.somaNaturais;

/**
 * Implementação de algoritmo para verificação do somatório de números
 * naturais.
 */
public class SomaNaturais {

    /**
     * Soma os primeiros naturais.
     *
     * @param n Primeiros naturais a serem somados.
     * @return A soma dos primeiros n naturais.
     *
     * @throws java.lang.IllegalArgumentException Se o argumento n for menor
     *          que 1.
     */
    public static int somatorio(int n){
        if (n < 1){
            throw new IllegalArgumentException("Número deve ser maior que zero");
        }

        int i = 2;
        int s = 1;

        while (i <= n){
            s = s + i;
            i = i + 1;
        }

        return s;
    }
}
