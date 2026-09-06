package day2.Strings;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String longest = "";
        for(int i =0; i< arr.length;i++){
            if(arr[i].length()>longest.length()){
                longest=arr[i];

            }
        }
        System.out.println(longest);
    }

}
