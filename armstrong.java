//Armstrong number for every three digit number
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n)? "armstrong" : "is not armstrong" );
    }

    static boolean isArmstrong(int n){
        
        int temp =n;
        int sum=0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            sum = sum + (rem*rem*rem);
        }

        return temp == sum;
    }
}
