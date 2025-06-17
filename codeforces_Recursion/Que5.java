package codeforces_Recursion;
import java.util.*;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            binary(arr[i]);
            System.out.println();
        }
    }    
    static void binary(int n){
        if(n==0){
            return;
        }
        binary(n/2);
        System.out.print(n%2);
    }
}
