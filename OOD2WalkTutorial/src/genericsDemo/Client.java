package genericsDemo;

import java.util.HashMap;

public class Client {
	
	

	public static void main(String[] args) {
		
	

		
		Farmer<Produce> numberFarmer = new Farmer<Produce>();
		
		numberFarmer.addProduce(new Banana("Banana"));
		numberFarmer.addProduce(new Banana("Banana2"));
		numberFarmer.addProduce(new Apple("Apple"));
		numberFarmer.addProduce(new Orange("Orange"));

		Market market = new Market(new HashMap<Produce, Integer>());
		Market appleMarket = new Market(new HashMap<Apple, Integer>());
	
		System.out.println("The farmer is farming: " +      numberFarmer.getProduce(0));
	}


}
