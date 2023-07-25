package Set1OOPsGUIAWTSwing;
/*class Test extends A{
 * }Super keyword prvides reference of parent class(here class A) 
 * 
 */
class A{
	int no =10;
}
class B extends A{
	int no = 20;
	void m1(int no) {
		System.out.println(no);
		System.out.println(this.no);
		System.out.println(super.no);
	}
}

public class SuperKeywordExample {
	public static void main(String[] args) {
		B ob = new B();
		ob.m1(30);
	}

}
