
import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = input.nextDouble();

        System.out.print("Enter side b: ");
        double b = input.nextDouble();

        System.out.print("Enter side c: ");
        double c = input.nextDouble();

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of the triangle = " + area);
    }
}




