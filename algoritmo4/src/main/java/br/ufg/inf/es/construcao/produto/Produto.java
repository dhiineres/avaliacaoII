package br.ufg.inf.es.construcao.produto;

/**
 * Algoritmo para realização de operações de multiplicação com uso de somas;
 */
public class Produto {

    /**
     * realiza a operação de multiplicação entre dois inteiros;
     * @param a primeiro fator;
     * @param b segundo fator;
     * @return o resultado da multiplicação;
     * @throws IllegalArgumentException caso os parâmetros de entrada estejam
     * inadequados;
     * a deve ser maior que zero, inclusive
     * b deve ser maior que zero.
     */
    public static int produto(int a, int b){
        if (a < 0 || b < 0){
            throw new IllegalArgumentException("Parâmetros inválidos");
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
