package br.ufg.inf.es.construcao.matematica.fatorial;

//import br.ufg.inf.es.construcao;

/**
 * Created by alunoinf on 05/11/15.
 */
public class Fatorial {

    public static int fatorialSoma(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Parâmetro inválido");
        }

        int i = 2;
        int f = 1;

        while (i < n){
            // f = Produto.produto(f, i);
            f = f * i;
            i = i + 1;
        }

        return f;
    }
}
