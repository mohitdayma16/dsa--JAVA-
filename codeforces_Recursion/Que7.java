package codeforces_Recursion;
import java.util.*;

public class Que7 {
    static int n=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int idx = 1;
        pyramid(idx);
    }
    static void pyramid(int idx){
        if(idx> n){
            return;
        }
        
        for(int i=0;i<n-idx;i++){
            System.out.print(" ");
        }
        for(int i=0;i<idx * 2-1;i++){
            System.out.print("*");
        }
        System.out.println();
        pyramid(idx+1);
        
         
    }
}
