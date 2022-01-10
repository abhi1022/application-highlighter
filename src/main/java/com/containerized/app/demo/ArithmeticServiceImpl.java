package com.containerized.app.demo;

import org.springframework.stereotype.Component;


@Component
public class ArithmeticServiceImpl implements ArithmeticService
{
    @Override
    public int getFactorial(int number)
    {
        int finalValue = 1;

        for(int i=1;i<=number;i++)
            finalValue *= i;

        return finalValue;
    }
}
