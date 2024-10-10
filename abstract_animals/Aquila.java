package it.java.abstract_animals;

import it.java.animali.interfaccia.Volante;

public class Aquila extends Animale implements Volante{

	@Override
	public void verso() {
		System.out.println("Fischio acuto");
		
	}

	@Override
	public void mangia() {
		System.out.println("L'Aquila mangia carne");
		
	}
	
	@Override
	public void vola() {
        System.out.println("Sto volando!!!");
    }
	
}
