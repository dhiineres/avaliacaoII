package br.ufg.inf.es.construcao.matematica.divisao;

/**
 * Algoritmo que retorna o resto da divis�o de dois inteiros utilizando
 * opera��es de subtra��o;
 */
public class ModSimples {

    /**
     * retorna o resto da divis�o entre x e y;
     * @param x dividendo;
     * @param y divisor;
     * @return resto da divis�o;
     * @throws IllegalArgumentException caso os parametros de entrada sejam
     * invalidos:
     * x deve ser maior que zero;
     * y deve ser maior que zero;
     */
    public static int mod(int x, int y){
        if (x <= 0 || y <= 0){
            throw new IllegalArgumentException("x e y devem ser inteiros positivos");
        }
        int d = DivideSubracao.divide(x, y);
        return x - (d * y);
    }
}
