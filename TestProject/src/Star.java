
public class Star 
{

	public static void main(String[] args)
	{
		  //star pattern 7
		   reversepyramid();  
		
		  //star pattern 8
	       rightdiagonal();
	      
	      // star pattern
	       leftdiagonal();
	      
	}

	private static void rightdiagonal() 
	{
		for (int row=1; row<=5; row++)
		   {
			   for(int column=1; column<=row; column++)
			   {
				   if (row>=2 && column<=row-1)
				   {   
				      System.out.print(" ");
				   }
				   else
				   {
					   System.out.print("*");
				   }
					 
			   }
			          System.out.println(); 
		   }
		            System.out.println();
	}

	   
	private static void leftdiagonal() 
	{
		for(int row=1; row<=5; row++)
		   {
			   for (int coloumn=5; coloumn>row; coloumn--)
			   {
				   System.out.print(" ");  
			   }
			   for (int secondRow=1; secondRow<=row; secondRow++)
			   {
				   if (row>=2 && secondRow>1)
				   {
					   System.out.print(" ");
				   }
				   else
				   {
					   System.out.print("*");
				   }
			   }
			         System.out.println();
		   }
	}
	
	
	private static void reversepyramid() 
	{
		   for (int row=1; row<=4; row++)
		   {
			   for(int column=2; column<=row; column++)
			   {
				   System.out.print(" ");
			   }
			    for (int secondRow=4; secondRow>=row; secondRow--)
			    {
				  System.out.print("*");  
			    }

		         for (int secondColumn=3; secondColumn>=row; secondColumn--)    
		         { 
			    		 System.out.print("*");   
		         }
		            System.out.println();
		    }
	}
}

