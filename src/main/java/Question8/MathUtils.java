package Question8;
import java.util.Scanner;
public class MathUtils {
    public static double E = 2.71828;

    public static double calculateExponential(double x) {
        double result = Math.exp(x);
        return result;
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("enter the value");
        double exponentialValue = MathUtils.calculateExponential(read.nextInt());
        System.out.println("Exponential value: " + exponentialValue);

    }
}
