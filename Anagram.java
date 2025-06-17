import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        String str1 = "anagram"; // Example input string 1
        String str2 = "nagaram"; // Example input string 2
        boolean result = isAnagram(str1, str2); // Call the function to check if the strings are anagrams
        System.out.println("Are the strings anagrams? " + result); // Print the result
    }
    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray(); // Convert the first string to a character array
        char[] arr2 = str2.toCharArray(); // Convert the second string to a character array

        if (arr1.length != arr2.length) { // Check if the lengths of the arrays are equal
            return false; // If not, they are not anagrams
        }
        Arrays.sort(arr1); // Sort the first array
        Arrays.sort(arr2); // Sort the second array
        
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        return false;
    }
}
