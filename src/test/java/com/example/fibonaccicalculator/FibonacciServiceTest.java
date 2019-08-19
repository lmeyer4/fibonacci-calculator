package com.example.fibonaccicalculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class FibonacciServiceTest {

    @InjectMocks
    private FibonacciService fibonacciService;

    @Test
    public void calculateFibonacciOfIndex0() {
        assertThat(fibonacciService.fibonacci(0)).isEqualTo(0L);
    }

    @Test
    public void calculateFibonacciOfIndex3() {
        assertThat(fibonacciService.fibonacci(3)).isEqualTo(2L);
    }
}