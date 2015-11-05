package br.ufg.inf.es.construcao.matematica;

/**
 * Serviços oferecidos para verificações de propriedades de divisão;
 */
public class Divisao {

    /**
     * Verifica o máximo divisor comum entre dois inteiros positivos.
     * @param a inteiro 1;
     * @param b inteiro 2;
     * @return o MDC relacionado a esses inteiros;
     * @throws IllegalArgumentException Caso seja definido algum parâmetro
     *         de entrada inválido:
     *         - a deve ser maior ou igual a b, inclusive;
     *         - b deve ser maior que zero.
     */
    public static int mdc2(int a, int b){
        if (a < b){
            throw new IllegalArgumentException("Parâmetro A inválido");
        }

        if(b <= 0){
            throw new IllegalArgumentException("Parâmetro B inválido");
        }

        while (a != b){
            if (a > b){
                a = a - b;
            }else {
                b = b - a;
            }
        }
        return a;
    }
}