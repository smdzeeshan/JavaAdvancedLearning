package staticClassLearn;

public class StaticClassLearn {
	private static int var = 2;
	private int num = 9;
	
	static class StaticClass{
		public void access() {
			System.out.println(var);
			// System.out.println(num);
		}
	}
	
	class InstanceClass{
		public void access() {
			System.out.println("=== Printing from non static class ====");
			System.out.println(var);
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		StaticClassLearn.StaticClass demo = new StaticClass();
		demo.access();
		
		StaticClassLearn classLearn = new StaticClassLearn();
		StaticClassLearn.InstanceClass demo2 = classLearn.new InstanceClass();
		demo2.access();
	}
}
