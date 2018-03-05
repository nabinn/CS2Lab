/*****************************************
*                Person                  *
*----------------------------------------*
* -name: String                          *
* -address: String                       *
* -phone: String                         *
* -email: String                         *
* ---------------------------------------*
* +Person(name: String, address: String, *
*  phone: String, email: String)         *
* +getName(): String                     *
* +getAddress(): String                  *
* +getPhone(): String                    *
* +getEmail(): String                    *
* +setName(name: String ): void          *
* +setAddress(address: String): void     *
* +setPhone(phone: String): void         *
* +setEmail(email: String): void         *
* +toString(): String                    *
*****************************************/
//package lab2;

public class Person {
	private String name;
	private String address;
	private String phone;
	private String email;
	
	public Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Class : "+this.getClass().getSimpleName()+" "+"Name : "+getName();
	}
	

}
