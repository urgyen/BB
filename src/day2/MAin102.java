package day2;

public class MAin102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// inputs -- > arguments
		
//		sayHellloToBB("A", 5);
//		sayHellloToBB("B", 6);
//		sayHellloToBB("C" , 7);

		//System.out.println(sayHellloToBB());
	/*	
		String dataFromMethod = sayHellloToBB("Apple");
		System.out.println(dataFromMethod);
		
	}
	//on the basis of return type and arguments?
	//1. Function with argument and no return type
	
	public static void sayHiToMyFriend(String name) {
		System.out.println("Hello " + name);
	}
	
	//2. Function with argument and return type?
	
	public static String sayHellloToBB(String name) {
	
		return "SAying Hello " +name ;
	}
	
	//3. Function with no argument and no return type
	
	
	public static void  sayHi() {
		System.out.println("Hi");
	}
	
	//4. Function with no argument and return type
	
	public static double valueOfPI() {
		return 3.1416;
	}
	
	*/
		
		//Array
		
		int ages[] = new int[5];
		//Array is static, 
		//array maintains indexing;
		
		ages[0] = 25;
		ages[1] = 26;
		ages[2] = 27;
		ages[3] = 25;
		ages[4] = 26;
	
		System.out.println(ages.length);
		
		System.out.println("--------");
		
//		for(int index= 0; index<ages.length ; index++ ) {
//			System.out.println(ages[index]);
//
//		}
		
		//enhanced For loop
		
		for(int age  : ages ) {
			System.out.println(age);
		}
					
	}

}
