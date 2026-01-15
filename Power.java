import java.util.Scanner;

class WattsCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter voltage (V): ");
        double voltage = input.nextDouble();

        System.out.print("Enter current (A): ");
        double ampere = input.nextDouble();

        double watts = voltage * ampere;

        System.out.println("Power consumption = " + watts + " Watts");
    }
}