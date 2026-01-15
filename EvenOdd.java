import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long n;

        System.out.print("Please enter a number: ");
        n = input.nextLong();

        if (n % 2 == 0)
        {
            System.out.print("The number " + n + " is an even number.");
        }

        else
        {
            System.out.print("The number " + n + " is an odd number.");
        }

        input.close();
    }
}
