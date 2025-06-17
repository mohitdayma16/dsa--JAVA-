public class CeilingValue {

    static int ceiling(int[] arr,int target){
        if(target > arr[arr.length-1]){
            return -1;
        }
        //ceiling is smallest number >= target
        int start =0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;    
            
            if(target > arr[mid]){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                ans = mid;
                return ans;
            }
            // if(ans == -1){
            //     ans = end;
            // }
        }
        return start; 
    }
        // static int ceiling(int[] arr, int target){
        //     int result = binarySearch(arr, target);
            
        //     while (result == -1) {
        //         target++;
        //         result = binarySearch(arr, target);                          // This is another way to do it but it is not efficient
        //     }                                                                // because it will take O(n) time complexity
        //     return result;

        // }

        static int floor(int[] arr,int target){
        // floor is greatest number <= target
        int start =0;
        int end = arr.length-1;
        int ans = -1; 
        if(target < arr[0]){
            return -1;
        }
        while(start<=end){
            int mid = start + (end-start)/2;    
            
            if(target > arr[mid]){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                ans = mid;
                return ans;
            }
        }
        return end;
        }
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 30};
        int target = 0;
        int result = ceiling(arr, target);
        // System.out.println("Ceiling value is: " + arr[result]);
        System.out.println(result);
        int result1 = floor(arr, target);
        // System.out.println("Floor value is: " + arr[result1]);
        System.out.println(result1);
    }
}
