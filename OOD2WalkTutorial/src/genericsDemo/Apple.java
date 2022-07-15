package genericsDemo;

public class Apple implements Produce {
	private String species;
	
	public Apple(String species) {
		this.species = species;
	}

	

	@Override
	public String getSpecies() {
		return species;
	}

}
