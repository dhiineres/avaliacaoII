package br.ufg.inf.es.construcao.matematica.cpf;

import br.ufg.inf.es.construcao.matematica.Mod;

/**
 * Classe que verifica a validade de um CPF com entrada em vetor;
 */
public class CPF {

    /**
     * Verifica a validade do CPF;
     * @param d vetor que contem o CPF;
     * @return {@code true} Caso o CPF informado seja Válido;
     *         {@code false} Caso contrário;
     * @throws IllegalArgumentException Caso o tamanho do vetor seja
     * incompátivel;
     * d.lenght deve ser igual(ou maior)  a doze;
     * os dígitos de índice d[1] a d[11] são os válidos;
     * apenas índices entre 0 e 9 são aceitáveis em cada posição do vetor;
     */
    public static boolean cpf(int[] d){
        if(d.length < 12){
            throw new IllegalArgumentException("Tamanho de vetor Invalido");
        }

        for (int x = 1; x < 12; x++){
            if(d[x] < 0 || d[x] > 9){
                throw new IllegalArgumentException("Entrada do vetor inválida");
            }
        }

        int c = 8;
        int p = d[9]; //p iniciado com o digito i;
        int s = d[9]; // s iniciado com o dígito i;

        while (c >= 1){
            p = p + d[c];
            s = s + p;
            c = c - 1;
        }

        int j = Mod.mod(Mod.mod(s, 11), 10);
        int k = Mod.mod(Mod.mod(s - p + (9 * j), 11), 10);

        return (j == d[10] && k == d[11]);
    }
}
