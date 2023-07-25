package Set1OOPsGUIAWTSwing;

public class ThisKeywordExample {
	void m1() {
		System.out.println("I am in m1 method: " +this);
		}
	
	public static void main(String[] args) {
		ThisKeywordExample ob = new ThisKeywordExample();
		System.out.println("I am in main method: " +ob);
		ob.m1();
	}
}
/*Just as here ob is he reference variable, similarly this is of reference type.
 * Both(this & ob) of them are pointing to the same object.
 * "this" keyword is not used in the main method.
 */
