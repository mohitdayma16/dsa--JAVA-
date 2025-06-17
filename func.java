//functions and methods
import java.util.Arrays;
import java.util.Scanner;



 class func{
    static int a = 30;
    public static void mohit(){
        System.out.println("Hello from mohit function");
    }
    public static void main(String[] args) {
                            //   |
                            //   |
                            //   this is variable length argument used to take n number of input arguments for a function 

        System.out.println("Radhe Radhe");
        System.out.println(args[0]);

        //----------------------------------------------------------------

        // int a=10;
        // int b=20;
        // swap(a,b);
        // System.out.println("After swapping: a = " + a + ", b = " + b); // so here it did not swap the values
        //the values passed in the function will reflect the changes made in the function only it will not change the original value of the passed arguments
        // but if you pass a print statement in the function then you can see the values have changed and been swaped 
        // but it will not affect the original value of a and b in the main function
        // if you want to change the original values you should use pass by reference or pass by value
        // this indicates the scope of the function and scope of the variable 
        
        //----------------------------------------------------------------------------------------

        // int[] arr = {1,2,3,4,5};
        // change(arr);
        // System.out.println(Arrays.toString(arr));
        

        //----------------------------------------------------------------------------------------

        //     ##############        Scoping        ###############
        //-----------------------------------------------------------------------------------
        //function scope:-

        // int a = 10;
        // int b = 20;
        // System.out.println(a);
        //-----------------------------------------------------------------------------------
        //Block scope:-
        // int a = 10;
        // {
        //     int a = 19;// this will also throw an error because the variable a is already defined so you dont need to define it again in the block you can change the value but cannot again define it 
        //     int b = 20;
        //     System.out.println(a);
        //     System.out.println(b);
        // }
        // System.out.println(b); //this will throw an error as b is out of scope
        //-----------------------------------------------------------------------------------
        // //loop scope:-
        // for(int i=0; i<10; i++){
        //     System.out.println(i); // here this will be ok
        // }
        // System.out.println(i);// but this will give error 

        //-----------------------------------------------------------------------------------
        
        //Shadowing
        // System.out.println(a);
        // int a  = 10;
        // System.out.println(a);// here now i have two values of a 
        //due to the concept of shadowing the a in line no 59 will shadow the value of a in line no 5
        // which will give me two different values on printing 
        // the a defined in line no 5 can be used in any function in the func class  but the a defined in line no 59 can only be used in the main function
        
        // ######################## scope end #################

        //-----------------------------------------------------------------------------------

    }

    //----------------------------------------------------------------
    //this is a format of a method 
    //access modifiers return_type name (){
    //body
    // return statement
    //}
    //this method calculates sum of two numbers and prints the result
    //to call a function you use () these brackets with the function name
    
    //---------------------------------------------------------------------------------

    // static void sum(){
    //     Scanner sc = new Scanner(System.in);
    //     int a,b,sum;
    //     System.out.print("Enter 1st number: ");  
    //     a=sc.nextInt();
    //     System.out.print("Enter 2nd number: ");  //asking user for input 2nd number
    //     b=sc.nextInt();
    //     sum = a + b;
    //     System.out.println("Sum is: " + sum);
    // }

    //---------------------------------------------------------------------------------

    // public static String greetings(){
    //     return "Radhe Radhe";
    // }

    //---------------------------------------------------------------------------------

    // static void swap(int a,int b){
    //     // System.out.println("Before swapping: a = " + a + ", b = " + b); 
    //     int temp =a;
    //     a = b;
    //     b = temp;
    //     // System.out.println("After swapping: a = " + a + ", b = " + b);
    // }
    
    //-----------------------------------------------------------------------------------

    // static void change(int[] nums){
    //     nums[0] = 50;
    // }
    // if you make a change to the object via this ref variable object will be changed but it is different in the case of strings because strings are immutable 

    //-----------------------------------------------------------------------------------

    //Scoping :- Anything initialized outside the block but anything initialized inside the block cannot be used outside the block.

    // Function scope :-  if you define any thing in a function you can use it only in that function 
    // Block scope:- a variable will be defined in the block can be used only in the block 
                    // but the variable defined in the parent block can be used in child block
    //loop Scope :- cannot use variable defined in the loop  outside the loop we can use it only in the loop 

    
    













}
