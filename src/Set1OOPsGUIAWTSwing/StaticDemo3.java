package Set1OOPsGUIAWTSwing;

public class StaticDemo3 {
	   /*
       int no= 10;
       public static void main(String[] args) {
    	   System.out.println(no);
       }This will provide error as we cannot call instance variables from static methods
       */
	//There are 2 ways for it:
	//first:
	/*
	static int no= 10;
    public static void main(String[] args) {
 	   System.out.println(no);
    }*/
    //second
    int no= 10;
    public static void main(String[] args) {
    	StaticDemo3 ob = new StaticDemo3();
 	   System.out.println(ob.no);
    }
}
