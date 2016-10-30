package codechef.beginner.tsort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Edvard Piri on 30.10.2016.
 */
public class TSort {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(br.readLine());
        Arrays.sort(a);
        for (int i : a)
            System.out.println(i);
        br.close();
    }
}
