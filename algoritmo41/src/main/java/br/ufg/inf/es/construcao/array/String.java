package br.ufg.inf.es.construcao.array;

/**
 * Algoritmo que recebe uma sequencia S de caracteres e a retorna em ordem
 * inversa;
 */
public class String {

    /**
     * inverte um array de caracteres;
     * @param S array a ser invertido;
     * @return S em ordem inversa;
     */
    public static char[] inverte(char[] S){
        if (S.length == 1){
            return S;
        }

        char[] Sa = new char[S.length];         // Array auxiliar de saída;
        char[] Sl = new char[S.length - 1];     /* Array que recebe o resto do
                                                   primeiro vetor */
        char[] c = new char[1]; // recebe o último elemento do array principal;
        c[0] = S[S.length - 1];

        for (int n = 0; n < S.length - 1; n ++){
            Sl[n] = S[n];
        }

        System.arraycopy(c, 0, Sa, 0, 1);
        System.arraycopy(inverte(Sl), 0, Sa, 1, S.length - 1);

        return Sa;
    }
}
