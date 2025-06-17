public class Recursion{
    public static void main(String[] args) {
        // System.out.println("Radhe Radhe");
        
        //what is recursion?
        // recursion is nothing but a function calling itself.
        // Example of a recursive function
        //---------------------------------------------------
        // print(5);
        //---------------------------------------------------
        // System.out.println(fibo(7));
        //---------------------------------------------------
        // Example of a recursive function in binary search
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 11;
        int result = binarysearch(arr, target, 0, arr.length - 1);
        System.out.println("Element found at index: " + result);
        
    }
 
    //how function call works in laguages 
    // *** vvvimp points ***
    // 1. While the function is not finished executing, it will remain in the stack memory.
    // 2. when the function finishes executing, it will be removed from the stack memory. and the flow of program is restored to where it was called
    // 3. if the function calls itself, it will be added to the stack memory again. We can treat it as separate function call.
    //    This is called recursion.
    // 4. if the function does not have a base case, it will run infinitely and cause a stack overflow error.

    
    static void print(int n) {
        
        if (n <= 0) {
            return; //------> base case 
                    // if the base case is not defined, the function will run infinitely        
                    // and will cause a stack overflow error
                    // base case is the condition that stops the recursion
        }
        

        System.out.println(n); // print the value of n
        print(n -1); // recursive call
    }    
    // Now why do we need recursion?
    // *** It helps us in solving bigger commplex problem in a simpler way.
    // *** You can convert the recursion solution into iteration & vice versa
    
    // what is iteration? -> in simple words, iteration is nothing but a loop.

    // Recursion also takes space in the stack memory, so it is not always the best solution for every problem.
    // The space complexity of recursion is O(n) where n is the number of recursive calls.
    // The time complexity of recursion is O(n) where n is the number of recursive calls.
    
    // the questions we will be solving in recursion are:
    // 1. Factorial of a number
    // 2. Fibonacci series
    // 3. Tower of Hanoi
    // etc.
    //----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    static int fibo(int n){
        if(n < 2){
            return n; // base case
        }
        return fibo(n-1) + fibo(n-2); // recursive call
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------------------

    // What is tail recursion?
    // whenever you have a last statement of a function in a recursive call, it is called tail recursion.
    // Tail recursion is a special case of recursion where the recursive call is the last statement in the function.
    
    //----------------------------------------------------------------------------------------------------------------------------------------------------------------------

    //note :- now how to understand and approach the recursion problems?  vvvvv.imp->

    // 1. Identify if you can break down the problems into smaller problems.
    // 2. Write the recurrence relation for the problem.
    // 3. Draw the recursion tree to visualize the problem.
    // 4. See the flow of the functions how they are called and getting in the stack.
    // 5. Identify and focus on the left tree calls and right tree calls.
    // 6. Draw the tree and pointers again and again using pen and paper
    // 7. use a debugger to see the flow of the program and how the functions are called.
    // 8. See how the values are returned at each step. See whhere the function calls are coming out, In the end doing this you will come out of the main function.

    // 9. Practice more and more problems to get a better understanding of recursion.
    
    //----------------------------------------------------------------------------------------------------------------------------------------------------------------------    

    // how to work with the variables in recursion? vvvvvv.imp

    // so we have 3 types of variables in recursion:
    // 1. In the arguments
    // 2. In the return type
    // 3. In the body of the function



    //----------------------------------------------------------------------------------------------------------------------------------------------------------------------

    // Now lets try recursion in binary search

    static int binarysearch(int[] arr, int target, int start, int end){
        int mid = start + (end - start) / 2;
        
        if(start > end){
            return -1; // base case, element not found
        }
        if(arr[mid] == target){
           return mid; // base case
        }                           // I had written the wrong base case with excluding the case of if the element was not found.
                                    // So try to write the base case first and then write the recursive calls.
        if(arr[mid] < target){
            return binarysearch(arr, target, mid + 1, end); // right side
        } else {
            return binarysearch(arr, target, start, mid - 1); // left side
        }

    }
    

}