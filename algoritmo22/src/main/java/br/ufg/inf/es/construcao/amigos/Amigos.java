package br.ufg.inf.es.construcao.amigos;

import br.ufg.inf.es.construcao.matematica.SomaDivisores;
/**
 * Classe que verifica se a soma dos divisores de um inteiro n é igual
 * a m e vice-versa, definindo-os de amigos, caso a condição seja
 * verdadeira;
 */
public class Amigos {

    /**
     * verifica a "amizade" entre dois inteiros;
     * @param n inteiro 1;
     * @param m inteiro 2;
     * @return {@code V} caso a relação seja verdadeira;
     *         {@code F} caso a relação seja falsa;
     */
    public static char amigos(int n, int m) {
        if (n <= 0){
            throw new IllegalArgumentException("N invalido");
        }

        if (m <= 0){
            throw new IllegalArgumentException("M invalido");
        }

        int sn = SomaDivisores.somaDivisores(n);
        int sm = SomaDivisores.somaDivisores(m);

        if (sn == m && sm == n){
            return 'V';
        }else{
            return 'F';
        }
    }
}
