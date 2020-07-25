package collectors;

import java.util.HashMap;
import java.util.Map;

public class MapAddGeneric {

	public static void main(String[] args) 
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(100, "Amit");
		map.put(101, "Vinay");
		map.put(102, "Ram");
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
