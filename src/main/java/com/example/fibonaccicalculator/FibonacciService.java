package com.example.fibonaccicalculator;


import org.springframework.stereotype.Service;

@Service
public class FibonacciService {


    public long fibonacci(long index) {
        if (index <= 1)
            return index;
        return fibonacci(index - 1) + fibonacci(index - 2);
    }
}
