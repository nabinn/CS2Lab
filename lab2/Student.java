/*************************************************
*                   Student                      *
*------------------------------------------------*
* -STATUS: String                                *
* ---------------                                *
* +Student(name: String, address: String,        *
*  phone: String, email: String, status: String) *
* +getStatus(): String                           *
* +toString(): String                            *
*************************************************/

//package lab2;

public class Student extends Person {
	
	private final String STATUS;
	
	public Student(String name, String address,  
		String phone, String email, String status) {
		super(name, address, phone, email);
		this.STATUS = status;
	}

	public String getSTATUS() {
		return STATUS;
	}
	
	@Override
	public String toString() {
		return "Class : "+this.getClass().getSimpleName()+" "+"Name : "+getName();
	}
	
}
