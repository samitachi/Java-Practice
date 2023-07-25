package Set1OOPsGUIAWTSwing;
//this keyword can be used for passing argument call for consructor 
class Test{
	void m1() {
		xyz ob =new xyz(this); 
	}
}
 class xyz{
	 xyz(Test t){
		 System.out.println(t);
	 }
 }

public class ThisKeywordExample6 {
	public static void main(String[] args) {
		Test ob = new Test();
		ob.m1();
	}

}
