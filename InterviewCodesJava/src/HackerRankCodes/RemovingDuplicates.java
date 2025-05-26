package HackerRankCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemovingDuplicates {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("ShaIK","KhAn","Self","shaik","Enna","Smart","KHAN","SHAik"));
		/*for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equalsIgnoreCase(list.get(j)))
				{
					list.remove(j);
				}
			}
		}*/
		
		Set<String> uniquelist = new LinkedHashSet<>(list.stream()
				.map(String::toLowerCase)
				.collect(Collectors.toList()));
	
		
		List<String> unique = new ArrayList<>(uniquelist);
		
		System.out.println(list);
		System.out.println(uniquelist);

	}

}
