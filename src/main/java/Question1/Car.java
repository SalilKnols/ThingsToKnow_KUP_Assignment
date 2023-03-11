package Question1;

public class Car {
    private static int numOfCars = 0;  // Static variable to keep track of the number of cars

    public Car() {
        numOfCars++;
    }

    public static int getNumOfCars() {
        return numOfCars;
    }
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(Car.getNumOfCars()); // Output: 2
    }
}
