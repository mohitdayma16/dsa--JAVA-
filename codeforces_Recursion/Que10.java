package codeforces_Recursion;
import java.util.*;

public class Que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = Fact(n);
        System.out.print(ans);
    }
    static long Fact(int n){
        if(n<=0){
            return 1;
        }
        return n*Fact(n-1);
    }
}
