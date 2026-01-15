import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double max;
        double obt;
        double per;

        System.out.print("enter your max marks: ");
        max = input.nextDouble();

        while (max <= 0) {
            System.out.print("please enter positive maximum marks: ");
        }
        System.out.print("enter yourr obtained marks: ");
        obt = input.nextDouble();

        while (obt < 0 || obt > max) {
            System.out.print("please enter valid obtained valid marks: ");
        }
        per = obt / max * 100;
        System.out.print("your percentage is:" + per + "%");

        input.close();
    }
}
