import java.util.Scanner;
import java.util.*;
import java.io.*;
public class array {
    public static void main(String[] args) {
        
        System.out.println("Radhe Radhe");

        //----------------------------------------------------------------------------------------------------------------------------------------------
        
        //why do we need array
        // An array is an collection of objects or data types 
        // An array is a collection of elements of the same data type stored in contiguous memory locations.
        // declaring an array - Syntax :- 
        // datatype[] variableName = new datatype[size];
        // the datatype represents the type of the data which are stored in the array

        // int[] arr = {23,45,57,24,86};
        //we cannot add any another datatype in the array above because it is only an integer type of array
        // Adding other datatypes in the array will result in error
        // all the elements in the array will be of same type

        // arr is the variable pointing to the array 

        // int[] arr1; // this is the declaration of the array variable 
        // arr1 = new int[5]; // this is the initialization of the array with size 5 
        // the actual creation of array in the memory is done by second line  it is being created in heap 
        // new int[5] this things  is called as memory allocation which allocates the memory in heap 
        
        // in c or c++ the array created will be created in contiguous memory  locations 
        // in java the array is created in will depend on the  JVM it can be in contiguous memory locations or non contiguous memory locations  
        // we know array objects are in heap  memory in java 
        // heap objects are not continuos it can be and  can be non contiguous memory locations 
        
        // what is new 
        // new keyword is used to create new objects in java

        //----------------------------------------------------------------------------------------------------------------------------------------------

        // taking input in an array 
        // and printing array

        // int[] arr = new int[5];
        // Scanner sc = new Scanner(System.in);

        // for(int i=0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }

        //----------------------------------------------------------------------------------------------------------------------------------------------
        
        // taking array of objects
        // Scanner sc= new Scanner(System.in);
        // String[] str = new String[5];
        // for(int i=0;i<str.length;i++){
        //     str[i] = sc.nextLine();
        // }
        // System.out.println(Arrays.toString(str));
        // System.out.println(str[2]);

        // str[4] = "Radhe Radhe ";
        
        // System.out.println(Arrays.toString(str));
        //----------------------------------------------------------------------------------------------------------------------------------------------
        
        // Strings are immutable in java where arrays are mutable 
        // mutable means we can change the object
        
        //----------------------------------------------------------------------------------------------------------------------------------------------
        
        // //2D Array also known as multi-dimensional array
        // // it is nothing much more than a array of array
        // /*
        //     ex:- 1 2 3
        //          4 5 6 
        //          7 8 9 
        //  */

        // int[][] arr = new int[3][];
        // // int[][] arr = new int [3]--> Here the number of rows are mandatory []--> these are number of columns
        // // we can add number of columns as well but it is not mandatory
        // // but for adding number of rows it is mandatory
         
        // int[][] arr1 = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        
        //----------------------------------------------------------------------------------------------------------------------------------------------
        
        //Taking input in 2d-array

        // Scanner sc= new Scanner(System.in);

        // int[][] arr = new int[3][4];

        // // System.out.println(arr.length);

        // for(int row = 0; row < 3; row++){
        //     for(int col=0; col < arr[row].length; col++){
        //         arr[row][col]= sc.nextInt();
        //     }
        // }

        // // for(int row = 0; row < 3; row++){
        // //     for(int col=0; col < arr[row].length; col++){
        // //         System.out.print(arr[row][col]+" ");
        // //     }
        // //     System.out.println(); 
        // // }      
        // for (int[] is : arr) {
        //     System.out.println(Arrays.toString(is));
        // }

        //----------------------------------------------------------------------------------------------------------------------------------------------


    }    
}
