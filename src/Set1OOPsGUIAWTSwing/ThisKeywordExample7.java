package Set1OOPsGUIAWTSwing;
//this keyword can be used to return current class instance
class Test{
	Test m1() {
		return this;
	}
}
public class ThisKeywordExample7 {
public static void main(String[] args) {
	Test t = new Test();
	Test ob =t.m1();
	System.out.println(ob);
	}
}

