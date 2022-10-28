package inclass10;

public class DeliveryPizza extends Pizza {
	private String address;
	private double deliveryFee;
	private final int LOWFEE= 3;
	private final int HIGHFEE= 5;
	private final int CUTOFFPRICE= 15;
	
	DeliveryPizza(String des,double pr, String address)
	{
		super(des,pr);
		this.address=address;
		if(pr> CUTOFFPRICE)
			deliveryFee=LOWFEE;
		else
			deliveryFee= HIGHFEE;
	}
	public void display()
	{
		super.display();
		System.out.println("  Delivery to: "+address+". Fee is "+ deliveryFee);
	}
}
