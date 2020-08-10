import java.util.*;


public class VectorDemo 
{

	public static void main(String[] args) 
	{
		int array[] = new int[]{8,56,148,4,6};
		
		Vector<Integer> v = new Vector<>();
	
		v.addElement(5);
		v.addElement(10);
		v.addElement(9);
		v.addElement(29);
		
		
		Hashtable<Integer,String> h = new Hashtable<>();
		
		//to add key and value
		h.put(5, "uday");     // here 5 is the key , uday is the value.
		h.put(2 , "orsu");
		h.put(13, "harsh");
		
		System.out.println(array[3]);
		System.out.println(v.elementAt(3));
		System.out.println(h.get(2));            
		
		
		System.out.println();
		
			{ 

				// Declaring the ArrayList 
				// initial size n 
				ArrayList<Integer> al = new ArrayList<Integer>(); 

				// Appending new elements at 
				// the end of the list 
				for (int i = 1; i <= 5; i++) 
			    al.add(i); 

				// Printing elements 
				System.out.println(al); 

				// Removing element at index 3 
				al.remove(1); 

				// Displaying the ArrayList 
				// after deletion 
				System.out.println(al); 

				// Printing elements one by one 
				for (int i = 0; i < al.size(); i++) 
			    System.out.print(al.get(i) + " "); 
				
				
				//linked list and vector is also same as the array list
				
				System.out.println();
				System.out.println();
				// stack 

				{
						Stack<String>stk = new Stack<String>(); 
						stk.push("Dhoni"); 
						stk.push("Kohli"); 
						stk.push("Rohit"); 
						stk.push("Dinesh karthik"); 

						// Iterator for the stack 
						Iterator<String> itr =  stk.iterator(); 

						// Printing the stack 
						 while (itr.hasNext()) 
						 { 
					        System.out.println(itr.next() + " "); 
					     } 
                          System.out.println();
                          
						 stk.pop(); 

						
						// Iterator for the stack 
						itr = stk.iterator(); 
						
				


						// Printing the stack 
						while (itr.next() != null) 
						{ 
							System.out.println(itr.next() + " "); 
						} 
	                    throw new NoSuchElementException();
				} 
			} 

	} 
} 



