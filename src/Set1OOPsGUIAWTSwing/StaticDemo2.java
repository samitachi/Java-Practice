package Set1OOPsGUIAWTSwing;
class NoOfVisitors{
	 static int count=0;
	NoOfVisitors(){
		count=count+1; 
		/*Each time object is created i.e. a new visitor comes on page this constructor gets called
		 * which increases the count by 1. Now since count is static it is at class level. So every object 
		 * of that class will share same value of count and hence same value whether called from any object. 
		 *  
		 *  When we don't write the "static keyword" and we call "ob4.m1();" we will have output as 1, since now
		 *  int count=0; will be created for each object.So,on creating "ob4" contructor will increase the count 
		 *  from 0 to 1 for ob4. But if it was static then commonly the value of count would have increased.
		 */
	}
	
	void m1() {
		System.out.println("No. of Page Visitors: " +count);
	}
}

public class StaticDemo2 {
public static void main(String[] args) {
	NoOfVisitors ob1 =  new NoOfVisitors();
	NoOfVisitors ob2 =  new NoOfVisitors();
	NoOfVisitors ob3 =  new NoOfVisitors();
	NoOfVisitors ob4 =  new NoOfVisitors();
	NoOfVisitors ob5 =  new NoOfVisitors();
	
	ob4.m1();
}
}
