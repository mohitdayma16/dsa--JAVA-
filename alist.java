//Dynamic array also known as arraylist
import java.util.*;
import java.io.*;
// import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class alist {
    public static void main(String[] args) {
        
        System.out.println("Radhe Radhe");
        
        //----------------------------------------------------------------------------------------------------------

        //SYNTAX
        // ArrayList<Integer> nums2 = new ArrayList<Integer>(10);
        
        //this is just like vector in c++
        // As vector doesnt get full even after defining the length vector as it is not static but dynamic similarly arraylists are the same
        // ArrayList is a class in java which provides dynamic resizing of the array.
        // It extends the functionality of array and provides a list of elements.
        // ArrayList is an implementation of the List interface.
        // ArrayList is an ordered collection of elements.
        // ArrayList allows duplicate values and maintains insertion order.
        // ArrayList is a non-synchronized collection.
        // ArrayList is thread-safe if you are using multiple threads and want to ensure that all threads access the list safely.

        // nums2.add(23); //This adds an element to the arraylist
        // nums2.add(46);
        // nums2.add(325);
        // nums2.add(223);
        // nums2.add(54);
        // System.out.println(nums2);
        // Here to access an index in arraylist you cannot do it like array[] you have to use the function arraylist.get();
        // Likewise there are several different functions in the library of arraylist which helps you with diifferent operations or functions
        // System.out.println(nums2.get(0)); // prints 23

        //-----------------------------------------------------------------------------------------------------rb

        //multi-dimensional arraylist 

        // ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        
        // this is how you define a a multi dimensional arraylist

        // for (int i = 0; i < 3; i++) {
        //     ArrayList<Integer> sublist = new ArrayList<Integer>();
        //     for (int j = 0; j < 4; j++) {
        //         sublist.add(i*4+j);
        //     }
        //     list.add(sublist);
        // }

        // in this way you initialize the arraylist
        // first loop helps you add the diff arraylist to the list 
        // the second loop helps you to add the diff integers in the sublist defined in the frist loop 
        // and finally add the diff arraylist to the list
        //currently this loop adds the sequnce of the numbers of integers in the sublist and then in the list 
        // if you want to add custom input you can use Scanner and add the element in the sublist
        
        // for (ArrayList<Integer> arrayList : list) {
        //     for (int arrayList2 : arrayList) {
        //         System.out.print(arrayList2);
        //     }
        //     System.out.println();
        // }

        //this will print the output of the arraylist of array list

        //----------------------------------------------------------------

        //Swap the elements in the arraylist

        // ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        // System.out.println("Original List: " + nums);
        
        // Collections.swap(nums, 0, 4);
        // System.out.println("Swapped List: " + nums);

        //----------------------------------------------------------------

        //Swapping elements in the array
        // int[] arr = {1,2,3,4,5};

        // System.out.println(Arrays.toString(arr));

        // int temp = arr[0];
        // arr[0] = arr[4];
        // arr[4] = temp;

        // System.out.println(Arrays.toString(arr));

        //----------------------------------------------------------------


        
    }
}
