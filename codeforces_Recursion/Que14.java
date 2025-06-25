package codeforces_Recursion;
import java.util.*;

public class Que14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            dfs[i] = -1;
        }

        add(0,0,n,m,a,b);
        
    }

    static int dfs[] = new int[1001];

    static void add(int idx , int idx2 , int n,int m,int[][] a, int[][] b){
        if(idx == n ){
            return;
        }   
        if(idx2 == m){
            return;
        }
        System.out.print(a[idx][idx2]+b[idx][idx2]+" ");
        add(idx, idx2+1, n, m, a, b);
        if(dfs[idx] != -1){
            return;
        }
        dfs[idx] = 1;
        System.out.println();
        add(idx+1, 0, n, m, a, b);
        
    }
}
