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
    public static List<String> permuta(
            String p, String S, List<String> result) {

        if (S.length() == 1) {
            result.add(p + S);
            return result;
        }

        for (int i = 0; i < S.length(); i++) {
            char cI = S.charAt(i);

            StringBuilder sLinha = new StringBuilder(S);
            sLinha.deleteCharAt(i);

            String pLinha = p + cI;

            permuta(pLinha, sLinha.toString(), result);
        }

        return result;
    }
}
