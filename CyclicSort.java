//What is cyclic sort?
//When to use cyclic sort?
//How to implement cyclic sort?

//Cyclic sort is a sorting algorithm that is used to sort an array of integers in a specific range.
//It is an in-place sorting algorithm that uses the concept of cycles to sort the array.
//It is used when given the nos are from range 1 to N => we use Cyclic sort  ******** vvvvvvvimp 
// It cannot be used in any other algorithm like quick sort, merge sort, heap sort etc.
//It is used when the array is not sorted and we need to sort it in a specific range.

//Example:
//Input: [3, 1, 5, 4, 2]
//Output: [1, 2, 3, 4, 5]
//Now how do we do cyclic sort and how it works;
//given that the number in the array are from 1 to N only 
//Explanation : 
// after sorting the array if we look closely we can see that the number at index 0 should be 1,
//the number at index 1 should be 2, the number at index 2 should be 3 and so on
// which means index = value-1;
// so we can use this property to sort the array in a cyclic manner

// so now we will check the 1st index if (0th index) of the unsorted array
// 3,1,5,4,2 => and the number at 0th index is 3 but the correct position of the number 3 is 2nd index
// so we will swap the number at 0th index with the number at 2nd index
// 5,1,3,4,2 => now we will check the number at 0th index which is 5 but the correct position of the number 5 is 4th index
// so we will swap the number at 0th index with the number at 4th index
// 2,1,3,4,5 => now we will check the number at 0th index which is 2 but the correct position of the number 2 is 1st index
// so we will swap the number at 0th index with the number at 1st index
//like this at the end we will get our sorted array


public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2}; // unsorted array
        cyclicSort(arr); // call the cyclicSort function to sort the array
        printArray(arr); // call the printArray function to print the sorted array   
    }
    public static void cyclicSort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1; // the correct position of the number at index i
            if(arr[i] != arr[correct]){ // if the number at index i is not at its correct position
                swap(arr, i, correct); // swap the number at index i with the number at its correct position
        }
    
            else{
                i++; // if the number at index i is at its correct position then move to the next index
            }
        }
    }
    public static void swap(int[] arr, int i, int j) { // function to swap the numbers at index i and j
        int temp = arr[i]; // store the number at index i in a temp variable
        arr[i] = arr[j]; // assign the number at index j to index i
        arr[j] = temp; // assign the number at index i to index j
    }
    public static void printArray(int[] arr) { // function to print the array
        for (int i = 0; i < arr.length; i++) { // loop through the array
            System.out.print(arr[i] + " "); // print the number at index i
        }
        System.out.println(); // print a new line after printing the array
    }
}
