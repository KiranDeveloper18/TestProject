
public class PrimeNumber 
{
	 public static  String isPrimeOrNot(int num)
		{ 
			if (num < 0) 
			{ 
				return "not valid";            // we have to provide this or else the user might have chance to check with negative values.
			} 
			if (num == 0 || num == 1)          // 0 & 1 are not a prime numbers 
			{
				return "not a prime number"; 
			} 
			if (num == 2 || num == 3)          // 2 is even prime number 
			{ 
				return "prime number"; 
			} 
			if ((num * num - 1) % 24 == 0)     // this is the mathematical logic for any number.
			{ 
				return "prime number"; 
			}
			else 
			{
				return "not a prime number";
			} 
		}

	public static void main(String[] args) 
	{
		int num = 68;
		
		System.out.println("Enter number to check if the number is prime or not : " + num);
		System.out.println("Does the number " + num + " is a prime number or not : " + isPrimeOrNot(num));


	}

}
