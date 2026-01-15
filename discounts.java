import java.util.Scanner;

public class discounts {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double osp;
        double per;
        double dsp;

        System.out.print("please enter the original selling price: ");
        osp = input.nextDouble();

        while (osp <= 0) {
            System.out.print("enter positive original price: ");
        }

        System.out.print("please enter discounted percentage:: ");
        per = input.nextDouble();

        while (per < 0){
            System.out.print("please enter a positive percentage: ");
        }
        while (per > 100) {
            System.out.print("please enter a valid percentage: ");
        }
        dsp = per / 100 * osp;
        dsp = osp - dsp;

        System.out.print("discounted selling price is: " + dsp );

        input.close();
    }

}
