
public class Palindrome 
{
	// Function that returns true or false depends upon the string
    static boolean isPalindrome(String str)     
    { 
   
        int i = 0;                               // Pointers pointing to the beginning 
        int j = str.length() - 1;        		 // it is a method which checks the the string from  back.
        
        while (i < j) 
        { 
            if (str.charAt(i) != str.charAt(j))   //it is to check the mismatch of the string
            return false; 
            i++;                                  // Increment from starting pointer of the string 
            j--; 								  // decrement the other 	
        } 
            return true;                          // if string is a palindrome 
    } 
 	
	public static void main(String[] args) 
	{
		String str = "abbbbaa"; 
		String str1 = "baab";
		  
		if (isPalindrome(str)) 
	    System.out.print("Yes its a palindrome : "  + isPalindrome(str) ); 
	    else
	    System.out.print("No its not a palindrome : " +  isPalindrome(str)); 
		
		System.out.println();
		 
		if (isPalindrome(str1)) 
	    System.out.print("Yes its a palindrome : "  + isPalindrome(str1) ); 
	    else
        System.out.print("No its not a palindrome : " +  isPalindrome(str1)); 
	             
        
	}

}
