package Set1OOPsGUIAWTSwing;
class A5{
	final void show() { 
		/* Error: Cannot override the final method from A5
		Without "final"keyword we got output as "I am in class B".
		Sometimes in java we don't want to overide our written methods we want to use it as it is
		that's why use final keyword for methods.*/
		System.out.println("I am in class A");
	}
}
class B5 extends A5{
void show() {
	System.out.println("I am in class B");
	}
}

public class FinalKeywordExample2 {
	public static void main(String[] args) {
		A5 ob = new B5();//Object of B is getting created and reference of A 
		ob.show();
	}

}/*
final class A5{ (//Error: Final class cannot be inherited(that is it cannot be parent
but child class can be final)
	}
class B5 extends A5{
	}
public class FinalKeywordExample2 {
	public static void main(String[] args) {
	}
}*/
	