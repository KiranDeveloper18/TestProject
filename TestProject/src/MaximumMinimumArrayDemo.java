import java.util.Arrays;

public class MaximumMinimumArrayDemo 
{
     public static void LargestAndSmallest(int [] numbers)
     {
    	int largest  = Integer.MIN_VALUE;    // it is to compare and get the highest number in the array
    	int smallest = Integer.MAX_VALUE;
    	
    	for(int number : numbers)          // logic part  is the main thing in this
    	{
    		if (number>largest)
    		{
    			largest = number;
    		}
    		else if(number < smallest)
    		{
    			smallest = number;
    		}
     }
    	
    	System.out.println("Given integer array : " + Arrays.toString(numbers));    //array.tostring() is a method that represents the array list of the user
    	
    	System.out.println("Largest number in array is : " + largest);
    	
    	System.out.println("Smallest number in array is : " + smallest);
  	 
       }
	
	
	public static void main(String[] args) 
	{
		LargestAndSmallest(new int [] {30,28,43,99, -22 , -68, -54, Integer.MAX_VALUE });   // int max value is the highest value of the int
		LargestAndSmallest(new int [] {23,345,986,4398,34,-23,-23423,-2325,});
		LargestAndSmallest(new int [] {445,45,56,578,342,767,-345,-67,878,-235, Integer.MIN_VALUE }); //here min value is the smallest number in the int
		LargestAndSmallest(new int [] {98,75,7572,23535,-334,-534,-453,-35});
	}

}
