package PatternPrograms;

import java.util.Scanner;

public class RightAngle_Triangle {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String where its characters should print in Triangle pattern:");
		String str = sc.nextLine();
		/*System.out.println("Enter the height of the triangle:");
		int h = sc.nextInt();
		String act_str=str.substring(0,h);*/
		
		for(int i=0;i<str.length();i++)
		{
			char out = str.charAt(i);
			for(int j=0;j<=i;j++)
			{
				System.out.print(out);
			}
			System.out.println();
		}
		sc.close();
	}

}
