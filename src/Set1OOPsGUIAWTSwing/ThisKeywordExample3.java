package Set1OOPsGUIAWTSwing;

public class ThisKeywordExample3 {
	void m1() {
		System.out.println("I am in method m1");
		m2(); //Here "m2();" is read as "this.m2();" by the compiler
		//Here we don't need to call this method using reference variable ob
		//as we called m1
	}
	void m2() {
		System.out.println("I am in method m2");
	}
	
	public static void main(String []args) {
		ThisKeywordExample3 ob = new ThisKeywordExample3();
		ob.m1();
	}

}
