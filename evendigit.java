public class evendigit {
    public static void main(String[] args) {
        
        int[] nums = {1234, 5678, 9012, 3456, 7890};
        System.out.println("Number of even digits: " + findnumbers(nums));
        
    }
    static int findnumbers(int[] nums){
        int count =0;
        for(int num: nums){
             if(even(num)){
                count++;
             }
        }
        return count;
    }
    static boolean even(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        if(count%2==0){
            return true;
        }
        return false;
    }

}
// there is also a shortcut method to find if a number have even number of digits
// we can use Math.log10(num)+1 instead