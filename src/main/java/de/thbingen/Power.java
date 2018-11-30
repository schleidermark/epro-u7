package de.thbingen;

import org.springframework.stereotype.Component;

@Component
public class Power implements ArethmeticOperation{
    @Override
    public double calc(double a, double b) {
        return Math.pow(a, b);
    }
}
