/*******************************************************************
*                        Employee                                  *
*------------------------------------------------------------------*
* -office: String                                                  *
* -salary: double                                                  *
* -dateHired: MyDate                                               *
*------------------------------------------------------------------*
* +Employee(name: String, address: String, phone: String,          *
* 					email: String, office: String,                 *  
* 					salary: double, dateHired: MyDate)  		   *
* +getOffice(): String                                             *
* +getSalary(): double                                             *
* +getDateHired(): MyDate                                          *
* +setOffice(office: String): void                                 *
* +setSalary(salary: double): void                                 *
* +setDateHired(dateHired: MyDate): void                           *
* +toString():String                                               *
*******************************************************************/


package lab2;

public class Employee extends Person {
	private String office;
	private double salary;
	private MyDate dateHired;
	
	
	public Employee(String name, String address, String phone, 
		String email, String office, double salary, MyDate dateHired) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	public String getOffice() {
		return office;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public MyDate getDateHired() {
		return dateHired;
	}
	
	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}
	
	@Override
	public String toString() {
		return "Class : "+this.getClass().getSimpleName()+" "+"Name : "+getName();
	}
	
}
