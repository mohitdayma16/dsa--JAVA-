package codeforces_Recursion;
import java.util.*;

public class Que9 {
    static String str;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        str = sc.nextLine();
        int ans = countVowels(0);
        System.out.println(ans);
    }
    static int countVowels(int n){
        if(n>=str.length()){
            return 0;
        }
        if("AEIOUaeiou".contains(str.charAt(n)+"")){
            return 1+countVowels(n+1);
        }
        return countVowels(n+1);
    }
        
}
