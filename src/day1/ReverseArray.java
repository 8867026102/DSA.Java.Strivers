package day1;

public class ReverseArray {
    static void func(int[] arr, int i , int n) {
        if(i>=n/2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        func(arr, i+1, n );
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int n = arr.length;
        func(arr,0,n);
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
