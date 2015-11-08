package br.ufg.inf.br.es.construcao.matematica.equacao;

/**
 * Algoritmo que verifica todas as soluções possíveis para a equação
 * 2x + 3y + 5z + 7w = 210, com os valores de x variando entre 1 e 96,
 * de y entre 1 e 65, de z entre 1 e 39, e de w entre 1 e 28;
 */
public class Equacao {

    /**
     * verifica a quantidade de soluções;
     * @return a quantidade de soluçoes possíveis para a equacao;
     */
    public static int equacao(){
        int s = 0; //conta as soluções;
        int x = 1;

        while (x <= 96){
            int y = 1;

            while (y <= 65){
                int z = 1;

                while (z <= 39){
                    int w = 1;

                    while (w <= 28){
                        if (2 * x + 3 * y + 5 * z + 7 * w == 210){
                            s = s + 1;
                        }

                        w = w + 1;
                    }

                    z = z + 1;
                }

                y = y + 1;
            }

            x = x + 1;
        }

        return s;
    }
}
