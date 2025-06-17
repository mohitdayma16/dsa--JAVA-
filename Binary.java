// What is binary seacrh? 
// Binary search is a fast search algorithm with run-time complexity of Ο(log n).
// This search algorithm works on the principle of divide and conquer.
// For this algorithm to work properly, the data collection should be in the sorted form.


public class Binary {

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; 
 
            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                start = mid + 1; 
            } else {
                end = mid - 1; 
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 4;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
