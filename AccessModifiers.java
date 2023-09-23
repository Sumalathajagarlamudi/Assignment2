package interfaceAssignment;

public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers suma = new AccessModifiers();
		suma.method();
		suma.method1();
		suma.method2();
		suma.method3();	
	}
	
	public static void method() {// we can use complete project
		System.out.println("this is public method");
}
	private void method1() {// we can use within the class
		System.out.println("this is private method");
		
	}
	protected void method2() {// within the package and  if u want to access outside the package we have to use child class
		System.out.println("this is protected method");
		
	}
	void method3() {//within the package only
		System.out.println("this is default method");
		
		
	}
	


	}


