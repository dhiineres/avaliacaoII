package br.ufg.inf.es.construcao.matematica.triangulo;

import br.ufg.inf.es.construcao.matematica.sqrt.Sqrt;

/**
 * Classe que verifica a hipotenusa de um triangulo ret�ngulo
 * com base em dois catetos;
 */
public class Hipotenusa {

    /**
     * verifica a hipotenusa;
     * @param a cateto a;
     * @param b cateto b;
     * @return hipotenusa;
     *
     */
    public static double h(int a, int b){
        if (a <= 0){
            throw new IllegalArgumentException("Medida A inv�lida");
        }

        if (b <= 0){
            throw new IllegalArgumentException("Medida B inv�lida");
        }

        double x = a * a;
        double y = b * b;
        double r = Sqrt.raiz(x + y, 100);
        return r;
    }
}
