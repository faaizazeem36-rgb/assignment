import java.util.Scanner;
public class originalprice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double osp;
        double dsp;
        double per;

        System.out.print("enter your discounted selling price: ");
        dsp = input.nextDouble();

        while (dsp <= 0) {
            System.out.print("discounted selling price cannot be negative nor zero: ");
        }
        System.out.print("please enter your discounted percentage : ");
        per = input.nextDouble();

        while (per < 0 || per > 100) {
            System.out.print("please enter a valid percentage: ");
        }
        osp = dsp / (1 - per / 100);

        System.out.print("the original selling price is: " + osp);

        input.close();
    }
}
