import java.util.*;
public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		
		
		 
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  
		  System.out.println(list_Strings);
		  
		  System.out.println();
		  
		//  list and addding colors to the list with iterator
		  List<String> ls = new ArrayList<String>();
		  ls.add("Red");
		  ls.add("Green");
		  ls.add("Orange");
		  ls.add("White");
		  ls.add("Black");
		  // Print the list
		  for (String element : ls) 
		  {
		      System.out.println(element);
		  }
		  
		  System.out.println();
		  
		  {
		  // adding colour where ever we want.
		  List<String> ls1 = new ArrayList<String>();
		  ls1.add("Red");
		  ls1.add("Green");
		  ls1.add("Orange");
		  ls1.add("White");
		  ls1.add("Black");
		  // Print the list
		  System.out.println(ls1);
		  
		  
		  // inserting a color at the first and last position of the list
		  ls1.add(0, "Pink");
		  ls1.add(5, "Yellow");
		  // Print the list
		  System.out.println(ls1);
		  }
		   System.out.println();
		  
		  {
			  // Creae a list and add some colors to the list
			  List<String> ls2 = new ArrayList<String>();
			  ls2.add("Red");
			  ls2.add("Green");
			  ls2.add("Orange");
			  ls2.add("White");
			  ls2.add("Black");
			  // Print the list
			  System.out.println(ls2);
			  
			  // Retriving the first and third element
			  String element = ls2.get(0);
			  System.out.println("First element: " + element);
			  
			  element = ls2.get(2);
			  System.out.println("Third element: " + element);
			  
			  
			  
        }
		          
	}
}
