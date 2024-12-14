package labquestions;
import java.util.TreeMap;
public class treemapex {

	    public static void main(String[] args) {
	        TreeMap<String, Integer> map = new TreeMap<>();
	        map.put("One", 1);
	        map.put("Three", 3);
	        map.put("Two", 2);

	        System.out.println("Initial TreeMap: " + map);

	        // Removing the entry associated with key "Two"
	        Integer removedValue = map.remove("Two");

	        System.out.println("Removed value = " + removedValue);
	        System.out.println("Is the entry {Three=3} removed? " + !map.containsKey("Three"));
	        System.out.println("Updated TreeMap: " + map);
}
}
