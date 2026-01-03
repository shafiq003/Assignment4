package assignment4;

public class Static_instance {
	
	int  a = 5;
	static int b = 10;
	static final int c = 44;

	public static void main(String[] args) {
		
		Static_instance obj1 = new Static_instance();
		Static_instance obj2 = new Static_instance();
		
		obj1.a = 20;
		obj2.a = 25;
		
		Static_instance.b = 13;
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(Static_instance.b);

	}

}
