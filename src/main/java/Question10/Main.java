package Question10;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Triangle;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Circle with radius " + circle.getRadius() + ":");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle with length " + rectangle.getLength() + " and width " + rectangle.getWidth() + ":");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle with sides " + triangle.getSideA() + ", " + triangle.getSideB() + ", and " + triangle.getSideC() + ":");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}

