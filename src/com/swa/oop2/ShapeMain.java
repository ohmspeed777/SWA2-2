package com.swa.oop2;

public class ShapeMain {
    public static void main(String[] args)
    {
        Shape shape;

        Square square = new Square();
        shape = square;

        square.setValues(5,4);
        System.out.println(shape.getArea());

       Triangle triangle = new Triangle();
       triangle.setValues(10, 5);
       shape = triangle;
       System.out.println(shape.getArea());

       Circle circle = new Circle();
       circle.setValues(10);
       shape = circle;
       System.out.println(shape.getArea());


    }
}
