package StringPrograms;

import java.util.Scanner;

public class ReverseOfWordsAtString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res ="";
		String[] str_arr = str.split(" ");
		for(String s : str_arr)
		{
			StringBuffer strb = new StringBuffer(s);
			strb.reverse();
			res=res+strb.toString()+" ";
		}
		System.out.println(res);
		
	}

}
