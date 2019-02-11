package learnJava;

class Cars {
	String name;
	int cost;
	String type;

	Cars() {
		System.out.println("Parent class is initialized");
	}

	public void getCarDetails(String name, int cost, String type) {
		this.name = name;
		this.cost = cost;
		this.type = type;
	}

	public void showCarDetails() {
		System.out.println("Name of the car: " + name);
		System.out.println("Name of the car: " + cost);
		System.out.println("Name of the car: " + type);
	}
}

/*class Audi extends Cars{
	
	public static void main(String[] args) {
		Audi aud = new Audi();
		aud.getCarDetails("R8", 100000, "Racing");
		aud.showCarDetails();
	}

} */

public class Bmw extends Cars
{
	
	Bmw()
	{
		System.out.println("BMW class in initialized");
	}
	String model;
	int maxspeed;
	void getCarDetails(String model,int maxspeed)
	{
		this.model=model;
		this.maxspeed=maxspeed;
	}
	
public void showCarDetails()
{
	System.out.println("Model: "+model);
	System.out.println("MaximumSpeed: " +maxspeed);
}

	public static void main(String[] args)
	{
		
	Bmw bm = new Bmw();
	    bm.getCarDetails("BMW", 200000, "Economy");
		bm.getCarDetails("320d", 200);
		bm.showCarDetails();
	}	
}
