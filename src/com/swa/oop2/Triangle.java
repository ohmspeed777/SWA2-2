package com.swa.oop2;

public class Triangle extends Shape{
    private double base;
    private double height;

    public void setValues(double base, double height) {
        this.height = height;
        this.base = base;
    }

    public double getArea() {
        this.area = (this.height * this.base) / 2;
        return this.area;
    }
}