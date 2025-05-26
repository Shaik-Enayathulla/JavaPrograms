package StringPrograms;

import java.util.Scanner;

public class ReversingString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string: ");
		String input = sc.nextLine();
		char[] input_arr = input.toCharArray();
		System.out.println("The inputed string is: "+input);
		/*StringBuilder sb = new StringBuilder(input);
		sb=sb.reverse();
		String output = sb.toString();*/
		String output="";
		for(int i=input_arr.length-1;i>=0;i--)
		{
			//String str = String.valueOf(input_arr[i]);
			output=output+input_arr[i];
		}
		System.out.printf("\"%s\" is a reversed string: ",output);
		sc.close();
	}

}
