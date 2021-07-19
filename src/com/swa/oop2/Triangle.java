package com.swa.oop2;

public class Triangle extends Square{

    public double getArea() {
        this.area = (this.getWidth() * this.getHeight()) / 2;
        return this.area;
    }
}