//in this we will find the pivot element and then we will find the target element in the array
//Time complexity: O(logn)
//A rotated array is an array that is sorted in ascending order and then rotated by some number of elements either to the left or right.
// and the pivot element is the element which is greater than the previous element and the next element

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int pivot = pivot(arr);
        System.out.println("Pivot element is: " + arr[pivot]);

    }   

    public static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;

            //this is for case 1:
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            //this is for case 2:
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }

            //this is for case 3:
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int target,int start,int end){
        
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
}
