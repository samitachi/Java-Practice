package Set1OOPsGUIAWTSwing;

class Account{
     public Account(){
 //Java Bean class must contain public no-argument constructor
              }
//Encapsulation achieved by private variables and public getter and setter method
//Bean Class
//Bean class provides security

	private int salary;
	private String accNo;
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	
	public void setAccNo(String accNo) {
		this.accNo=accNo;
	}
	public String getAccNo() {
		return accNo;
	}
	
}
class BankFunctions{
	void deposite(Account acc,int dep) {
		int total=acc.getSalary()+dep;
		acc.setSalary(total);
	}
	void withdrawl(Account acc,int withdrawl) {
		int total=acc.getSalary()-withdrawl;
		acc.setSalary(total);
	}
}
public class EncapsulationExample1 {
	public static void main(String[] args) {
		Account account = new Account();
		account.setAccNo("12345");
		account.setSalary(10000);
		//WITHOUT REFERENCE OF ACCOUNT NO ONE ACCESS THE DATA INSIDE IT.
		/*Flexibility as it provides getter method to get values from variable 
		 * and setter method to set values.Similarly we can write different function for different
		 * purpose.
		 * Reusability: since same methods (get/set)are getting repeatedly. 
		 */
		
		BankFunctions bf = new BankFunctions();
		bf.deposite(account,5000);
		bf.withdrawl(account,2000);
		System.out.println("Account No.: "+account.getAccNo()+" Salary: "+account.getSalary());
	}
}
/*In abstracion we hide the implementation and in encapsulation we hide the data.
 * This was a simple java bean class, otherwise we need to write "class Account implements Serializable interface"
 * 
 * If suppose a tightly encapsulated class inherits from non-tightly encapsulated class then the class that inherits will
 * no longer be a tightly encapsulated class.
 */
