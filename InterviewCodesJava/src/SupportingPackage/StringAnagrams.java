package SupportingPackage;

import java.util.Arrays;

public class StringAnagrams {
	
	public boolean anagram(String s1, String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}
}

