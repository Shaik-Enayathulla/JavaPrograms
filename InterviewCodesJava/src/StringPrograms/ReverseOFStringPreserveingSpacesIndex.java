package StringPrograms;

public class ReverseOFStringPreserveingSpacesIndex {

	public static void main(String[] args) {
		String st = "This is String Reversal Program where Preserving the Space Position";//Input String
		
		char[] input = st.toCharArray();
		char[] result = new char[input.length];
		
		for(int i=0;i<input.length;i++)
		{
			if(input[i]==' ')
			{
				result[i]= ' ';
			}
		}
		
		int j=input.length-1;
		
		for(int i=0;i<input.length;i++)
		{
			if(input[i]!=' ')
			{
				while(result[j]==' ')
				{
					j--;
				}
				result[j]=input[i];
				j--;
			}
			
		}
		System.out.println(new String(result));
	}
	
}
