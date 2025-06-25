package codeforces_Recursion;
import java.util.*;

public class Que16 {

    static long n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();

        if(n == 0){
            System.out.println(1);
        }
        func(0);
    }
    static void func(int idx){
        if(Math.pow(2,idx) > n){
            System.out.println((long)idx-1);
            return;
        }
        func(idx+1);
    }
}