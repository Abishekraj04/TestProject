package learnJava;

public class Car implements LearnInterface
{
String name,type;
int cost;
	@Override
	public void setCarDetails(String name,String type,int cost) 
	{
		// TODO Auto-generated method stub
		this.name=name;
		this.type=type;
		this.cost=cost;
		
	}

	@Override
	public void displayCarDetails() 
	{
		// TODO Auto-generated method stub
		System.out.println("CarName" +name);
		System.out.println("CarType" +type);
		System.out.println("CarCost" +cost);
		}
 
	Class Benz 
}
