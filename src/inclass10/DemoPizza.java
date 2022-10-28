package inclass10;

public class DemoPizza {
	public static void main(String args[])
	{
		Pizza p1=new Pizza("sausage and onion",12.99);
		Pizza p2=new Pizza("sausage and onion",14.99);
		DeliveryPizza p3=new DeliveryPizza("sausage and onion",14.99,"Somewhere");
		DeliveryPizza p4=new DeliveryPizza("sausage",12.99,"Somewhere");
		p1.display();
		p2.display();
		p3.display();
		p4.display();
	}
}
