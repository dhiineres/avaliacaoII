package br.ufg.inf.es.construcao.permutacao;

import br.ufg.inf.es.construcao.matematica.fatorial.Fatorial;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class PermutacaoTest {
    @Test
    public void testPermuta() throws Exception {
        String p = "";
        String S = "ab";
        List<String> saida = Permutacao.permuta(p, S, new ArrayList<String>());
        assertEquals(2, saida.size());
        assertTrue(saida.contains("ab"));
        assertTrue(saida.contains("ba"));
    }

    @Test
    public void testPemutacao() throws Exception {
        String S = "dhiogo";
        List<String> saida = Permutacao.permuta(new String(), S,
                new ArrayList<String>());
        assertEquals(Fatorial.fat(6), saida.size());
        assertTrue(saida.contains("ogoihd"));
        assertTrue(saida.contains("goohid"));
        assertTrue(saida.contains("goohdi"));
    }

    @Test
    public void testCasoTriviaol() throws Exception {
        String S = "hijk";
        List<String> saida = Permutacao.permuta(new String(), S,
                new ArrayList<String>());
        assertEquals(24, saida.size());
        assertTrue(saida.contains("jkhi"));
        assertTrue(saida.contains("hijk"));
        assertTrue(saida.contains("jkhi"));
    }
}
