package de.thbingen;

import org.springframework.stereotype.Component;

@Component
public class Root implements ArethmeticOperation {
    @Override
    public double calc(double a, double b) {
        return Math.pow(a, 1 / b);
    }
}
