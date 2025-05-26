package arraysPrograms;

public class FindingOvwels {
	
	public static boolean isOvwel(char c) {
		return "aeiouAEIOU".indexOf(c)!=-1;
	}

	public static void main(String[] args) {
		String str = "SHaIK.EnayathuLla", strNew="";
		//str=str.toLowerCase();
		int count = 0;
		char[] str_arr = str.toCharArray();
		
		for(char ch:str_arr)
		{
			if(isOvwel(ch))
			{
				count++;
				strNew+="*".repeat(count);
			}
			else
			{
				strNew=strNew+ch;
			}
		}
		System.out.println("No.of ovwels in an input string is: "+count);
		System.out.println(strNew);
	}

}
