package string_arrays;

public class StringReverse {

    /*
    This application must be called from the command line
    You must pass a single String into the class from the command line
    The main() must print out the contents of the String reverse order
     */
	public static void main(String str[]){


//		String[] str = { "One", "Two", "Three" };

		for (int i=str.length-1; i>=0;i--) {

			char x[]=str[i].toCharArray();


			for (int j=x.length-1;j>=0;j--){
				System.out.print(x[j]);
			}

			System.out.print(" ");

//			for (int m=0; m<j;m++,j--){
//				char t = x[m];
//				x[m]=x[j];
//				x[j]=t;
//			}

		}
	    // initialize the string from the args array

        // print out the letters in reverse order

	}

}
