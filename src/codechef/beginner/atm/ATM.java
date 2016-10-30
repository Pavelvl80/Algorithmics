package codechef.beginner.atm;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Edvard Piri on 27.10.2016.
 */
public class ATM {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");

        double x = Double.parseDouble(line[0]);
        double y = Double.parseDouble(line[1]);

        if (x % 5 == 0 && x + 0.50 < y) System.out.println(y - x - 0.50);
        else System.out.println(y);

        br.close();
    }
}
