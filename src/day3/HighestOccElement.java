package day3;

import java.util.Scanner;

public class HighestOccElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] hash = new int[13];
        for(int i = 0; i< size;i++){
            hash[arr[i]] +=1;
        }
        int maxFreq = 0;
        int HighestElemnt = 0;
        for(int i = 0; i< hash.length;i++){
            if(hash[i]> maxFreq){
                maxFreq = hash[i];
                HighestElemnt = i;
            }
        }
        System.out.println("Highest Occuring element is: "+HighestElemnt );
        System.out.println("It appeared : "+maxFreq+ " times.");
    }

}
