package arraysPrograms;

public class FindingMedianOfArray {
	
	public static int findMedian(int len,int[] arry)
	{
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arry[i]>arry[j])
				{
					int temp = arry[i];
					arry[i]=arry[j];
					arry[j]=temp;
				}
			}
		}
		for(int a:arry)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		int mid=len/2;
		return arry[mid];
		
	}

	public static void main(String[] args) {
		int[] arr = {34,56,74,12,64,9,545,97};
		int length = arr.length;

		System.out.println(findMedian(length,arr));

	}

}
