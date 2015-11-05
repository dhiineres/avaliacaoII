package br.ufg.inf.es.construcao.matematica;

/**
 * Algoritmo de verificação matemática que calcula o somatório de n números
 * reais de acordo com um padrão pré-estabelecido;
 */
public class Somatorio {

    /**
     * Calcula o Somatório dos números de 0 até 1/(1+ (n * n));
     * @param n quantidade de números a serem somados;
     * @return o resultado da soma;
     * @throws IllegalArgumentException caso o número de entrada seja
     * inválido para o código:
     *  n deve ser maior que zero.
     */
    public static double somatorio(int n) {
        if (n < 1){
            throw new IllegalArgumentException("Parametro de entrada invalido");
        }

        double i = 1;
        double s = 0;

        while (i <= n) {
            double d = 1 + (i * i);
            s = s + (1 / d);
            i = i + 1;
        }

        return s;
    }
}
