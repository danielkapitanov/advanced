package strings_arrays;
/*
    Write the code to reverse the order of a standard array in place. Do not create a second array.
 */

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++){
            arr[i] = i;
        }
        int j=arr.length-1;
        for (int i=0; i<j;i++,j--){
            int t = arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }

        for (int i = 0; i < 100; i++){
            System.out.println(arr[i]);
        }

        // now reverse the array in place - do not create a second array and copy values into it
        // change test
    }

}
