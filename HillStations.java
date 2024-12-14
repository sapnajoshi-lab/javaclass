package labquestions;

	class HillStation{
		public void location() {
			System.out.println("This Hill Station is in");
		}
		
		public void famousFor() {
			System.out.println("This is famous for");
		}
	}

	class Matheran extends HillStation{	
		public void location() {
			System.out.println("Matheran is  in Maharashtra");
		}
		
		public void famousFor() {
			System.out.println(" This is famous for its it's Shady Forests");
		}
	}

	class Mussoorie extends HillStation{
		public void location() {
			System.out.println("Mussoorie is  in Dehradun");
		}
		
		public void famousFor() {
			System.out.println(" This is famous for its sceneries ");
		}
	}

	class Daarjeeling extends HillStation{
		public void location() {
			System.out.println("Daarjeeling is in West Bengal");
		}
		
		public void famousFor() {
			System.out.println(" This is famous for its Tea Gardens");
		}
	}
	public class HillStations {
		
	public static void main(String[] args) {
		Matheran m=new Matheran();
		m.location();
		m.famousFor();
		Mussoorie m1=new Mussoorie();
		m1.location();
		m1.famousFor();
		Daarjeeling g=new Daarjeeling();
		g.location();
		g.famousFor();
	}

}
