
public class StarPrograms {

	public static void main(String[] args) 
	{
		        //star pattern 4
				for(int row=1; row<=4; row++)
				{
			 
				   for(int column=3; column>=row; column--)
				    {   
				        System.out.print(" ");
				    }
				   
				    for (int Row=1; Row<=row;Row++)    //here 'R' is the another iteration of new row
				     {
					    System.out.print("*");
				     }
				        System.out.println();
				}
				     System.out.println();
				
				//star pattern 5
			       for (int row=1; row<=4; row++)
			       {
			    	   for(int column=2; column<=row; column++)
			    	   {
			    		   System.out.print(" ");
			    	   }
			    	  for ( int Row=4; Row>=row; Row--)
			    	  {
			    		System.out.print("*");  
			    	  }
			    	  System.out.println();
			       }
			       System.out.println();
			       
			       //star pattern 6
			       for (int row=1; row<=4; row++)
			       {
			    	   for(int column=3; column>=row; column--)
			    	   {
			    		   System.out.print(" ");
			    	   }
			    	  for (int Row=1; Row<=row; Row++)
			    	  {
			    		System.out.print("*");  
			    	  }

			            for (int Column=2; Column<=row; Column++)    //here 'C' is for another iteration of new column
			            { 
					    		 System.out.print("*");   
			            }
			               System.out.println();
			         }

	}

}
