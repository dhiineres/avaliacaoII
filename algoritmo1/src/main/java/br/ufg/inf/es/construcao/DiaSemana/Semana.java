package br.ufg.inf.es.construcao.DiaSemana;

/**
 * Algoritmo de verificação de calendários;
 */
public class Semana {

    /**
     * Verifica o dia da semana de uma data informada;
     *
     * @param d Dia da data informada.
     * @param m Mês da data informada.
     * @param a Ano da data informada.
     * @return O valor do dia da semana:
     *         0- Segunda;
     *         1- Terça;
     *         2- Quarta;
     *         3- Quinta;
     *         4- Sexta;
     *         5- Sábado;
     *         6- Domingo.
     *
     *@throws java.lang.IllegalAccessException Caso dia, mês ou ano da data
     * informada estejam em períodos inválidos;
     */
    public static int dia(int d, int m, int a){
        if (d < 1 || d > 31){
            throw new IllegalArgumentException("Dia inválido");
        }

        if (m < 1 || m > 12){
            throw new IllegalArgumentException("Mês inválido");
        }

        if (a < 1753){
            throw new IllegalArgumentException("Ano inválido");
        }

        if (m == 1 || m == 2){
            m = m + 12;
            a --;
        }

        int s = d + 2 * m +(3 * (m + 1) / 5) + a + a / 4 - a / 100 + a / 400;

        return s % 7;
    }
}
