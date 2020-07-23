
public class StarPrograms {

	public static void main(String[] args) 
	{
		        //star pattern 4
				righttraingle();
				
				//star pattern 5
			    reversetraingle();
			       
			    //star pattern 6
			    pyramid();

	}

	private static void pyramid() 
	{
		for (int row=1; row<=4; row++)
		   {
			   for(int column=3; column>=row; column--)
			   {
				   System.out.print(" ");
			   }
			  for (int secondRow=1; secondRow<=row; secondRow++)
			  {
				System.out.print("*");  
			  }

		        for (int secondColumn=2; secondColumn<=row; secondColumn++)    //here 'secondColumn' is for another iteration of new column
		        { 
			    		 System.out.print("*");   
		        }
		           System.out.println();
		     }
	}

	private static void reversetraingle() 
	{
		for (int row=1; row<=4; row++)
		   {
			   for(int column=2; column<=row; column++)
			   {
				   System.out.print(" ");
			   }
			  for ( int secondRow=4; secondRow>=row; secondRow--)
			  {
				System.out.print("*");  
			  }
			  System.out.println();
		   }
		   System.out.println();
	}

	private static void righttraingle() 
	{
		for(int row=1; row<=4; row++)
		{
 
		    for(int column=3; column>=row; column--)
		    {   
		        System.out.print(" ");
		    }
		   
		    for (int secondRow=1; secondRow<=row;secondRow++)    //here 'secondRow' is the another iteration of new row
		     {
			    System.out.print("*");
		     }
		        System.out.println();
		}
		     System.out.println();
	}

}
