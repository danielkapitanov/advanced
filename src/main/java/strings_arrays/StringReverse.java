package strings_arrays;

public class StringReverse {

	/*
    This application must be called from the command line
    You must pass a single String into the class from the command line
    The main() must print out the contents of the String reverse order
     */
	public static void main(String args[]){


		String[] str = { "One", "Two", "Three" };

		for (int i=str.length-1; i>=0;i--) {

			char x[]=str[i].toCharArray();


			for (int j=x.length-1;j>=0;j--){
				System.out.print(x[j]);
			}

			System.out.print(" ");

		}
		System.out.println();
		// initialize the string from the args array

		// print out the letters in reverse order

	}

}