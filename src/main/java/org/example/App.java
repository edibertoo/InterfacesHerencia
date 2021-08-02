package org.example;

import interfaces.Circle;
import interfaces.Polygon;
import interfaces.Rectangle;
import interfaces.Square;

public class App {
    public static void main( String[] args )
    {
        //num1 = primer valor de square
        //num2 primer valorde Rectangle
        //num3 Primer Valor de Circle
        Polygon num1 = new Square(7);
        Polygon num2 = new Rectangle(14,8);
        Polygon num3 = new Circle(10);

        //Implementacion de getArea y getSides Desde App
        System.out.println("Square: "+ num1.getArea()+", "+ num1.getSides());
        System.out.println("Rectangle: "+ num2.getArea()+", "+ num2.getSides());
        System.out.println("Circle: "+ num3.getArea()+", "+ num3.getSides());

    }
}
