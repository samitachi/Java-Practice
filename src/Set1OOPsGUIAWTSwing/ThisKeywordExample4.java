package Set1OOPsGUIAWTSwing;

public class ThisKeywordExample4 {
	
	ThisKeywordExample4(int a, int b){
		System.out.println("3");
	}  
	
	ThisKeywordExample4(){
		this(10,20);
		System.out.println("1");
		
	}
	
	ThisKeywordExample4(int no){
		this();//It asks the compiler to execute the above consructor
		System.out.println("2");
		}
	public static void main(String[] args) {
		
		ThisKeywordExample4 ob1 = new ThisKeywordExample4(10);
		}
}
//This is Constructor Chaining
//Output: 3 1 2 
