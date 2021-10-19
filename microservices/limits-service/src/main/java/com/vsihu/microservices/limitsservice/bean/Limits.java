package com.vsihu.microservices.limitsservice.bean;

public class Limits {
    private int minimum;
    private int maximum;

    public Limits() {
        super();
    }

    public Limits(int maximum, int minimum) {
        super();
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
}
