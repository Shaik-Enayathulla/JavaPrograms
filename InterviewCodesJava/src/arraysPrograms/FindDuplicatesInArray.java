package arraysPrograms;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		//String[] str_arr = {"Shaik","Khan","Phatan","New","Dup","Hero","Shaik","Dup","Black","Shaik","Khan","Dup","Black"};
		char[] str_arr = {'s','g','s','k','s','d','g','h','k','k','h','s','z'};
		for(int i=0;i<str_arr.length;i++)
		{
			int flag=1;
			for(int j=i+1;j<str_arr.length;j++)
			{
				if(str_arr[i]!='_' && str_arr[i]==str_arr[j])
				{
					flag=flag+1;
					str_arr[j]='_';
				}	
			}
			if(str_arr[i]!='_' && flag > 1)
			{
			System.out.printf("The word \"%s\" repeted \"%d\" time in an array",str_arr[i],flag);
			System.out.println();
			}
		}
		//System.out.println("Array after duplicates removed "+str_arr);

	}

}
