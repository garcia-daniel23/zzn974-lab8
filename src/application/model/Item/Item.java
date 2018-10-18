package application.model.Item;
/**
 * 
 * @author Daniel
 *	This class constructs the Item object and forms the output on the list view
 */
public class Item 
{
	private String name;
	private double price;
	private double firstPrice = price;
	public int amount;
	public Item(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getPrice()
	{
		return price;
	}

	public void setFirstPrice(double firstPrice) 
	{
		this.firstPrice = firstPrice;
	}
	public double getFirstPrice()
	{
		return firstPrice;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}
	public int getAmount()
	{
		return amount;
	}
	public String toString()
	{
		double i = firstPrice;
		double b = getPrice()/i;
		amount = (int)b;
		
		return "" + getName() + "\t\t\t\t\t\t\t" + amount + "\t\t\t\t\t\t\t" + getPrice();
	}
	
}
