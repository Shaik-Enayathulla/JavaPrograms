package StringPrograms;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String rev ="";
		char[] arr = s.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			rev=rev+arr[i];
		}
		if(s.equals(rev))
		{
			System.out.printf("String \"%s\" is a Palindrome string", rev);
			System.out.println();
		}
		else
			System.out.printf("The provided string \"%s\" is not a palindrome",s);

	}

}
