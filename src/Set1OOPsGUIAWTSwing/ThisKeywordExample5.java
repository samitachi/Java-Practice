package Set1OOPsGUIAWTSwing;
class Test{
	void m1(){
		Test ob= new Test();
		m2(ob); //m2 needs an object of test class
		m2(this);//We can write above statement like this also.
		//"this" is getting used as reference variable of present class 
	}
	void m2(Test t) {
		System.out.println(t);
	}
}
public class ThisKeywordExample5 {
public static void main(String [] ags) {
	Test t = new Test();
	t.m1();
}
}
