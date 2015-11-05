package br.ufg.inf.es.construcao.potenciasoma;

import br.ufg.inf.es.construcao.produto.Produto;

/**
 * Algoritmo para efetuar operacoes de exponenciacao com o uso de funcoes de
 * produto pre-estabelecidas;
 */
public class PotenciaSoma {

    /**
     * realiza a operacao;
     * @param x base da operacao;
     * @param y expoente da operacao;
     * @return o valor da exponenciacao;
     * @throws IllegalArgumentException caso ocorra uma entrada de par�metro
     * inadequado
     * x deve ser um valor maior que 0, inclusive
     * y deve ser um valor maior que 0;
     */
    public static int potencia(int x, int y){
        if (x <= 0 || y < 1){
            throw new IllegalArgumentException("Par�metros de entrada inv�lidos");
        }

        int i = 1;
        int p = x;

        while (i < y){
            p = Produto.produto(p, x);
            i = i + 1;
        }

        return p;
    }
}
