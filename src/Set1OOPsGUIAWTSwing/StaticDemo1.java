package Set1OOPsGUIAWTSwing;
class Employee{
	String EmpName;
	String EmpID;
	static String CompanyName= "Kiya.ai";
	/*using static keyword we don't need to write common company name for each employee
	 * This common memory gets shared by each employee object,other wise we had to alot 
	 * seperate memory for every object. This way we achieved memory management and shareability. 
     */

Employee(String EmpName,String EmpID){
	this.EmpName = EmpName;
	this.EmpID=EmpID;
}

void showDetails() {
	System.out.println("-----Employee Details");
	System.out.println("Employee ID: "+EmpID);
	System.out.println("Employee ID: "+EmpName);
	System.out.println("Employee ID: "+CompanyName);
}
}
public class StaticDemo1 {
	public static void main(String[] args) {
	Employee e1 = new Employee("Aayush","12345");
	Employee e2 = new Employee("Shashwat","12315");
	Employee e3 = new Employee("Arun","12325");
	e1.showDetails();
	e2.showDetails();
	e3.showDetails();
	}	
}
