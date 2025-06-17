package codeforces_Recursion;
import java.util.*;

public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        for(int i = 0;i<n;i++){
            if(a[i] == 0){
                System.out.println(0);
            }
            else{
            digits(a[i]);
            System.out.println();            
            }
        }
        
    }    
    static void digits(int n){
        if(n==0){
            return;
        }
        digits(n/10);
        System.out.print(n%10+" ");
    }
}
