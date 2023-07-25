package Set1OOPsGUIAWTSwing;
class A4{
	void m1() {
	final int a =10;
	//a=a+20; Final variables cannot be reassigned
	System.out.println(a+20); //final variables can be accessed
	}
}

public class FinalKeywordExample {
	public static void main(String[] args) {
	A4 ob = new A4();
	ob.m1();
	}
}
