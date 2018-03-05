//package lab2;

public class TestProgram {

	public static void main(String[] args) {
		
		/* creating objects for Person, Student, Employee, Faculty and Staff
		 and invoking their toString() method.
		 
		 Note:
		 The toString() provides the string representation for an object.
		 So, when you print an object, its toString() method is called implicitly.
		*/
		
		
		Person person1 = new Person("Martin", "771 Virginia St.", "martin@gmail.com", "3652278815");
		System.out.println(person1); 
		
		
		Person student1 = new Student("Adam", "601 Adam St.","adam@gmail.com", "1234567890", "freshman");
		System.out.println(student1); 
		
	
		Person employee1 = new Employee("Brian", "601 Adam St.", "brian@gmail.com", 
						"1984567890", "office1", 9000, new MyDate(2018, 02, 25));
		System.out.println(employee1); 
		
		
		Person faculty1 = new Faculty("Chloe", "651 Adam St.", "chloe@gmail.com", 
				"1235667890", "office2", 19000, new MyDate(2017, 10, 25), 8, 10);
		System.out.println(faculty1); 
		
		
		Person staff1 = new Staff("David", "601 Adam St.", "david@gmail.com", 
				"1984544890", "office3", 7000, new MyDate(2017,11 ,23), "Accountant");
		System.out.println(staff1);
		
	}
}
