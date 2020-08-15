import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstNonRepeated 
{

	public static char firstNonRepeatingChar(String word)
	{
		Set<Character> nonRepeating = new HashSet<>();   //set interface only contains unique elements
		List<Character> repeating = new ArrayList<>();   // list interface contains mixed elements.
		
		for(int i = 0 ; i<word.length(); i++)            // word.lenghth() method is used because if we dont know the word length.
		{
			char text = word.charAt(i);
			
			if (nonRepeating.contains(text))              
			{
				continue;
			}
				
			if (repeating.contains(text))            
			{
			    repeating.remove((Character) text);  //removes the repeating letter from the text till it gets as non repeated.
				nonRepeating.add(text);              //adds text into nonRepeating.
			}
			else
			{
				repeating.add(text);                 //it adds a letter to the list
			}
		}
		     return repeating.get(0);
	}
	
	public static void  main(String[] args) 
	{
		String word = "narendra";
			
		System.out.println("First non repeated character in a string is : " + firstNonRepeatingChar(word));
	
	}

}
