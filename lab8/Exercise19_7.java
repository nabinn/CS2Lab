//package lab8;

/*
 * 19.7-(Generic binary search) Implement the following method using binary search.
 * public static <E extends Comparable<E>>int binarySearch(E[] list, E key).
 */

public class Exercise19_7 {
	
	/*
	 * linear search: returns index of key if key is present 
	 * otherwise returns -1. 
	 * Note: the list is assumed to be sorted 
	 */
	public static <E extends Comparable<E>>int binarySearch(E[] list, E key){
		
		int low = 0;
		int high = list.length -1 ;
		
		while (low <= high) {
			
			int mid = (low+high)/2;
			
			if (list[mid].compareTo(key) == 0 ) 
				return mid;
			
			else if (list[mid].compareTo(key) < 0) 
				low = mid + 1;
			
			else high = mid - 1;
		}
		
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		Integer[] intArray = {-3,1,2,4,6,10};
		System.out.println(binarySearch(intArray, 5));
		System.out.println(binarySearch(intArray, 6));
			
		String[] strArray = {"aaa", "ddd", "qq", "tt", "yyyy"};
		System.out.println(binarySearch(strArray, new String("tt")));
		System.out.println(binarySearch(strArray, new String("asdf")));

		
		
	}

}
