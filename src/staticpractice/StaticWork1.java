package staticpractice;

public class StaticWork1 {
	
	static int i = 10; // will only work with static 
	int x = 20;
	
	
	
	
	static void info1() {
		System.out.println("test: "+i); // it will accept static and non static
		System.out.print("information: ");	
	}
	
	
	void info2() {
		System.out.println("no static: ");
	}
	
	}