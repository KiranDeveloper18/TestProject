import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		Map <String , String> map = new HashMap<>();
		map.put("My name", "orsu uday kiran");
		map.put("Bike", "Royal enfield");
		map.put("BestFriend", "myself");
		map.put("King", "Shivaji");
		map.put("Bike", "Activa");  // this is replacing the royal enfield.
		
		Set <String> keys = map.keySet();
		
		for( String key : keys  )
		{
		   System.out.println(key + " " + map.get(key));
		
		}
	}
}
