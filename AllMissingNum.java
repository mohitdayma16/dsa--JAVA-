import java.util.ArrayList;
import java.util.List;

public class AllMissingNum {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> m = new ArrayList<>();
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
                m.add(i+1);
            }
        }
        return m;
    }
    public static void swap(int[] arr, int i, int j) { 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDisappearedNumbers(nums);
        System.out.println(result); // Output: [5, 6]
    }
}