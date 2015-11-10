package br.ufg.inf.es.construcao.matematica.luhn;

import br.ufg.inf.es.construcao.matematica.Mod;

/**
 *
 */
public class Luhn {

    public static int luhn(int[] n){
        int k = n.length;

        if (k < 2){
            throw new IllegalArgumentException("Indice K invalido");
        }

        int i = 0; // acumula parcelas impares;
        int p = 0; // acumula parcelas pares;
        int l = k - 2; // remove o d�gito verificador do computo;
        boolean a = false;

        while (l >= 0){
            if (a){
                p = p + n[l]; // acumula d�gitos pares;
            }else{
                int t = n[l] * 2; //dobro de elemento de ordem �mpar;
                i = i + (t / 10) + (Mod.mod(t, 10)); // acumula d�gitos de t;
            }
            l = l - 1;
            a = !a;
        }

        return 10 - Mod.mod(i + p, 10);
    }
}
