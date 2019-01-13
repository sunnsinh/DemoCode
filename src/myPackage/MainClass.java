package myPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) 
	{
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("First", "Z");
		map.put("Second", "A");
		map.put("Third", "D");
		
		
		List<Entry<String, String>> list = new LinkedList<>(map.entrySet());
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			Entry<String,String> entry = (Entry<String, String>) it.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
			
		}
		
		/*for(Map.Entry<String, String> localmap:map.entrySet())
		{
			System.out.println("key= "+localmap.getKey());
			System.out.println("Value= "+localmap.getValue());
			
		}
		*/

	}

}
