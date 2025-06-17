import java.util.*;
import java.io.*;


public class searching {
    public static void main(String[] args) {
        
        System.out.println("Radhe Radhe");
        
        //----------------------------------------------------------------

        // arr = [18,12,10,42,34]
        // Q. find if 42 exists in arr or not 

        //----------------------------------------------------------------
        //linear search function find
        // int[] arr = {18,12,10,42,34};
        // int k =42;
        
        // // int index = find(arr,k);
        // // if(index!=0){
        // //     System.out.println("Element found at index: " + index);
        // // }else{
        // //     System.out.println("Element not found in the array.");
        // // }

        //----------------------------------------------------------------

        //searchInRange 
        // int[] arr = {18,12,10,42,34};
        // int k =18;
        // int start = 1;
        // int end = 4;
        
        // int index = find(arr,k,start,end);
        // if(index!=0){
        //     System.out.println("Element found at index: " + index);
        // }else{
        //     System.out.println("Element not found in the range.");
        // }
        //----------------------------------------------------------------

        //Find minimum value in the array

        // int[] arr = {18,12,10,42,34};
        
        // int min = findMin(arr);
        // System.out.println("Minimum value in the array: " + min);

        //----------------------------------------------------------------

        // searching element in a 2d-array

        // int[][] arr ={
        //     {1,21,34},
        //     {4,35,26},
        //     {57,83,91}
        // };
        // int k = 35;
        // int[] index = find(arr,k);

        // System.out.println(Arrays.toString(index));
        //----------------------------------------------------------------

    }

    //----------------------------------------------------------------
    //linear search
    //in linear search the for loop iterates over the elements of the array
    // then finds the index of the key element 
    //the best case complexity is O[1] where the key element is the 1st index of the array
    // the worst case complexity is O[n] where the key element is at the last index of the array or the key element is not present in the array
    // this is called as linear search because on graph its time complexity forms a linear graph


    // public static int find(int[] arr,int k){

    //     int ans = 0;

    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]== k ){
    //             ans = arr[i];
    //             return i;
    //         }
    //     }
    //     return 0;
    // }
    //-----------------------------------------------------------------------------------------------

    //searchInRange

    // public static int find(int[] arr,int k,int start,int end){

    //     int ans = 0;
    //     for(int i=start;i<=end;i++){
    //         if(arr[i]== k ){
    //             ans = arr[i];
    //             return i;
    //         }
    //     }
    //     return 0;
    // }
    //-----------------------------------------------------------------------------------------------
    
    //find minimum element in the array

    // public static int findMin(int[] arr){

    //         int ans = arr[0];
    //         for(int i=0;i<arr.length;i++){
    //             if(arr[i] < ans ){
                    
    //                 ans = arr[i];
    //             }
    //         }
    //         return ans;
    //     }
    //-----------------------------------------------------------------------------------------------

    //Search element in the 2-d array

    // public static int[] find(int[][] arr,int k){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr[i].length;j++){
    //             if(arr[i][j]== k ){
    //                 return new int[]{i,j};
    //             }
    //         }

    //     }
    //     return new int[]{-1,-1};
    // }
    //-----------------------------------------------------------------------------------------------

        


}
