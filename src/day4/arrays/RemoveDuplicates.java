package day4.arrays;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;

        for (int j = 1; j < n; j++) {

            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }

        // Number of unique elements
        int k = i + 1;

        System.out.println("Unique elements:");

        for (int x = 0; x < k; x++) {
            System.out.print(arr[x] + " ");
        }

        System.out.println("\nCount: " + k);
    }
}
