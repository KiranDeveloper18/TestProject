import java.util.Arrays;
import java.util.BitSet;


public class MissingNumberInArray 
{

	public static void main(String[] args) 
	{
		
		        // one missing number
		        printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);
		 
		        // two missing number
		        printMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}, 10);
		 
		        // three missing number
		        printMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);
		 
		        // four missing number
		        printMissingNumber(new int[]{1, 2, 3, 4, 9, 8}, 10);
		 
		        // Only one missing number in array
		        int[] iArray = new int[]{1, 2, 3, 5};
		        int missing = getMissingNumber(iArray, 5);
		        System.out.printf("Missing number in array ",  Arrays.toString(iArray), missing);
		    }
		   
		    private static void printMissingNumber(int[] numbers, int count)    //this method is for array if it has more than one missing elements.
		    {
		        int missingCount = count - numbers.length;
		        BitSet bitSet = new BitSet(count);
		 
		        for (int number : numbers) 
		        {
		            bitSet.set(number - 1);
		        }
		 
		        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
		        Arrays.toString(numbers), count);
		        int lastMissingIndex = 0;

		        for (int i = 0; i < missingCount; i++) 
		        {
		            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
		            System.out.println(++lastMissingIndex);
		        }
		 
		    }
		   
		    private static int getMissingNumber(int[] numbers, int totalCount)    //can be used to find missing elements on integer array of numbers from 1 to 100 or 1 - 1000 
		    {
		        int expectedSum = totalCount * ((totalCount + 1) / 2);
		        int actualSum = 0;
		        for (int i : numbers) 
		        {
		            actualSum += i;
		        }
		 
		        return expectedSum - actualSum;
		    }
		
	}


