package it.java.abstract_animals;

import it.java.animali.interfaccia.Volante;

public class Passerotto extends Animale implements Volante{

	@Override
	public void verso() {
		System.out.println("Cip Cip");
	}

	@Override
	public void mangia() {
		System.out.println("Il passerotto mangia semi");
	}
	
	@Override
	public void vola() {
        System.out.println("Sto volando!!!");
    }
}
