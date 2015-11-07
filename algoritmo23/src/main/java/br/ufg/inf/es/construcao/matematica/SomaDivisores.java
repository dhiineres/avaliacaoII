package br.ufg.inf.es.construcao.matematica;

import br.ufg.inf.es.construcao.matematica.Mod;

/**
 * Algoritmo que retorna a soma de todos os divisores de um
 * inteiro N;
 */
public class SomaDivisores {

    /**
     * Retorna a soma dos divisores naturais;
     * @param n inteiro a ser verificado;
     * @return a soma dos divisores de n;
     * @throws IllegalArgumentException caso o valor n de entrada não
     * seja válido pelo algoritmo;
     * n deve ser maior que zero;
     */
    public static int somaDivisores(int n) {
        if (n <= 0){
            throw new IllegalArgumentException("N invalido");
        }

        int d = 2;
        int s = 1;

        while (d <= (n / 2)){
            if(Mod.mod(n, d) == 0){
                s = s + d;
            }

            d = d + 1;
        }

        return s;
    }
}
