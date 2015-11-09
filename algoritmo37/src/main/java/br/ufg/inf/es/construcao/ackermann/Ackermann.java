package br.ufg.inf.es.construcao.ackermann;

/**
 * Implementação da Função de Ackermann;
 */
public class Ackermann {

    /**
     * Verifica o Algoritmo de Ackerman para os números informados;
     * @param x Parâmetro um;
     * @param y Parâmetro dois;
     * @return o resultado da função de Ackerman nesses parametros;
     * @throws IllegalArgumentException caso algum dos parâmetros informados
     * apresente alguma invalidade pelo algoritmo:
     * x e y devem ser maiores ou iguais a zero;
     */
    public static int funcao(int x, int y){
        if (x < 0){
            throw new IllegalArgumentException("X invalido");
        }

        if (y < 0){
            throw new IllegalArgumentException("Y invalido");
        }

        if (x == 0){
            return y + 1;
        }

        if (y == 0){
            return funcao(x - 1, 1);
        }

        return funcao(x - 1, funcao(x, y - 1));
    }
}
