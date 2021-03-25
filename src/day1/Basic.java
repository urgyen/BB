package day1;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//vari + ables??
//		int age= 4;
//		age = 10;
//		
//		String name1 ="ABC";
//		
//		//Naming Conventions?
//		//1. We cant use reserved for variables;
//		//int double =
//		 
//		//we use varibale starting Small Letters;
//		//Camel CAsing -- > lowef Camel Casing;
//		String myFathersName ="ASDA";
//		
//		//Datatypes;
//		//int, String
//		//Primitive and non primitive;
//		int number= 1;
//		
//		String name= "Urgyen";
//		char alpha = 'a';
//		
		// double, float, boolean, bytes;

		// Ctrl Statements??
		// if

//		//if else
//		
//		int age =  8;
//		if(age>=18) {
//			System.out.println("Eligible to Vote");
//		}
//		else {
//			System.out.println("Not Eligible To Vote");
//		}

		// else if

		// age= 0- 9 Child
		// 9+ 19 Teen
		// 20+ ADult

		// Issue using Encapsulation
		int age = 81;

		if (age <= 9) {
			System.out.println("Child");
		} else if (age < 20) {
			System.out.println("Teen");
		} else {
			System.out.println("Adult");
		}

		// switch
//		if weekday =1 ==> Snday
//				weekDay =2, Monday;

		String weekDay = "2";

		switch (weekDay) {

		case "1":
			System.out.println("Sunday");
			break;

		case "2":
			System.out.println("Monday");
			break;

		case "3":
			System.out.println("Tuesday");
			break;

		default:
			System.out.println("No these kind of Wweekdays");

		}

		// Loops
		// For

		// EFficiency;

		long startTime = System.currentTimeMillis();

		for (int index = 0; index < 1000000; index++) {
			if (index % 2 != 0) {
				System.out.println(index);
			}
		}
		long endTime = System.currentTimeMillis();

		System.out.println("-----");
		long timeTaken = endTime - startTime;
		System.out.println(timeTaken);

		System.out.println("===========");

		long startTime1 = System.currentTimeMillis();

		for (int index1 = 0; index1 < 1000000; index1 = index1 + 2) {
			System.out.println(index1);
		}
		long endTime1 = System.currentTimeMillis();

		System.out.println("-----");
		long timeTaken1 = endTime1 - startTime1;
		
		
		System.out.println("If + " + timeTaken);
		
		System.out.println( "Index " + timeTaken1);

		// While

//		
//		while(repetations<10) {
//			System.out.println("Hello");
//			
//			repetations++;
//			
//		}
//		

		// Do while
//		int repetations = 0;
//		do {
//			System.out.println(repetations + " Helo Again");
//			repetations++;
//		} while (repetations < 10);

	}

}
