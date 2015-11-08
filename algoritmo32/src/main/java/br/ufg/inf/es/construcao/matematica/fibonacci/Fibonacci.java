package br.ufg.inf.es.construcao.matematica.fibonacci;

/**
 * Implementa��o de algoritmo que mostra o valor de �ndice n
 * da sequencia de Fibonacci;
 */
public class Fibonacci {

    /**
     * verifica Fib[n];
     * @param n valor a ser verificado;
     * @return o valor do Fibonacci de n;
     * @throws IllegalArgumentException caso o par�metro de
     * entrada seja inv�lido:
     * n deve ser maior ou igual a zero;
     */
    public static int fib(int n) {
        if (n < 0){
            throw new IllegalArgumentException("Parametro Invalido");
        }

        int a = 0; // Termo anterior;
        int c = 1; // Termo corrente;

        if (n == 0 || n == 1){
            return n;
        }
         int i = 2; // Neste ponto, n >= 2;

        while (i <= n){
            int t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c;
    }
}
