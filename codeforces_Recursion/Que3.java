package codeforces_Recursion;

import java.util.*;
 
public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        print(n);
    }    
    public static void print(int n){
        if(n==0){
            return;
        }
        if(n==1){
            System.out.print(n);
        }else{
        System.out.print(n+" ");
        }
        print(n-1);
    }
}