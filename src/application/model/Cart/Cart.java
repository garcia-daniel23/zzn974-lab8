package application.model.Cart;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import application.model.Item.Item;

/**
 * 
 * @author Daniel
 *	This class populates the cart object with Item objects and puts them into the hashmap and resets everytime it recognized that a reciept has been made
 */
public class Cart 
{
	
	public static Item Apple = new Item("Apple", .0 );
	public static Item Banana = new Item("Banana", .0 );
	public static Item Carrot = new Item("Carrot", .0);
	public static Item Dogfood = new Item("Dogfood", .0);
	public static Item Eggplant = new Item("Eggplant", .0);
	public static Item Fennel = new Item("Fennel", .0);
	public static Item Grapes = new Item("Grapes",.0);
	public static Item Horseradish = new Item("Horseradish", .0);
	public static Item Ice = new Item("Ice", .0);
	public static Item Juice = new Item("Juice", .0);
	public static Item Kale = new Item("Kale", .0);
	public static Item Lemon = new Item("Lemon", .0);
	
	public static Item total2 = new Item(null,0);
	public static String name;
	
	public static Map<String,Item> itemMap = new HashMap<String,Item>();
	
	static int numberF = 0;
	
	public Cart(Map itemMap)
	{
		this.itemMap = itemMap;
	}
	
	public static Item printReceipt() throws FileNotFoundException, UnsupportedEncodingException
	{
		int amount = 0;
		Item total = new Item("Total",0.0);
		numberF++;
		total.setPrice(Apple.getPrice()+Banana.getPrice()+Carrot.getPrice()+Dogfood.getPrice()+Eggplant.getPrice()+Fennel.getPrice()+Grapes.getPrice()+Horseradish.getPrice()+Ice.getPrice()+Juice.getPrice()+Kale.getPrice()+Lemon.getPrice());
		PrintWriter writer = new PrintWriter("reciept" + numberF + ".txt", "UTF-8");
		name = "Reciept" + numberF + ".txt";
		for(String name : itemMap.keySet())
		{
			String key = name.toString();
			String value = itemMap.get(name).toString();
			writer.println(value.replaceFirst("\\s",",").replaceFirst("\\s","").replaceFirst("\\s","")
					.replaceFirst("\\s","").replaceFirst("\\s","").replaceFirst("\\s","").replaceFirst
					("\\s","").replaceFirst("\\s","").replaceFirst("\\s",",").replaceAll("\\s", ""));
					
		}
		amount = Apple.getAmount()+Banana.getAmount()+Carrot.getAmount()+Dogfood.getAmount()+Eggplant.getAmount()+Fennel.getAmount()+Grapes.getAmount()+Horseradish.getAmount()+Ice.getAmount()+Juice.getAmount()+Kale.getAmount()+Lemon.getAmount();
		writer.println("TOTAL," + amount + "," + total.getPrice());
		writer.close();
		
		
		return total;
	}
	public static void reset()
	{
		Apple.setPrice(0.0);
		Banana.setPrice(0.0);
		Carrot.setPrice(0.0);
		Dogfood.setPrice(0.0);
		Eggplant.setPrice(0.0);
		Fennel.setPrice(0.0);
		Grapes.setPrice(0.0);
		Horseradish.setPrice(0.0);
		Ice.setPrice(0.0);
		Juice.setPrice(0.0);
		Kale.setPrice(0.0);
		Lemon.setPrice(0.0);
		itemMap.clear();
		
	}
	public static void add()
	{
		total2.setPrice(Apple.getPrice()+Banana.getPrice()+Carrot.getPrice()+Dogfood.getPrice()+Eggplant.getPrice()+Fennel.getPrice()+Grapes.getPrice()+Horseradish.getPrice()+Ice.getPrice()+Juice.getPrice()+Kale.getPrice()+Lemon.getPrice());
	}
	public String toString()
	{
		return "" + itemMap;
	}
	
	public static void A()
	{
		
		Apple.setPrice(Apple.getPrice() + .89);
		if(Apple.getPrice() <=.89)
			Apple.setFirstPrice(Apple.getPrice());
		itemMap.put("Apple",  Apple);
	
	}
	
	public static void B()
	{
		Banana.setPrice(Banana.getPrice() + .27);
		if(Banana.getPrice() <=.27)
			Banana.setFirstPrice(Banana.getPrice());
		itemMap.put("Banana",Banana );
	}

	public static void C()
	{
		Carrot.setPrice(Carrot.getPrice() + .89);
		if(Carrot.getPrice() <=.89)
			Carrot.setFirstPrice(Carrot.getPrice());
		itemMap.put("Carrot",Carrot );
	}

	public static void D()
	{
		Dogfood.setPrice(Dogfood.getPrice() + 7.29);
		if(Dogfood.getPrice() <=7.29)
			Dogfood.setFirstPrice(Dogfood.getPrice());
		itemMap.put("Dogfood",Dogfood );
	}

	public static void E()
	{
		Eggplant.setPrice(Eggplant.getPrice() + 2.69);
		if(Eggplant.getPrice() <= 2.69)
			Eggplant.setFirstPrice(Eggplant.getPrice());
		itemMap.put("Eggplant",Eggplant);
	}

	public static void F()
	{
		Fennel.setPrice(Fennel.getPrice() + 1.49);
		if(Fennel.getPrice() <= 1.49)
			Fennel.setFirstPrice(Fennel.getPrice());
		itemMap.put("Fennel",Fennel );
	}

	public static void G()
	{
		Grapes.setPrice(Grapes.getPrice() + 3.99);
		if(Grapes.getPrice() <= 3.99)
			Grapes.setFirstPrice(Grapes.getPrice());
		itemMap.put("Grapes",Grapes );
	}

	public static void H()
	{
		Horseradish.setPrice(Horseradish.getPrice() + .59);
		if(Horseradish.getPrice() <= .59)
			Horseradish.setFirstPrice(Horseradish.getPrice());
		itemMap.put("Horseradish",Horseradish );
	}

	public static void I()
	{
		Ice.setPrice(Ice.getPrice() + .50);
		if(Ice.getPrice() <= .50)
			Ice.setFirstPrice(Ice.getPrice());
		itemMap.put("Ice",Ice);
	}

	public static void J()
	{
		Juice.setPrice(Juice.getPrice() + 2.39);
		if(Juice.getPrice() <= 2.39)
			Juice.setFirstPrice(Juice.getPrice());
		itemMap.put("Juice",Juice );
	}

	public static void K()
	{
		Kale.setPrice(Kale.getPrice() + 1.23);
		if(Kale.getPrice() <=1.23)
			Kale.setFirstPrice(Kale.getPrice());
		itemMap.put("Kale",Kale );
	}

	public static void L()
	{
		Lemon.setPrice(Lemon.getPrice() + .16);
		if(Lemon.getPrice() <=.16)
			Lemon.setFirstPrice(Lemon.getPrice());
		itemMap.put("Lemon",Lemon );
	}
	
	
}



