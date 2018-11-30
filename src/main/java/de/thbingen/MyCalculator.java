package de.thbingen;

public class MyCalculator {
    private double val;

    public MyCalculator(){
        this(0);
    }

    public MyCalculator(double val) {
        this.val = val;
    }

    public void add(double d){
        val += d;
    }

    public void sub(double d){
        val -= d;
    }

    public void mul(double d){
        val *= d;
    }

    public void div(double d){
        val /= d;
    }

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }
}
