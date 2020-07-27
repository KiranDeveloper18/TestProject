
public class Starprgms
{

	public static void main(String[] args) 
	{
		//star pattern 10
		vsymbol();
		
		//star pattern 11
		reversev();
		
	    //star pattern 12
		hallowsquare();

	}

	
	private static void hallowsquare() 
	{
		for (int row=1; row<=5; row++)
		{
			
			for (int  coloumn=1; coloumn<=5; coloumn++)
			{
				    if ( row>=2 && coloumn>=2 && row<=4 && coloumn <=4)
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
	
	private static void reversev() 
	{
		for (int row=1 ; row<=5;row++)
		{
			for (int secondRow=4; secondRow>=row; secondRow--)
			{
				System.out.print(" ");
			}
			for (int  coloumn=1; coloumn<(row*2); coloumn++)
			{
				    if ( coloumn>1 && coloumn <(row*2)-1)
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

	private static void vsymbol() 
	{
		for (int row=5 ; row>=1;row --)
		{
			for (int column =5; column>row; column--)
			{
				System.out.print(" ");
			}
			for (int secondRow =1; secondRow<(row*2); secondRow++)
			{
				    if ( secondRow>1 && secondRow <(row*2)-1)
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

}


