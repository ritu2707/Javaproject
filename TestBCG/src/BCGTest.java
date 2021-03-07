import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BCGTest {

	public static void main(String[] args) {
		String[] input= {"eat","ate","tea","Java","avja","apple"};
		
		maintainOrder(input);

	}

	private static void maintainOrder(String[] input) {
		
		HashMap <String,Integer> map=new HashMap<String,Integer>();
	
		for(int i=0;i<input.length;i++)
		{
			String temp=input[i].toLowerCase();
			char[] x=temp.toCharArray();
			Arrays.sort(x);	
			String inputN= new String(x);
			if(!map.containsKey(inputN))
				map.put(inputN, 1);
			else
				map.put(inputN, map.get(inputN)+1);			
		}
		//System.out.println(map);
		
		Set<Entry<String, Integer>> entryset= map.entrySet();
		
		for(Entry<String,Integer> e:entryset)
		{
			System.out.println("The count of number of strings which are similar but jumbled. "+e.getKey()+" :"+ e.getValue());
		}
		
		
		
	}

}
