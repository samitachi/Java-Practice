package Set1OOPsGUIAWTSwing;

class aa{
	void m1() {
		System.out.println("I am in method m1");
	}
}
class bb extends aa{
	void m2() {
		super.m1();
		System.out.println("I am in method m2");
	}
}
public class SuperKeywordExample2 {
	public static void main(String[] args) {
		bb ob = new bb();
		ob.m2();
	}

}
