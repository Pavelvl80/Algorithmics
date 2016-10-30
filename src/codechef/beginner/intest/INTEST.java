package codechef.beginner.intest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Edvard Piri on 27.10.2016.
 */
public class INTEST {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        while (sc.hasNextInt()) {
            n = sc.nextInt();
            if (n % k == 0) count++;
        }
        System.out.println(count);
    }
}