import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySumUsingSet 
{

	
  public static void printPairsUsingSet(int[] numbers, int n)   // this method will finds two elements in an array and equals to n.
  {
	  if(numbers.length<2)
	  {
		  return;
	  }
	  
	  Set<Integer> s = new HashSet<>(numbers.length);        
	  
	  for(int value : numbers)
	  {
		  int target = n - value;
		  
		  if (!s.contains(target))             // if target number is not in set then add 

		  {
			  s.add(value);
		  }
		  else
		  {
			  System.out.printf("(%d, %d) %n" , value , target);
		  }
		  
	  }
			  
  }
  
  public static void prettyPrint(int[] random, int k)           
  {
	  System.out.println("Random Integer array : " + Arrays.toString(random));
	  System.out.println("Sum : " + k);
	  System.out.println("pair of numbers from an array whose sum equals to " + k);
	  printPairsUsingSet(random , k);

  }
  
   public static int[] getRandomArray(int length)
   {
	   int[] randoms = new int[length];
	   
	   for (int i = 0 ; i< length; i++)
	   {	
		   
		randoms[i] = (int)(Math.random()*25);
		
	   }
	   
	   return randoms;
   }


	public static void main(String[] args) 
	{
		prettyPrint(getRandomArray(8), 22);
		prettyPrint(getRandomArray(9), 13);

	}



}
