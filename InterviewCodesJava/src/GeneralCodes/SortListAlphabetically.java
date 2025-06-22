package GeneralCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortListAlphabetically {
	
	public static List<Character> sort(List<Character> Inputlist)
	{
		/*int n= Inputlist.size();
		for(int i=0; i<n;i++)
		{
			//int ascii = (int) Inputlist.get(i);
			for(int j=i+1;j<n;j++)
			{
				//int ascij = (int) Inputlist.get(j);
				if(Inputlist.get(i)>Inputlist.get(j))
				{
					char temp = Inputlist.get(i);
					Inputlist.set(i, Inputlist.get(j));
					Inputlist.set(j, temp);
				}
			}
		}*/
		Collections.sort(Inputlist);
		return Inputlist;
		
	}

	public static void main(String[] args) {
		
		List<Character> ls = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of a list: ");
		int size = sc.nextInt();
		while(size!=0)
		{
			int inx = size;
			System.out.println("Enter the character: ");
			String s = sc.next();
			char[] ch = s.toCharArray();
			ls.add(ch[0]);
			size--;
		}
		System.out.println(ls);
		List<Character> sortedList = sort(ls);
		System.out.println(sortedList);

	}

}
