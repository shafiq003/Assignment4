package assignment4;

public class Local_instance_static {
	
	int b = 20;
	static int c = 30;
	
	void disp(int a) {
		int b =12;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		Local_instance_static obj1 = new Local_instance_static();
		obj1.disp(5);
		
		int instance = obj1.b = 200;
		System.out.println(instance);
		
		int static_var = Local_instance_static.c = 300;
		System.out.println(static_var);
		

	}

}
