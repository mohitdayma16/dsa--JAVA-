public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1}; // Example input array
        int missingNum = missingNumber(nums); // Call the function to find the missing number
        System.out.println("The missing number is: " + missingNum); // Print the result
        
    }

    public static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length &&nums[i] != nums[correct]){ 
                swap(nums, i, correct);   
            }
            else{
                i++;
            }
        }

        for(i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
    public static void swap(int[] arr, int i, int j) { 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
    }
}
