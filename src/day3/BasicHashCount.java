package day3;

import java.util.HashMap;
import java.util.Scanner;

public class BasicHashCount {
    public static void main(String[] args){
        Scanner sc  =  new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size;i++){
            arr[i] = sc.nextInt();

        }
        int[] hash = new int[13];
        for(int i =0; i<size;i++){
            hash[arr[i]] +=1;

        }
        int number = sc.nextInt();
        System.out.println(hash[number]);

    }

}
