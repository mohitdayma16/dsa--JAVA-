import java.nio.channels.Pipe.SourceChannel;

public class Recursion2 {
    public static void main(String[] args) {
        
        // Que 1 : print the n numbers from 1 to n using recursion
        // input: 5
        // output: 5 4 3 2 1
        // int n = 5;
        // printNumbers(n);
        //----------------------------------------------------
        // Que 2 : print the factorial of a number using recursion
        // input: 5
        // output: 120
        // int n = 3;
        // int result = fact(n);
        // System.out.println("Factorial of " + n + " is: " + result);
        //----------------------------------------------------
        // Que 3 : print the sum of n numbers using recursion
        // input: 5
        // output: 15
        // int n = 5;
        // int result = sum(n);
        // System.out.println("Sum of first " + n + " numbers is: " + result);
        //----------------------------------------------------
        // Que 4 : print the sum of the digits using recursion
        // input: 1234
        // output: 10
        // int n = 1234;
        // int result = sumDigits(n);
        // System.out.println("Sum of digits of " + n + " is: " + result);
        //----------------------------------------------------
        // Que 5 : print the product of the digits using recursion
        // input: 1234
        // output: 24
        // int n = 505;
        // int result = prodDigits(n);
        // System.out.println("Product of digits of " + n + " is: " + result);
        //----------------------------------------------------
        // Que 6 : Reverse a number using recursion
        //input : 123
        //output : 321
        // int n = 1234;
        // int result = rev2(n);
        // System.out.println("Reverse of the " +n+" is: "+result);

        //---------------------------------------------------------

        //Que : Target sum

        // int[] arr = {1,2,3,4,5};
        // int tar = 69;
        // solve(0, 0, arr, tar);
        // System.out.println(ok);
        //---------------------------------------------------------

        //Que : Count no of Zeroes in the given number using recursion
        //input : 2004
        //output : 2

        int n = 2004;
        int ans = countZeroes(n);
        System.out.println("The number of zeroes present in "+n+" is "+ans);

    }

    //----------------------------------------------------

    static void printNumbers(int n){
        if(n<=0){
            return ;
        }
        // printNumbers(n-1); // this prints 1 to n
        System.out.println(n); 
        printNumbers(n-1); // this prints n to 1
    }

    //----------------------------------------------------

    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n * fact(n-1); // recursive call
    }
    
    //----------------------------------------------------

    static int sum(int n){
        if(n<=0){
            return 0;
        }
        return n+ sum(n-1); // recursive call
    }
    
    //----------------------------------------------------
    // Note: The above functions can be converted to iterative solutions as well.
    //-----------------------------------------------------

    static int sumDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumDigits(n/10); // recursive call
    }

    //----------------------------------------------------
    
    static int prodDigits(int n){
        if(n==0){
            return 1; // base case, product of digits of 0 is 1
        }
        return n%10 * prodDigits(n/10); // recursive call
    }

    //----------------------------------------------------

    // 1st Way 
    // static int sum=0;
    // static int rev1(int n){
    //     if(n==0){
    //         return 0;
    //     }                           
    //// this is the first way to do this
    //// this way is not a proper recursion
    //// because we used a variable outside
    //// so this is incomplete recursion
    //     int rem = n%10;
    //     sum = sum*10+rem;
    //     rev1(n/10);
    //     return sum;
        
    // }

    //2nd Way

    // static int rev2(int n){
    //     int digits = (int)(Math.log10(n))+1;
    //     return helper(n,digits);
    // }
    // static int helper(int n, int digits){
    //     if(n%10 == n){
    //         return n;
    //     }
    //     int rem = n%10;
    //     return rem*(int)(Math.pow(10, digits-1))+helper(n/10, digits-1);
    // }
    //-------------------------------------------------------------------------------

    static boolean ok = false;

    static void solve(int idx, int sum, int[] arr, int tar) {
        if (ok == true) return;
        if (idx == arr.length) {
            if (sum == tar) {
                ok = true;
            }
            return;
        }
        if (idx > arr.length) return;  // good for safety but no need 
        //not take

        //take
        if (sum + arr[idx] <= tar) {
            solve(idx + 1, sum + arr[idx], arr, tar);
        } 
        
        solve(idx + 1, sum, arr, tar);
    }

    //-------------------------------------------------------------------------

    static int countZeroes(int n){
        if(n == 0){
            return 0;
        }

        if(n%10 == 0){
            return 1 + countZeroes(n/10);
        }
        return countZeroes(n/10);

        

    }

}