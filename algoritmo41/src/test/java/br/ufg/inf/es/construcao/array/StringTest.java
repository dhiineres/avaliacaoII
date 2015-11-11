package br.ufg.inf.es.construcao.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringTest {

    @Test
    public void testInverteVogais() throws Exception {
        char[] si = {'u', 'o', 'i', 'e', 'a'};
        char[] so = {'a', 'e', 'i', 'o', 'u'};
        char[] sa = String.inverte(si);
        for (int i = 0; i < 5; i ++){
            assertEquals(so[i], sa[i]);
        }
    }

    @Test
    public void testInverteArrayUmaLetra() throws Exception {
        char[] si = {'a'};
        char[] so = {'a'};
        char[] sa = String.inverte(si);
        assertEquals(so[0], sa[0]);
    }

    @Test
    public void testInverteArray() throws Exception {
        char[] si = {'1', '1', '2', '3', '5', '8', '1', '3', '2', '1'};
        char[] so = {'1', '2', '3', '1', '8', '5', '3', '2', '1', '1'};
        char[] sa = String.inverte(si);
        for (int i = 0; i < si.length; i++){
            int n = i % si.length;
            n = si.length - n -1 ;
            assertEquals(si[i], sa[n]);
            assertEquals(sa[i], so[i]);
        }
    }

    @Test
    public void testInverteAlfabeto() throws Exception{
        char[] si = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
                'X', 'Y', 'Z'};
        char[] sa = String.inverte(si);
        for (int i = 0; i < si.length; i++){
            int n = i % si.length;
            n = si.length - n -1 ;
            assertEquals(si[i], sa[n]);
        }
    }


}