//Sorting 
//There are many kind of sorting algorithms.
//Bubble sort is one of them. also known as sinking sort.
//It is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.
//The pass through the list is repeated until the list is sorted.
//The algorithm gets its name from the way smaller elements "bubble" to the top of the list.

import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args){
        // System.out.println("Radhe Radhe");

        int[] arr = {10,20,39,23,2};
        int n = arr.length;
        System.out.println("Sorted array: "+Arrays.toString(bubbleSort(arr, n)));
    }
    static int[] bubbleSort(int[] arr,int n){
        //There are two possibilities of time complexity of bubble sort.
        //1. O(n^2) in worst case and average case.
        //2. O(n) in best case.
        //The best case occurs when the array is already sorted.
        //In this case, the algorithm only needs to make one pass through the array to confirm that it is sorted.
        //The worst case occurs when the array is sorted in reverse order.
        //In this case, the algorithm needs to make n passes through the array, where n is the number of elements in the array.
        
        boolean swapped = false;
        for(int i=0;i<n;i++){
            swapped = false;
            for(int j=1;j<n-i;j++){

                if(arr[j-1]>arr[j]){
                    //swap arr[j-1] and arr[j]
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            //If no two elements were swapped by inner loop, then break
            if(swapped == false){
                break;
            }
        }
        
        return arr;
    }
    static void printArray(int[] arr,int n){
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}