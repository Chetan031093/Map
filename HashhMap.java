package Map;
import java.util.HashMap;
import java.util.Map.Entry;


public class HashhMap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> h1 = new HashMap <Integer,String>();
		h1.put(1, "chetan");
		h1.put(2, "akshay");
		h1.put(3, "salve");
		h1.put(4, "prakash");
		h1.put(1, "dinga");
		System.out.println(h1.get(1));
		
		System.out.println(h1.containsKey(3));
		System.out.println(h1.containsValue("chetan"));
		System.out.println();
		
		for(Entry<Integer, String> m1 : h1.entrySet())
		{
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
	}
}
