package codeforces_Recursion;
import java.util.*;


public class Que17 {
    static int n;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        
        seq(0);
            
    }

    static void seq(int idx){
        if(n == 1){
            System.out.println(idx+1);
            return;
        }
        if( n%2 == 0 ){
            n/=2;
        }
        else{
            n = (3*n)+ 1;
        }
        seq(idx+1);
    }

}
