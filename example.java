package labquestions;
import java.util.*;

public class example {

	public static void main(String[] args) {
				Map<Integer,String>mapp=new LinkedHashMap();
				//put() to add values in map
				mapp.put(1, "AB");
				mapp.put(2, "CD");
				mapp.put(3, "EF");
				
				//entrySet() method to print the map
				System.out.println(mapp.entrySet());
				
				//containsKey() and containsValue() method to check if keys and value are present 
				System.out.println(mapp.containsKey(1));
				System.out.println(mapp.containsValue("CD"));
				
				//remove() method for removing entries
				System.out.println("Removed value: "+mapp.remove(1));
				System.out.println("Updated map: "+mapp);
			}

		}
