package genericsDemo;

import java.util.Map;

public class Market {
	
	private Map<? extends Produce, ? extends Number> producePrices;
	
	public Market(Map<? extends Produce, ? extends Number > producePrices) {
		this.producePrices = producePrices;
	}

}
