import java.util.*;
public class DuplicateNum {
    public static void main(String[] args){
        int[] nums = {1,3,4,2,2}; // Example input array
        int duplicateNum = findDuplicate(nums); // Call the function to find the duplicate number
        System.out.println("The duplicate number is: " + duplicateNum); // Print the result
        int [] nums1 = {4,3,2,7,8,2,3,1}; // Example input array
        List<Integer> duplicates = findAllDuplicates(nums1); // Call the function to find all duplicate numbers
        System.out.println("The duplicate numbers are: " + duplicates); // Print the result
    }
    public static int findDuplicate(int[] nums) {
        
        int i=0;
       while(i<nums.length){
           int correct = nums[i]-1;
           if(nums[i] != nums[correct]){ 
               swap(nums, i, correct);   
           }
           else{
               i++;
           }
       }
       
       for(i=0;i<nums.length;i++){
           if(nums[i]!= i+1){
               return nums[i];
           }
       }
       return 0;
   }
   public static List<Integer> findAllDuplicates(int[] nums) {
    List<Integer> duplicates = new ArrayList<>();
    int i=0;
    while(i<nums.length){
       int correct = nums[i]-1;
       if(nums[i] != nums[correct]){ 
           swap(nums, i, correct);   
       }
       else{
           i++;
       }
    }
   
   for(i=0;i<nums.length;i++){
       if(nums[i]!= i+1){
           duplicates.add(nums[i]);
       }
   }
   return duplicates;
}

   public static void swap(int[] nums,int i, int j){
       int temp = nums[i];
       nums[i] = nums[j];
       nums[j]=temp;
   }
}
