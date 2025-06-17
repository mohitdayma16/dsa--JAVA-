// Binary search in 2d-array OR a matrices 

//Before that how can we find the element with linear search
// we use two loops to iterate through the 2d array and check if the element is present or not
// Time complexity is O(n*m) where n is the number of rows and m is the number of columns
// But we can do it in O(log(n*m)) time complexity using binary search

//For to work this we will need to make sure that the 2d array is sorted in ascending order or descending order
//example of sorted 2d array in ascending order
// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20
// as we can se either we go from left to right or top to bottom the elements are sorted in ascending order

//now
//case 1 : if element  == target -> ans found;
//case 2 : if element < target -> remove the row and move to the row++;
//case 3 : if element > target -> remove the column and move to the  column--;

import java.util.Arrays;

public class BSin2d {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20}
        };
        int target = 20;
        System.out.println(Arrays.toString(search(arr, target)));
    }    
    static int[] search(int[][]matrix , int target){
        int r=0;
        int c=matrix[0].length-1;

        while(r<matrix.length && c>=0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }//this is the optimized form which have time complexity of O(n+m) and space complexity of O(1)
    //and with the help of linear search we would have had the time complexity of the O(n*m) and space complexity of O(1)

    // Now we will see how to optmize the code using binary search and make the time complexity of O(log(n*m)) 
    //but for that we need to make sure that the 2d array is sorted in ascending order or descending order

    //-----------------------------------------------------------------------------------------------------------------------

    // static int[] Search2(int[][] arr, int target){

        

    //     //here 
    //         // {1,2,3,4,5},
    //         // {6,7,8,9,10},
    //         // {11,12,13,14,15},
    //         // {16,17,18,19,20}
    //     // we can see that the 2d array is sorted in ascending order we can also call it a matrix
    //     //first of all we have to find the middle element in the matrix
    //     //for which we will divide the row and cols by 2 and find the mid element

    //     int row  = arr.length;
    //     int col = arr[0].length;

    //     if(row == 1){
    //         return binarySearch(arr,0,0,col-1,target);
    //     }
    //     int rstart =0 ;
    //     int rend =row-1 ;
    //     int cmid = col/2;

    //     while(rstart<(rend-1)){
    //         int mid = rstart +(rend - rstart)/2; 
    //         if(arr[mid][cmid] == target){
    //             return new int[]{mid,cmid};
    //         }
    //         if(arr[mid][cmid] < target){
    //             rstart = mid;
    //         }
    //         else{
    //             rend = mid;
    //         }
    //     }
    //     // now we have two rows
    //     //now check whether the target is in the col of 2 rows or not 
    // }

    //------------------------------------------------------------------------------------------------------------------------
    static int[] binarySearch(int[][] matrix , int row,int cstart , int cend ,int target ){
        while(cstart<=cend){
            int mid = cstart + (cend-cstart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cstart = mid+1;
            }
            else{
                cend = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}