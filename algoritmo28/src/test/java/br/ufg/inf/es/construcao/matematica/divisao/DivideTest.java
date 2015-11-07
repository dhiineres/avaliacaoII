package br.ufg.inf.es.construcao.matematica.divisao;

import java.nio.file.Path;
import java.security.DigestInputStream;
import java.util.Scanner;
import org.junit.Test;

import static org.junit.Assert.*;


public class DivideTest {

    /**
     * @Test
     * public void testDiv522() throws Exception {
     *      Scanner in = new System.out();
     *      Divide.div(5, 2, 2);
     *       assertSame("2,5", Divide.div(5, 2, 2););
     * }
     */

    @Test (expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception{
        Divide.div(0, 1, 1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception{
        Divide.div(1, 0, 1);
    }

}