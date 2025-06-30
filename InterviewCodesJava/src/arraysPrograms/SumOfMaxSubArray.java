package arraysPrograms;

public class SumOfMaxSubArray {

	public static void main(String[] args) {
		int[] intArry = {1,4,-96,23,76,-23,54,32,68,12};
		int maxSum=intArry[0];
		int currentSum=intArry[0];
		for (int i = 1; i < intArry.length; i++) 
		{
			currentSum=Math.max(intArry[i], currentSum+intArry[i]);
			maxSum=Math.max(maxSum, currentSum);
		}
		System.out.println("The Highest sum of an input integer array is: "+maxSum);

	}

}
