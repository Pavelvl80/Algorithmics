package codechef.beginner.FCTRL;

import java.util.Scanner;

/**
 * Created by Edvard Piri on 29.10.2016.
 */
class FCTRL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int sum = 0;
            while (n / 5 != 0) {
                n /= 5;
                sum += n;
            }
            System.out.println(sum);
        }
    }
}
