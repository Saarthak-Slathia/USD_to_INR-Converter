import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi There !");
        System.out.print("Enter the value in dollars: ");
        Double value = scanner.nextDouble();
        Double calc = value * 73.45;
        System.out.println("The value of " + value + " dollars (USD) is approximately " + calc + " rupees (INR)");
    }
}