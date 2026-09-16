package day5;

import java.util.Scanner;

public class MaxConsecOnes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int max = 0;

        // Find maximum consecutive 1s
        for (int i = 0; i < n; i++) {

            if (arr[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println(max);

        sc.close();
    }
}
