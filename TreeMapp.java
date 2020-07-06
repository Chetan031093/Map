package Map;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;

public class TreeMapp 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String>t = new TreeMap<Integer,String>();
		
		t.put(1, "chetan");
		t.put(2, "akshay");
		t.put(3, "salve");
		t.put(1, "dinga");
		
		System.out.println(t.get(2));
		System.out.println(t.containsKey(3));
		System.out.println(t.containsValue("chetan"));
		System.out.println();
		
		for(Entry<Integer,String>m1 : t.entrySet())
		{
			System.out.println(m1.getKey()+":"+m1.getValue());
		}
		
	}
}
