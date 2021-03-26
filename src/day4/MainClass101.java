package day4;

public class MainClass101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Single Inheritance;
		
		//Father to Son 
		Father f1= new Father();
		f1.eats();
		
		Son s1= new Son();
		s1.eats();
		s1.playsGames();
		
		GrandSon gs1= new GrandSon();
		gs1.playsGames();
		
		
	}

}
