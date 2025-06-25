package codeforces_Recursion;
import java.util.*;


public class Que13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        long sum = SumSuff(m , n-1 , arr);
        System.out.println(sum);

    }    
    static long SumSuff(int m , int idx , int[] arr){
        if(m == 0){
            return 0;
        }
        if(idx < 0){
            return 0;
        }
        return arr[idx] + SumSuff(m-1,idx-1,arr);
    }
}
