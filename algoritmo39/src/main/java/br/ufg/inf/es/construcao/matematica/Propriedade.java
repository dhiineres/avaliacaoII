package br.ufg.inf.es.construcao.matematica;

import br.ufg.inf.es.construcao.matematica.fatoriais.SomaFatoriais;

/**
 * Verifica a proriedade de Soma dos Fatoriais dos Dígitos
 * para cada n menor que 1000;
 */
public class Propriedade {

    /**
     * verifica a propriedade;
     * @return quantidade de números que atendem a propriedade;
     */
    public static int propriedade(){
        int t = 0;
        int n = 0;
        while (n < 1000){
            if (SomaFatoriais.soma(n)){
                t = t + 1;
            }
            
            n = n + 1;
        }

        return t;
    }
}
