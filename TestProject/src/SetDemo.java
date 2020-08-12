import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetDemo 
{

	public static void main(String[] args) 
	{
		Set <Integer> s = new TreeSet<>();   //class tree set gives in sorted manner
		System.out.println(s.add(65));
		System.out.println(s.add(98));
		System.out.println(s.add(98));
		System.out.println(s.add(74));
		System.out.println(s.add(84));
		System.out.println(s.add(9));
		
		
		System.out.println();
		
		for(int i : s)        //enhanced for-loop.
		{
			System.out.println(i);
		}
		
	}

}
