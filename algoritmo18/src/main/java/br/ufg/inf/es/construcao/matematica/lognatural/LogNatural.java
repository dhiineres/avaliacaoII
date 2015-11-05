package br.ufg.inf.es.construcao.matematica.lognatural;

import br.ufg.inf.es.construcao.matematica.Potencia;
import br.ufg.inf.es.construcao.matematica.fatorial.Fatorial;

/**
 * Implementação de algoritmo para obtenção de Log natural com uso de operações
 * simples;
 */
public class LogNatural {

    /**
     * verifica log natural;
     * @param n inteiro a ser verificado;
     * @param k grau de precisao;
     * @return log;
     */
    public static double log(int n, int k) {
        if (n < 1 || k < 2) {
            throw new IllegalArgumentException("Parametros invalidos");
        }

        int i = 2;
        double e = n + 1;

        while (i <= k) {
            double p = Potencia.potencia(n, i);
            double f = Fatorial.fat(i);
            e = e + p / f;
            i = i + 1;
        }

        return e;
    }
}