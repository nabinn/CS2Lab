/**********************************************************
*                      Faculty                            *
*---------------------------------------------------------*
* -officeHours: int                                       *
* -rank: int                                              *
*---------------------------------------------------------*
* +Faculty(name: String, address: String, phone: String,  *
*  email: String, office: int, salary: double,            *
*  officeHours: int, rank: int)     		          *
* +getOfficeHours(): int                                  *
* +setOfficeHours(officeHours: int): void                 *
* +getRank(): int                                         *
* +setRank(rank: int): void                               *
* +toString(): String                                     *
**********************************************************/

//package lab2;

public class Faculty extends Employee {
	private int officeHours;
	private int rank;
	
	public Faculty(String name, 
			String address, 
			String phone, 
			String email, 
			String office, 
			double salary,
			MyDate dateHired,
			int officeHours,
			int rank) {
		
		super(name, address, phone, email, office, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	
	
	public int getOfficeHours() {
		return officeHours;
	}



	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}



	public int getRank() {
		return rank;
	}



	public void setRank(int rank) {
		this.rank = rank;
	}



	@Override
	public String toString() {
		return "Class : "+this.getClass().getSimpleName()+" "+"Name : "+getName();
	}
	
}
