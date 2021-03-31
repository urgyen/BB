package day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Collection
		
		
		//Array?
		//Array List, HashSet, HashMap
		
		
		//Student s1= new Student();
		
//		ArrayList<String>  list = new ArrayList<>();
//		
//		//a[0] = "aSDASD";
//		
//		list.add("Hussein");
//		list.add("Subechha");
//		list.add("Ankit");
//		list.add("Deep");
//		list.add("Hussein");
//		list.add("Subechha");
//		list.add("Ankit");
//		list.add("Hussein");
//		list.add("Subechha");
//		list.add("Ankit");
//		
//		System.out.println(list);
//		//ArrayList follow insertion order;
//		//ArrayList maintains indexing???
//		
//	//System.out.println(list);
////		
////		// 1 == Huseein
////		// 2 == Subecha
////		
////		int index=1;
////		
////		for(String names : list) {
////			
////			System.out.println(index + " == "+ names);
////			 index++;
////		}
////		
//		
//		
//		HashSet<String> set = new HashSet<>();
//		
//		set.add("apple");
//		set.add("Cat");
//		set.add("Banana");
//		set.add("Elephnat");
//		set.add("Dog");
//		set.add("Cat");
//		
//		
//		System.out.println(set);
		//doesnt follow insertion order;  ??
		// Hash -- > hashing ??
		
		
		
	HashMap<Integer, String>  students = new HashMap<>();
	//to add data in HashMap;
	
	students.put(1, "Urgyen");
	
	students.put(2, "Ankit");
	
	students.put(3,  "Hussein");
	
	students.put(4, "Deep");
	
	students.put(5, "Deep");
	
	students.put(4, "Apple");
	
	//System.out.println(students.keySet());
//	System.out.println(students.values());
	
	
		//1= Urgyen;
	//System.out.println(students);
	
	//System.out.println(students.entrySet());
	
	for(Map.Entry m : students.entrySet()) {
		System.out.println(m);
		//System.out.println(m.getKey());
		//System.out.println(m.getValue());
		System.out.println("====");
	}
	
	
	}

}
