package strings_arrays;

import java.util.Random;


import java.util.Random;

/* Write the code to find the smallest sum of any two numbers in a 2 dimensional array int[][] - both of unknown length.

    Use the java.util.Random class to generate 2 Random Numbers between 1 and 30. 1 number will be the 1st dimension
    of your array (the vertical array). The second number will be the 2nd dimension (the horizontal array).

   //----------------------------------------------------------------------
    import java.util.Random; // this line must come before class declaration
    //----------------------------------------------------------------------

    Random rand = new Random();
    int  n = rand.nextInt(50) + 1;
    //50 is the maximum and the 1 is our minimum

    As Before, use the java.util.Random class to generate 100 random numbers between 1 and 22,222 and place them
    into the array. Iterate through this array two find the 2 numbers who's sum is smaller than any other.

    Expected outpust:
    Original array: <contents of original array>
    Lowest sum: <a single int, the lowest sum of any two ints in the array>
*/

public class LocateSmallest2Dim {
    public static void main(String[] args) {

        Random rand = new Random();
        int n = rand.nextInt(30) + 1;
        int m = rand.nextInt(30) + 1;
        int array[][] = new int[n][m];
        int min1,min2;
        min1=min2=22222;
        for (int i=0; i<n; i++) {
            for (int t=0; t<m; t++) {
                array[i][t]=rand.nextInt(22222) + 1;
                System.out.print(array[i][t]+" ");
                if (array[i][t]<min1){
                    min1=array[i][t];
                }
                else if (array[i][t]<min2){
                    min2=array[i][t];
                }
            }
            System.out.println();
        }
        System.out.println("min1 is: "+min1);
        System.out.println("min2 is: "+min2);

    }
}
