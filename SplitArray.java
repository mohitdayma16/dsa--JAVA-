public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(nums, m));
    }
    public static int splitArray(int[] nums, int m) {
        int start =0 ;
        int end = 0;

        for(int i=0;i<nums.length;i++){
            start = Math.max(start , nums[i]);
            end += nums[i];
        }


        while(start < end){
            int mid  = start + (end-start)/2;
            //try for the middle as potential ans

            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int i : nums) {
                if(sum+i > mid){
                    //you cannot add this in this sub-array, make new one
                    //say you add this in new sub-array, then sum = i
                    sum = i;
                    pieces++;
                }
                else{
                    sum += i;
                }
            }

            if(pieces > m){
                //you made too many pieces, so you need to increase the mid
                //such that less pieces are made
                start = mid+1;
            }
            else{
                //you could have made more pieces, try to minimize the maximum sum
                end = mid;
            }

        }
        
        return start;
    }
}
/* 
testcase : 
 
input: 
nums = [7,2,5,10,8]
m = 2

output:
18  

Explanation:
There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8],
where the largest sum among the two subarrays is only 18.
OR
There are four ways to split nums into two subarrays.
7,2,5,10 | 8 -> 24 this is the max sum among the two sub-arrays.
7,2,5 | 10,8 -> 18 this is the max sum among the two sub-arrays.
7,2 | 5,10,8 -> 23 this is the max sum among the two sub-arrays.
7 | 2,5,10,8 -> 25 this is the max sum among the two sub-arrays.
*/