
public class FactorialOfNumber 
{
	
	//using recursion 
	
	public static int factorial(int number)
	{      
     
        if(number == 0)  				        // this is because factorial of 0 is 1;
        {
            return 1;
        }
        return number*factorial(number -1);     // here factorial is an method to achieve the factorial of given method. 
    }
 
      
	//using while loop or iteration
    public static int fact(int number)
    {

    	if(number == 0)                         // This is universal, factorial of 0 is 1;
    	{
    		return  1;
    	}
    	
        int result = 1;                          

        while(number != 0)
        {
            result = result*number;
            number--;
        }
     
        return result;
    }

	public static void main(String[] args) 
	{
		   int number = 3;
		   int result = 5;
		   
	       System.out.println("factorial of " + number + " using resursion in Java is: " + fact(number));
	       System.out.println("factorial of "+ result + " using loop or iteration in Java is: " + factorial(result));
	       
	}

}
