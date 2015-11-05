package br.ufg.inf.es.construcao.matematica;

/**
 * Servi�os oferecidos para verifica��es de propriedades de divis�o;
 */
public class Divisao {

    /**
     * Verifica o m�ximo divisor comum entre dois inteiros positivos.
     * @param a inteiro 1;
     * @param b inteiro 2;
     * @return o MDC relacionado a esses inteiros;
     * @throws IllegalArgumentException Caso seja definido algum par�metro
     *         de entrada inv�lido:
     *         - a deve ser maior ou igual a b, inclusive;
     *         - b deve ser maior que zero.
     */
    public static int mdc(int a, int b){
        if(a < b){
            throw new IllegalArgumentException("Parametro A invalido");
        }

        if(b <= 0){
        throw new IllegalArgumentException("Parametro B invalido");
        }

        while (b != 0){
            int m = a % b;
            a = b;
            b = m;
        }

        return a;
    }
}
