import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueDemo 
{

	public static void main(String[] args) 
	{
		//creating an empty priority queue
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		pQueue.add(68);
		pQueue.add(64);
		pQueue.add(30);
		pQueue.add(22);
		
		
		// Printing the top element of PriorityQueue 
		System.out.println(pQueue.peek());
		
		// Printing the top element and removing it from the PriorityQueue container 
		System.out.println(pQueue.poll());
		
		
		// Printing the top element again 
		System.out.println(pQueue.peek());
		
		
		System.out.println(pQueue.poll()); 
		
		System.out.println(pQueue.peek());
	
	    
	     System.out.println();
	
	         {
	                // Initializing an deque 
				    ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(10); 
				
				    // add() method to insert 
				    de_que.add(10); 
				    de_que.add(20); 
				    de_que.add(30);              
				    de_que.add(40); 			  
				    de_que.add(50);                
				
				    System.out.println(de_que); 
				    de_que.remove(40);    
				    
				    System.out.println(de_que);
				
				    // clear() method 
				     de_que.clear();    
				
				    // addFirst() method to insert the elements at the head 
				    
				    de_que.addFirst(820); 
				    de_que.addFirst(193); 
				    de_que.addFirst(148);        
                    de_que.addFirst(362);           // then this
                    de_que.addFirst(950);       // first prints this 
                    
                    
				
				    // addLast() method to insert the elements at the tail 
                    de_que.addLast(16);           
				    de_que.addLast(24); 
				    de_que.addLast(14); 
				    
				
				    System.out.println(de_que); 
				    
				    de_que.remove(148);         // this method to remove the values in the array lists
				    de_que.remove(14);
				    
				    System.out.println(de_que);
				    
	         }
	  }        
}