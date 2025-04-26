package StringPrograms;

import java.util.Scanner;

public class ReplaceVowelsWithStarBasedOnCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int StarCount=0;
		String result="";
		StringBuffer res = new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			if(isVowel(str.charAt(i))){
				StarCount+=1;
				result+="*".repeat(StarCount);
				for(int k=0;k<StarCount;k++)
				{
					res.append('*');
				}
			}
			else
			{
				result+=str.charAt(i);
				res.append(str.charAt(i));
			}
		}
		System.out.println("FroString Buffer: "+res.toString());
		
			
		System.out.println("From java script repet method: "+result);

	}
	
	public static boolean isVowel(char ch)
	{
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			return true;
		}
		else
		{
			return false;
		}
	}

}
