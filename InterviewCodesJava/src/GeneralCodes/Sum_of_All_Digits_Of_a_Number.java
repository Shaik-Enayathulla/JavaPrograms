package GeneralCodes;

public class Sum_of_All_Digits_Of_a_Number {

	public static void main(String[] args) {
		int num =1578987618;
		int sum=0;
		while(num>0)
		{
			sum+=num%10;
			//System.out.println(num);
			num/=10;
		}
		System.out.println(sum);
	}

}
