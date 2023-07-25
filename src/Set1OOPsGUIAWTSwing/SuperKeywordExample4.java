package Set1OOPsGUIAWTSwing;
class A3{
	A3(){
		System.out.println("I am in class A3 Constructor ");
	}
}
class B3 extends A3{
	B3(){
		super();//Even if we don't write"super();" still due to inheritance compiler will 
		//execute all the constructors of parent class as well.[Condition: List of parameters should be same]
		System.out.println("I am in class B3 Constructor");
	}
}
public class SuperKeywordExample4 {
	public static void main(String[] args) {
		B3 ob = new B3();
	}
}
//Output: I am in class A3 Constructor  I am in class B3 Constructor
//"this" keyword is used for variables,methods whereas "this()"is used for constructors.
//"super" keyword is used for variables,methods whereas "super()"is used for constructors.
