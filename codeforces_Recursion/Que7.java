// package codeforces_Recursion;
// import java.util.*;

// public class Que7 {
//     static int n;
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         int idx = 1;
//         pyramid(idx);
//     }
//     static void pyramid(int idx){
//         if(idx> n){
//             return;
//         }
        
//         for(int i=0;i<n-idx;i++){
//             System.out.print(" ");
//         }
//         for(int i=0;i<idx * 2-1;i++){
//             System.out.print("*");
//         }
//         System.out.println();
//         pyramid(idx+1);
//     }
// }

//----------------------------------------------------------------------------------------

/// this is more faster way as System.out.print uses more 

package codeforces_Recursion;
import java.util.*;

public class Que7 {
    static int n;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pyramid(1);
        System.out.print(sb.toString());
    }

    static void pyramid(int idx){
        if(idx > n){
            return;
        }

        for(int i = 0; i < n - idx; i++){
            sb.append(" ");
        }
        for(int i = 0; i < idx * 2 - 1; i++){
            sb.append("*");
        }
        sb.append("\n");
        pyramid(idx + 1);
    }
}

