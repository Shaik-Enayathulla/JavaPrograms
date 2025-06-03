package GeneralCodes;

public class insertionSort {
	
	public static void insertionsort(int[] arr)
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}

	public static void main(String[] args) {
		int[] arr= {324,54,56,65,6,478,954,36,67,4};
		insertionsort(arr);
		System.out.println("The Sorted array is:");
		for(int var:arr)
		{
			System.out.print(var+", ");
		}
		

	}

}
