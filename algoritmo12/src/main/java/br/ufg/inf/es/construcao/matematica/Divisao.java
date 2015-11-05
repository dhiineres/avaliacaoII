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
    public static int mdc2(int a, int b){
        if (a < b){
            throw new IllegalArgumentException("Par�metro A inv�lido");
        }

        if(b <= 0){
            throw new IllegalArgumentException("Par�metro B inv�lido");
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