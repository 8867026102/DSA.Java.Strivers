package day2.Arrays;

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        boolean sorted  = true;
        for(int i = 0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
