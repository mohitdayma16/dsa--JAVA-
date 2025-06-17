
package codeforces_Recursion;
import java.util.*;

public class Que8 {
    static int n;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pyramid(n);
        System.out.print(sb.toString());
    }

    static void pyramid(int idx){
        if(idx < 0){
            return;
        }

        for(int i = n - idx; i > 0; i--){
            sb.append(" ");
        }
        for(int i = idx * 2 - 1; i > 0; i--){
            sb.append("*");
        }
        sb.append("\n");
        pyramid(idx-1);
    }
}

