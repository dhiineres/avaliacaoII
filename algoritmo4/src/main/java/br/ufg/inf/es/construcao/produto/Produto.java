package br.ufg.inf.es.construcao.produto;

/**
 * Created by alunoinf on 29/10/15.
 */
public class Produto {

    public static int produto(int a, int b){
        if (a < 0 || b < 0){
            throw new IllegalArgumentException("Parâmetros inválidos");
        }

        int i = 1;
        int s = 0;

        while (i <= b){
            s = s + a;
            i = i + 1;
        }

        return s;
    }
}
