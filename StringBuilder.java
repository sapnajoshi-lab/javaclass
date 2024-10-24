package String;

public class StringBuilder {

	public static void main(String[] args) {
		// StringBuilder,StringBuffer
		StringBuilder str=new StringBuilder("Hllo Everyone!");
		System.out.println(str);
		str.insert(1, 'e');
		System.out.println(str);
		str.append("Welcome");
		System.out.println(str);
		str.delete(6, 15);
		System.out.println(str);
		str.replace(6, 15, "All");
		System.out.println(str);
		

	}

}