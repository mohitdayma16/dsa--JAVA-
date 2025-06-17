public class practice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int count = 0;
        while(true){
            try {
                // System.out.println(arr[count]);
                arr[count] = arr[count] ;
                count++;
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }

        System.out.println(arr[count/2]);

    }
}