package br.ufg.inf.es.construcao.matematica.numeroDourado;

/**
 *Implementa��o de algoritmo para verifica��o da Raz�o Aurea;
 */
public class RazaoAurea {

    /**
     * Verifica Raz�o Aurea;
     * @param t1 Valor de verifica��o (maior que zero);
     * @param t2 Valor de verifica��o (maior que t1);
     * @param fat fator de precis�o (maior que zero);
     * @return raz�o aurea;
     */

    public static double razao(int t1, int t2, int fat){
        if (t1 <= 0){
            throw new IllegalArgumentException("t1");
        }

        if (t2 <= t1){
            throw new IllegalArgumentException("t2");
        }

        if (fat <= 0){
            throw new IllegalArgumentException("fator");
        }

        double tc = t2; //termo corrente;
        double ta = t1; //termo anterior;
        int i = 1;

        while (i <= fat){
            tc = tc + ta;
            ta = tc - ta;
            i ++;
        }

        return tc/ta;
    }
}

