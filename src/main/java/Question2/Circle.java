package Question2;

public class Circle {
    public static final double PI = 3.14159;

    public static double calculateCircumference(double radius) {
        double circumference = 2 * PI * radius;
        return circumference;
    }
    public static void main(String[]args) {
        double radius = 5.0;
        double circumference = Circle.calculateCircumference(radius);
        System.out.println("Circumference = " + circumference);
    }
}

