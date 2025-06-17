// Selection Sort Algorithm in Java
// This program sorts an array of integers using the selection sort algorithm.
// It repeatedly finds the minimum/maximum element from the unsorted part and swaps it with the first unsorted element.
// Time Complexity: O(n^2) in the worst and average case, O(n) in the best case (when the array is already sorted).
// Space Complexity: O(1) as it only requires a constant amount of additional space.
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11,-23,0};
        System.out.println("Original array: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }    
    public static int[] selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0;i<n;i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr, maxIndex,last);
        }
        return arr;

    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int getMaxIndex(int[] arr,int start,int end){
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
