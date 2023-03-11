package Question6;

import java.util.Scanner;

public class TemperatureConverter {
    private static double CONVERSION_FACTOR = 1.8;

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * CONVERSION_FACTOR) + 32;
        return fahrenheit;
    }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the temperature in celsius");
            int celsius = input.nextInt();
            double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }
}
