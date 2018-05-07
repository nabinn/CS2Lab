//package lab8;

/*
19.4-(Generic linear search) Implement the following generic method for linear search.

public static <E extends Comparable<E>>int linearSearch(E[] list, E key)

*/

public class Exercise19_4 {
	
	
	/*
	 *  linear search: returns index of key if key 
	 * is present in the list otherwise returns -1
	 */
	public static <E extends Comparable<E>>int linearSearch(E[] list, E key){
		
		for (int i=0; i< list.length; i++) {
			
			if(list[i].compareTo(key) == 0) return i;
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		Integer[] intArray = {1,2,8,3,4,6,2,10,-8};
		System.out.println(linearSearch(intArray, 5));
		System.out.println(linearSearch(intArray, 8));
			
		String[] strArray = {"sss", "www", "qq", "tt", "yyyy"};
		System.out.println(linearSearch(strArray, new String("tt")));
		System.out.println(linearSearch(strArray, new String("yyy")));

	}

}
