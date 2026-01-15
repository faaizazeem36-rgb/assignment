import java.util.Scanner;

public class circle {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double radius;
        double circ;
        double area;
        double pi = (3.142);

        System.out.print("please enter your radius: ");
        radius = input.nextDouble();

        circ = 2*pi*radius;
        area = pi*radius*radius;

        System.out.println("The circumference is: " + circ);
        System.out.print("The area is: " + area);

        input.close();

    }
}
