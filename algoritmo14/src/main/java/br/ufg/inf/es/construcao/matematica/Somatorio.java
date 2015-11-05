package br.ufg.inf.es.construcao.matematica;

/**
 * Algoritmo de verifica��o matem�tica que calcula o somat�rio de n n�meros
 * reais de acordo com um padr�o pr�-estabelecido;
 */
public class Somatorio {

    /**
     * Calcula o Somat�rio dos n�meros de 0 at� 1/(1+ (n * n));
     * @param n quantidade de n�meros a serem somados;
     * @return o resultado da soma;
     * @throws IllegalArgumentException caso o n�mero de entrada seja
     * inv�lido para o c�digo:
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
