package GeneralCodes;

import java.util.Scanner;

public class BinarySearch {
	
	public static int[] SortTheArray(int[] inputarray)
	{
		for(int i=0;i<inputarray.length;i++)
		{
			for(int j=i+1;j<inputarray.length;j++)
			{
				if(inputarray[i]>inputarray[j])
				{
					int temp=inputarray[i];
					inputarray[i]=inputarray[j];
					inputarray[j]=temp;
				}
			}
		}
		
		return inputarray;
	}
	
	public static int BinarySearch(int[] inparr,int left, int right, int ele)
	{
		if(left>right)
		{
			return -1;
		}
		int mid = left+(right-left)/2;
		if(inparr[mid]==ele)
		{
			return mid;
		}
		if(inparr[mid]>ele)
		{
			return BinarySearch(inparr,left,mid-1,ele);
		}
		else
		{
			return BinarySearch(inparr,mid+1,right,ele);
		}
	}

	public static void main(String[] args) {
		int[] arry = {5,6,74,68,34,768,6,7,564,856,477,75,543,21,455,23};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element you what to secrch in an element:");
		int find = sc.nextInt();
		int[] sortedArray = SortTheArray(arry);
		for(int itr=0;itr<sortedArray.length;itr++)
		{
			System.out.print(sortedArray[itr]+" ");
		}
		System.out.println();
		int findIndex = BinarySearch(sortedArray,0,sortedArray.length-1,find);
		if(findIndex!=-1)
		{
			System.out.printf("The element \"%d\" is at position \"%d\" in an array",find,findIndex+1);
		}
		else
		{
			System.out.println("Searched element is not present in an array");
		}
		
	}

}
