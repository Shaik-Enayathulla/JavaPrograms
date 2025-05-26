package ListPrograms;

import java.util.ArrayList;
import java.util.List;

public class SortLiatAlphabetically {

	public static void main(String[] args) {
		List<Character> ls = new ArrayList<>(List.of('k','j','a','z','l','m','n','o','b','y','c','x','d','w'));
		List<Character> sorted = new ArrayList<>();
		for(int i=0;i<ls.size();i++)
		{
			for(int j=i+1;j<ls.size();j++)
			{
				int num1 = (int) ls.get(i);
				int num2 = (int) ls.get(j);
				if(num1>num2)
				{
					char temp = ls.get(i);
					ls.set(i, ls.get(j));
					ls.set(j, temp);
				}
			}
		}
		System.out.println(ls);

	}

}
