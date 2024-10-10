package it.java.abstract_animals;

import it.java.animali.interfaccia.Natante;

public class Delfino extends Animale implements Natante{

	@Override
	public void verso() {
		System.out.println("Click click");
		
	}

	@Override
	public void mangia() {
		System.out.println("Il Delfino mangia plancton");
		
	}

	@Override
	public void nuota() {
		System.out.println("Sto Nuotando!!");
	}

}
