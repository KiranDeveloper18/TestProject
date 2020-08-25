
public class CountCharacters 
{

	public static void main(String[] args)
	{
		
		String input = "i am from orsu family and son of orsu narendra";
		
		// using for loop
		
		int charCount = 0;
		
		for(int i = 0 ; i<input.length(); i++)    // here .length() is used because the length of the string is not known to the user. 
		{
			if (input.charAt(i) == 'm')
			{
				charCount++;
			}
		}
			System.out.println("Number of counts of a user wants character in an given string is : " + charCount);	
			
			
	    // using enhanced for loop
			
			
         	charCount = 0;   					  // this has to be declare once again because the string count starts from the starting again.
				
			for (char ch : input.toCharArray())   // toCharArray() is a method that converts the given string into new char array. 
			{
				if (ch == 'f')        
				{
					charCount++;
				}
			}
			
			System.out.println("Number of counts of a user wants character in an given string is : " + charCount);	

	}

}
