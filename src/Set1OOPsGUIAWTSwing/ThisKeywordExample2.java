package Set1OOPsGUIAWTSwing;

public class ThisKeywordExample2 {
	/*
	 * int no = 10; void m1(int no) { System.out.println(no); //this will output 20
	 * System.out.println(this.no);//this will output 10 //thus, this keyword is
	 * used to reference the instance variable } public static void main(String[]
	 * args) { ThisKeywordExample2 ob=new ThisKeywordExample2(); ob.m1(20); }
	 */

//this keyword is mostly used for constructors
	int rollNo;
	String name;
ThisKeywordExample2(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
void showDetails() {
		System.out.println("Roll No.: "+rollNo);
		System.out.println("Name: "+name);

	}
public static void main(String[] args) {
		ThisKeywordExample2 ob = new ThisKeywordExample2(20, "Aayush");
		ob.showDetails();
	}
}