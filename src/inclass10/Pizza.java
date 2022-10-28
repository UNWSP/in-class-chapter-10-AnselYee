package inclass10;

public class Pizza {
	String Description;
	double Price;
	public Pizza(String des, double pr)
	{
		Description=des;
		Price=pr;
	}
	
	public void display(){
		System.out.print(Description+"pizza  Price is :$"+Price);
	}
}
