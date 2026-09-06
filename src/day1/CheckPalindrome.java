package day1;
import java.util.*;
public class CheckPalindrome {
    static boolean f(String str,int i){
        if(i>=str.length()/2){
            return true;
        }
        if (str.charAt(i) != str.charAt(str.length() - i - 1)) {

            return false;
        }
        return f(str,i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        if(f(str,0)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        sc.close();


    }
}
