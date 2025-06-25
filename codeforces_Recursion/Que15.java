package codeforces_Recursion;

import java.util.*;

public class Que15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int n = sc.nextInt();
        for (int i =0 ; i <= n; i++) arr[i] = -1;
        fibo(n);
        System.out.println(fibo(n));
    }
    
    static int[] arr = new int[102];

    public static int fibo(int  n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }

        if(arr[n] != -1 ){
            return arr[n];
        }
        return fibo(n-1) + fibo(n-2);

    }

}
