import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo 
{

	public static void main(String[] args) 
	{
		//using collection interface
		
				Collection<Integer> values = new ArrayList<>();  //Collection is interface & arraylist is class.
		        values.add(6);
		        values.add(5);
		        values.add(4);
		      
		        Iterator it = values.iterator();  //capital  Iterator  is interface and small iterator is method .
		        
		        while(it.hasNext())               //has next is a method which checks the upcoming letter  // Collection does not support index number 
		        {
		        System.out.println(it.next());    //next fetch values.
		        }
			
		        
		        System.out.println();



		    // using list interface

			{
				List<Integer> L = new ArrayList<>();  //Collection is interface & Arraylist is class, Integer holds only integer values.
		        L.add(6);                    	 // Integer v = new Integer(4);
		        L.add(5);                    	 // here 5 is an object on an integer.
		        L.add(8);        			 	 
		        L.add(1,4);     			 	 // 1 is index number and 4 is value
		        //L.add("123");               	 // here 123 is not an integer its an string.
		        
				Collections.sort(L); 			 // its makes the list into ascending order.
				//Collections.reverse(L);	     // it makes the list into decending order.
				//Collections.shuffle(L);        //uses to shuffle the values
		        
		        //for (int i=0;i<L.size();i++)   // we are using for-loop because it supports index number  // size method is used to if dont the size of list
		        for(Integer o : L)                   // enhanced for loop
		        {
		        	System.out.println(o);
		        }
			 }
			
	}

}
