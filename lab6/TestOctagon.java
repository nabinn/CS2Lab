// package lab6
public class TestOctagon {

	public static void main(String[] args) {
		
		// creating an octagon of side 5
		Octagon octagon1 = new Octagon(5);
		
		System.out.println("Area: "+ octagon1.getArea());
		System.out.println("Perimeter: "+octagon1.getPerimeter());
		
		// creating new object by cloning octagon1
		Octagon octagon2 = octagon1.clone();
		
		// comparing two objects using compareTo method
		if (octagon1.compareTo(octagon2) == 0) { 
			System.out.println("octagon1 equals octagon2");
		}else if (octagon1.compareTo(octagon2) > 0) {
			System.out.println("octagon1 > octagon2");
		}else {
			System.out.println("octagon1 < octagon 2");
		}
		
	}

}
