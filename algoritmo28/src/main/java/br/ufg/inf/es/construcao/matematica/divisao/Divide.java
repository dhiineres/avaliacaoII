package br.ufg.inf.es.construcao.matematica.divisao;

import br.ufg.inf.es.construcao.matematica.Mod;
import br.ufg.inf.es.construcao.produto.Produto;
import java.util.Scanner;
public class Divide {

    public static void div(int a, int b, int k) {
        if (a <= 0){
            throw new IllegalArgumentException("A invalido");
        }

        if (b <= 0){
            throw new IllegalArgumentException("B invalido");
        }

        int d = DivideSomas.divideSomas(a, b);
        System.out.print(d);

        int r = Mod.mod(a, b);

        if (r != 0){
            System.out.print(",");
        }

        while ((r != 0) && (k > 0)){
            r = Produto.produto(10, r);
            d = DivideSomas.divideSomas(r, b);
            System.out.print(d);
            r = Mod.mod(r, b);
            k--;
        }
        System.out.println();
    }
}
