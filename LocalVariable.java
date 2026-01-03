package assignment4;

public class LocalVariable {
	
	void disp() {
		int a = 5;
		int b = 10;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		LocalVariable obj = new LocalVariable();
		
		obj.disp();

	}

}
