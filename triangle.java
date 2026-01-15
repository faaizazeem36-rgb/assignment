

import java.util.Scanner;

class TrapezoidArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double h;
        double area;

        System.out.print("Enter first parallel side a: ");
         a = input.nextDouble();

        System.out.print("Enter second parallel side b: ");
         b = input.nextDouble();

        System.out.print("Enter height h: ");
         h = input.nextDouble();

         area = h * (a + b) / 2;

        System.out.println("Area of the trapezoid = " + area);
    }
}

