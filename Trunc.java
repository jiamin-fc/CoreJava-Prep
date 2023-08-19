import java.util.Scanner;

public class Trunc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;
        boolean flag = true;

        System.out.println("Use an out of range entry <-100 or >100 to quit.");

        while (flag) {
            System.out.println("Enter a number on a line:");

            double d = input.nextDouble();

            if (outOfRange(d)) {
                flag = false;
            } else {
                dispTrunc("The number value is: ", d);
                total = total + d;
                dispTrunc("The total is: ", total);

                System.out.println();
                System.out.println("Next.");
            }
        }
        System.out.println("You quit.");

        input.close();
    }

    static boolean outOfRange(double d) {
        return d < -100 || d > 100;
    }

    static void dispTrunc(String msg, double num) {
        boolean neg = (num < 0);
        double posNum = num;
        if (neg)
            posNum = -num;
        double nPlus = posNum + 0.5;
        int whole = (int) nPlus;
        String s = String.valueOf(whole);
        String sign = "";
        if (neg)
            sign = "-";
        System.out.println(msg + sign + s);
    }
}
