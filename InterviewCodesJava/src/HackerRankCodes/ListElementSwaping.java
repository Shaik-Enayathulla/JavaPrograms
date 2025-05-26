package HackerRankCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListElementSwaping {
	static int sec=0;
	public static boolean check(List<Integer> filecheck)
	{
		int i=0;
		while(i<filecheck.size())
		{
			if(filecheck.get(i)>filecheck.get(i+1))
			{
				return true;
			}
			i++;
		}
		return false;
		
	}
	
	public static int swap(List<Integer> FolderFile)
	{
		sec++;
		int fistele = FolderFile.get(0);
		FolderFile.remove(0);
		FolderFile.add(fistele);
		for(int i=FolderFile.size()-1;i>0;i--)
		{
			if(FolderFile.get(i)<FolderFile.get(i-1))
			{
				int temp=FolderFile.get(i);
				FolderFile.set(i,FolderFile.get(i-1));
				FolderFile.set(i-1,temp);
				System.out.println(FolderFile);
			}
		}
		
		if(check(FolderFile) && sec<FolderFile.size())
		{
			swap(FolderFile);
		}
		return sec;
		
	}

	public static void main(String[] args) {
		
		List<Integer> folder = new ArrayList<>(Arrays.asList(2,8,7,9,10,7));
		System.out.println("Input list before swap apply: "+folder);
		boolean possible = check(folder);
		if(possible)
		{
			System.out.println("Enter the swaping loop which gives seconds");
			int seconds = swap(folder);
			System.out.println("Total swap ocuured: "+seconds);
		}
		else
		{
			System.out.println("-1");
		}
		
	}

}
