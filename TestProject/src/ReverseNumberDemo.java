
public class ReverseNumberDemo 
{
	 public static int reverse(int number)
	 {
	        int reverse = 0;
	        int remainder = 0;
	        
	        do
	        {
	           remainder = number%10;
	           
	           reverse = reverse*10 + remainder;
	           
	           number = number/10;
	         
	        }
	        
	        while(number > 0);
	     
	        return reverse;
	 }

	public static void main(String[] args) 
	{
		int number = 95093458; 
        System.out.println("Enter number to be reversed using Java program : " + number);
        
        int reverse = reverse(number);
        System.out.println("Reverse of number: " + number + " is " + reverse(number));

	}

}
