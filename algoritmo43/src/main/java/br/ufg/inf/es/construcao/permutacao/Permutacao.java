package br.ufg.inf.es.construcao.permutacao;

import br.ufg.inf.es.construcao.matematica.fatorial.Fatorial;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.List;

/**
 * Algoritmo que realiza a permutação em um vetor de caracteres;
 */
public class Permutacao {

    /**
     * realiza a permutação;
     * @param p prefixo da permutação;
     * @param S Array a ser permutado
     * @param result uma lista de resultados possíveis;
     * @return a lista de resultantes da permutação;
     */
    public static List<char[]> permuta(char[] p, char[] S, List<char[]> result){
        if (S == null){
            throw new IllegalArgumentException("Vetor S invalido");
        }

        if (S.length == 1){
            char[] fim = new char[S.length + p.length];
            System.arraycopy(fim, 0, p, 0, p.length);
            System.arraycopy(fim, p.length, S, 0, 1);
            result.add(fim);
        }

        else {
            for (int i = 0; i < S.length; i++){
                char[] Sl = new char[S.length - 1];
                char[] pl = new char[p.length + 1];
                for (int j = 0; j < S.length; j++){
                    int k = 0;
                    if (j == i){
                        System.arraycopy(pl, 0, S[i], 0, 1);
                    } else {
                        Sl[k] = S[i];
                        k = k + 1;
                    }
                }
                permuta(pl, Sl, result);
            }
        }

        return result;
    }
}
