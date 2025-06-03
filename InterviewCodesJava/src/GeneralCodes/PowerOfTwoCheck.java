package GeneralCodes;

import java.util.Scanner;

public class PowerOfTwoCheck {
	    
	    static class Inner{
	        private static class Private{
	            public boolean isPowerofTwo(int n)
	            {
	                if(n<=0)
	                {
	                    return false;
	                }
	                while(n>1)
	                {
	                    if(n%2!=0)
	                    {
	                        return false;
	                    }
	                    n/=2;
	                }
	                return true;
	            }
	        }
	    }
	    

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int num =sc.nextInt();
	        
	        Inner.Private obj = new Inner.Private();
	        if(obj.isPowerofTwo(num))
	        {
	            System.out.printf("%d is power of 2",num);
	            System.out.println();
	            System.out.print("An instance of class: Solution.Inner.Private has been created");

	        }
	        else{
	            System.out.printf("%d is not a power of 2",num);
	             System.out.println();
	            System.out.print("An instance of class: Solution.Inner.Private has been created");
	        }
	        sc.close();
	    }
	}