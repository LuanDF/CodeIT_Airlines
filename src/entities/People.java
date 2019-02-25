package entities;

public abstract class People {
	
	protected String name;

	public People() {
	}
	
	public People(String name) {
		this.name = name;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Object obj) {	
		People dup = (People) obj;
       return this.getName().equals(dup.getName());
	}
	
}
