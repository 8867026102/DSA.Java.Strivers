package day2.Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        boolean found = true;
        System.out.println("Enter the number you want to find: ");
        int f= sc.nextInt();
        for(int i = 0;i< n;i++){
            if(arr[i]==f){
                found = true;
                break;
            }

        }
        System.out.println(found ? "Found" : "Not Found");

    }
}
