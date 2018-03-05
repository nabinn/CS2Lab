/**********************************************************************
*                                Staff                                *
*---------------------------------------------------------------------*
* -title: String                                                      *
* --------------------------------------------------------------------*
* +Staff(name: String, address: String, phone: String, email: String, *
*  office: int, salary: double, dateHired: MyDate, title: String)     *
* +getTitle(): String                                                 *
* +setTitle(title: String): void                                      *
* +toString(): String                                                 *
**********************************************************************/

//package lab2;

public class Staff extends Employee {
	private String title;
	
	public Staff(String name, 
			String address, 
			String phone, 
			String email, 
			String office, 
			double salary,
			MyDate dateHired,
			String title) {
		super(name, address, phone, email, office, salary, dateHired);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

	@Override
	public String toString() {
		return "Class : "+this.getClass().getSimpleName()+" "+"Name : "+getName();
	}
	
	
}
