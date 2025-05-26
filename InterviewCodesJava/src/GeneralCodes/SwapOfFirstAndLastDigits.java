package GeneralCodes;

public class SwapOfFirstAndLastDigits {

	public static void main(String[] args) {
		int num = 87693;
		System.out.println(num);
		int firstDigit = num;
		int lastDigit=num%10;
		
		while(firstDigit>=10)
		{
			firstDigit=firstDigit/10;
		}
	
		System.out.println(lastDigit);
		System.out.println(firstDigit);
		String numStr = Integer.toString(num);
		System.out.println("The length of a number is: "+numStr.length());
		int middleDigits = Integer.parseInt(numStr.substring(1,numStr.length()-1));
		System.out.println(middleDigits);
		int finalnum = (int) (lastDigit*Math.pow(10, numStr.length()-2))+middleDigits;
		finalnum=finalnum*10+firstDigit;
		System.out.println(finalnum);
	}

}
