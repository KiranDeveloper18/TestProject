import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;



public class RemoveDuplicateFromArrayList 
{

	public static void main(String[] args) 
	{
		//ArrayList with duplicates String
		List<String> duplicateList = (List<String>) Arrays.asList("android", "android", "ios" , "microsoft", "china brand"); // this is cool within one line

		System.out.println("Size of the arraylist with duplicates :" + duplicateList.size());
		
		System.out.println("ArrayList with duplicates: " + duplicateList);
		
		
		//Converting ArrayList to HashSet to remove duplicates
		LinkedHashSet<String> ListToSet = new LinkedHashSet<>(duplicateList);
		
		//Converting ArrayList to HashSet to remove duplicates
		List<String> ListWithoutDuplicates = new ArrayList<>(ListToSet);
		

		System.out.println("Size of the arraylist withoutduplicates :" + ListWithoutDuplicates.size());
		
		System.out.println("ArrayList withoutduplicates: " + ListWithoutDuplicates);
		
		
		
		

	}

}
