package codeforces_Recursion;
import java.util.*;
public class Que11 {
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
 
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Max(0,arr);
        System.out.println(max);
    }
 
    static void Max(int idx , int[] arr){
        if(idx == arr.length){
            return ;
        }
        if(idx == arr.length-1){
            if(max < arr[idx]){
            max = arr[idx];
        }
        }
        if(max < arr[idx]){
            max = arr[idx];
        }
        Max(idx+1, arr);
    }
}