package Set1OOPsGUIAWTSwing;

/*
class A2{
	void show() {
		System.out.println("I am in class A");
	}
}
class B2 extends A2{
	void show() {
		super.show();//show method is also helpful in method overriding 
		System.out.println("I am in class B");
	}
}
public class SuperKeywordExample3 {
	public static void main(String[] args) {
		A2 ob = new B2();
		ob.show();
		}
Output: I am in class A I am in class B		
*/	
class A2{
	void show() {
		System.out.println("I am in class A");
	}
}
class B2 extends A2{
	void show() {
		System.out.println("I am in class B");
	}
	void m1() {
		super.show();
	}
}
public class SuperKeywordExample3 {
	public static void main(String[] args) {
		B2 ob = new B2();
		ob.m1();
		}
}
//Output: I am in class A 
