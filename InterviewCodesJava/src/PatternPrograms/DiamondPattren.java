package PatternPrograms;

import java.util.Scanner;

public class DiamondPattren {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of lines for a triangle: ");
		int n = sc.nextInt();
		
		for(int i=n;i>0;i--)//To print Upper perfect triangle 
		{
			for(int j=0;j<i;j++)//To print leading spaces in the form inverted right angle triangle
			{
				System.out.print(" ");
			}
			int fact = (n-i)*2+1;
			for(int s=0;s<fact;s++)//To print the upper pattern
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int k=0;k<n;k++)
		{
			for(int r=0;r<=k;r++)
			{
				System.out.print(" ");
			}
			int fact = (n-k)*2-1;
			for(int p=0;p<fact;p++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
