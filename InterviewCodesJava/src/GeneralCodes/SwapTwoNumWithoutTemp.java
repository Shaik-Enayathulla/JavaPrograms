package GeneralCodes;

public class SwapTwoNumWithoutTemp {

	public static void main(String[] args) {
		int n1 = 34;
		int n2 = 71;
		System.out.printf("Before swaping the numbers the n1:%d and n2=%d",n1,n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println();
		System.out.printf("After swaping the numbers the n1:%d and n2=%d",n1,n2);
	}

}
