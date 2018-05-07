//package lab8;

/*
 * 19.9-(Sort ArrayList) Write the following method that sorts an ArrayList:
 * public static <E extends Comparable<E>>void sort(ArrayList<E> list).
 */

import java.util.ArrayList;

public class Exercise19_9 {
	
	// sorts the elements of ArrayList using bubble sort
	public static <E extends Comparable<E>>void sort(ArrayList<E> list){
		
		for(int i = 0; i < list.size()-1;i++) {
			for (int j = i+1; j<list.size();j++) {
				
				// swap elements at index i and j if they are out of order
				if( list.get(i).compareTo(list.get(j)) > 0 ){
					E temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> lst = new ArrayList<>();
		lst.add(23);
		lst.add(0);
		lst.add(-3);
		lst.add(20);
		// before sorting
		System.out.println(lst);
		sort(lst);
		//after sorting
		System.out.println(lst);
	}

}
