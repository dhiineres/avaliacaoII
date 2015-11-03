package br.ufg.inf.es.construcao.potenciasoma;

/**
 * Algoritmo para efetuar operações de exponenciação com o uso de funções de
 * produto pré estabelecidas;
 */
public class PotenciaSoma {

    /**
     * realiza a operação;
     * @param x base da operação;
     * @param y expoente da operação;
     * @return o valor da exponenciação;
     * @throws IllegalArgumentException caso ocorra uma entrada de parâmetro
     * inadequado
     * x deve ser um valor maior que 0, inclusive
     * y deve ser um valor maior que 0;
     */
    public static int potencia(int x, int y){
        if (x <= 0 || y < 1){
            throw new IllegalArgumentException("Parâmetros de entrada inválidos");
        }

        int i = 1;
        int p = x;

        while (i < y){
            p = produto(p, x);
            i = i + 1;
        }

        return p;
    }

    public static int produto(int a, int b){
        if (a < 0 || b < 0){
            throw new IllegalArgumentException("a e/ou b menor(es) que zero");
        }

        int i = 1;
        int s = 0;

        while (i <= b){
            s = s + a;
            i = i + 1;
        }

        return s;
    }
}
