package StringPrograms;

import java.util.Scanner;
import SupportingPackage.StringAnagrams;

public class CheakTwoStringAreAnagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		String str1 = sc.nextLine();
		System.out.println("Enter the Second String");
		String str2 = sc.nextLine();
		StringAnagrams obj = new StringAnagrams();
		if(obj.anagram(str1,str2))
		{
			System.out.println("The input strings are anagrams to each other");
		}
		else
		{
			System.out.println("The Provided Strings are not an Anargrams");
		}
	}

}
