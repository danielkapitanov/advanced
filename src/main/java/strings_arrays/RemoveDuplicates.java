package strings_arrays;

import java.util.Arrays;

/*
    An array contains 10 numbers. There is exactly one number that is repeated in this array.
    Write a program to find the duplicate number. For example, if an array with length 4 contains numbers
    {0, 3, 2, 3}, then the duplicate number is 3. For this example just change the "3" to "-1". Print out the
    original array, then the duplicate number, then the array after the duplicate is removed.

    Hint: Arrays.sort()

 */
public class RemoveDuplicates {
    public static void main(String[] args) {

        int array[] = {0, 1, 2, 3, 4, 5, 1, 7, 8, 9};
        Arrays.sort(array);

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        int j=0;
            for (int i = 1; i < array.length -1 ; i++, j++) {

                if (array[i] == array[j]) {
                    System.out.println("Duplicate number is: " + j);
                    array[j] = -1;
                }

        }

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        }
    }


