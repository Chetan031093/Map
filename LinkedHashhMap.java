package Map;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Collection;
import java.util.Collections;

public class LinkedHashhMap 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> l = new LinkedHashMap<Integer,String>();
		
		l.put(1, "chetan");
		l.put(2, "akshay");
		l.put(1, "dinga");
		l.put(1, "bunga");
		l.put(4, "bunga");
		
		System.out.println(l.get(1));
		System.out.println(l.containsKey(2));
		System.out.println(l.containsValue("bunga"));
		System.out.println(l.containsValue("dinga"));
		
		System.out.println();
		try
		{
		System.out.println(Collections.frequency((Collection<?>) l, "dinga"));
		}
		catch(Exception e)
		{
			System.out.println("handled");
		}
		
		for(Map.Entry m1 : l.entrySet())
		{
			System.out.println(m1.getKey()+": "+m1.getValue());
		}
	}
}
