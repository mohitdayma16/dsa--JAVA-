public class OrderAgnosticBS {

    static int orderAgnostics(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            int mid = start + (end - start) / 2; 
            
            if (arr[mid] == target) {
                return mid; 
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }else{
                if(target >arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = { 1,2,3,4,5,6,7,8};
        int[] arr2 = { 8,7,6,5,4,3,2,1};
        int target = 2;
        int result1 = orderAgnostics(arr1, target);
        int result2 = orderAgnostics(arr2, target);
        System.out.println("Element found at index: " + result1);
        System.out.println("Element found at index: " + result2);
    }
}
