package it.java.abstract_animals;

public class Passerotto extends Animale{

	@Override
	public void verso() {
		System.out.println("Cip Cip");
	}

	@Override
	public void mangia() {
		System.out.println("Il passerotto mangia semi");
	}
}
