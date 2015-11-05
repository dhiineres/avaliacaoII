package br.ufg.inf.es.construcao.matematica.fatorial;

/**
 * Algoritmo matemático que realiza verifica o fatorial de um inteiro de entrada n.
 */
public class Fatorial {

    /**
     * verifica o fatorial de n;
     * @param n inteiro a ser verificado;
     * @return o fatorial de n;
     * @throws java.lang.IllegalArgumentException Caso o elemento de entrada n não
     * esteja dentro dos padrões do algoritmo;
     * n deve ser maior que 0;
     */
    public static int fat(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Entrada invalida");
        }

        int i = 2;
        int f = 1;

        while (i <= n) {
            f = f * i;
            i = i + 1;
        }

        return f;
    }
}
