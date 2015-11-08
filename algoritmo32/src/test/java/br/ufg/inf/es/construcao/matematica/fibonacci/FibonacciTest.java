package br.ufg.inf.es.construcao.matematica.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test (expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Fibonacci.fib(-1);
    }

    @Test
    public void testFibonacci() throws Exception {
        assertEquals(0, Fibonacci.fib(0));
        assertEquals(1, Fibonacci.fib(1));
        assertEquals(1, Fibonacci.fib(2));
        assertEquals(5, Fibonacci.fib(5));
        assertEquals(34, Fibonacci.fib(9));
        assertEquals(144, Fibonacci.fib(12));
        assertEquals(1597, Fibonacci.fib(17));
        assertEquals(6765, Fibonacci.fib(20));
    }
}