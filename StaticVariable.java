package assignment4;

public class StaticVariable {
	
	static int a = 5;
	static int b = 10;
	static final int c = 4;

	public static void main(String[] args) {
		
		StaticVariable.a = 15;
		StaticVariable.b = 20;
		
		System.out.println(StaticVariable.a + StaticVariable.b + StaticVariable.c);

	}

}

