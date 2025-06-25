package codeforces_Recursion;
import java.util.*;

public class Que12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        long ans = Sum(0,arr);
        System.out.println(ans);
    }
    static long Sum(int idx , int[] arr){
        if(idx > arr.length-1){
            return 0;
        }
        return arr[idx]+Sum(idx+1, arr);
    }
}
