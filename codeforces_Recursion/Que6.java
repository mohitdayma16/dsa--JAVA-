package codeforces_Recursion;

import java.util.*;

public class Que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Even(arr , n);
    }
    static void Even(int[] arr, int n){
        if(n < 0){
            return;
        }
        if((n-1)%2 == 0 ){
            System.out.print(arr[n-1]+" ");
        }
        Even(arr,n-1);
    }
}
