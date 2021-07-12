package com.swa.oop2;

public class Square extends Shape{
    private double width;
    private double height;

    public void setValues(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        this.area = this.height * this.width;
        return this.area;
    }
}
