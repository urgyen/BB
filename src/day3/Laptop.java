package day3;

public class Laptop {

	//state
	//What does a class have?
	//variables
	
	double displaySize;
	String brandName;
	int ram;
	
	//behaviour
	//What does a class do ?
	//Functions
	
	public void playGames(String game) {
		System.out.println("Playing " + game);
	}
	
	public void accessInternet() {
		System.out.println("Buzzing");
	}
	
	public void displayLaptopDetails() {
		System.out.println(displaySize + " : " + brandName + " : " + ram);
	}
	
}
