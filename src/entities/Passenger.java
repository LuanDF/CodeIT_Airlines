package entities;

public class Passenger extends People {
	
	public Passenger() {
		
	}
	
	public Passenger(String name) {
		this.name = name;
 }
	
	public String toString() {
		return name;
	}
}