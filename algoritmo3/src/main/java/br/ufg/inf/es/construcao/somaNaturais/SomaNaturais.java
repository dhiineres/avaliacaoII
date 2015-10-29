package br.ufg.inf.es.construcao.somaNaturais;

/**
 * Implementação de algoritmo para verificação do somatório de números
 * naturais.
 */
public class SomaNaturais {

    /**
     * Realiza o somatório.
     *
     * @param n Número natural indicador de maior elemento da soma.
     * @return O somatório dos numeros <= n;
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
