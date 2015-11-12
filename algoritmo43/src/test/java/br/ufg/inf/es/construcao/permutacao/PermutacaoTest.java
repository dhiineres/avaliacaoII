package br.ufg.inf.es.construcao.permutacao;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class PermutacaoTest {
    @Test
    public void testPermuta() throws Exception {
        char[] p = new char[0];
        char[] S = {'a', 'b'};
        List<char[]> retorno = Permutacao.permuta(p, S, new ArrayList<char[]>());
        char[] out = {'a', 'b'};
        assertEquals(2, retorno.size());
        assertTrue(retorno.contains(out));
    }
}
