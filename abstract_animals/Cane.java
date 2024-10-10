package it.java.abstract_animals;

import it.java.animali.interfaccia.Camminante;

public class Cane extends Animale implements Camminante{

	@Override
	public void verso() {
		// TODO Auto-generated method stub
		System.out.println("Bau Bau");
	}

	@Override
	public void mangia() {
		System.out.println("Il cane mangia tutto");
	}

	@Override
	public void cammina() {
		System.out.println("Sto camminando!!");
	}
}
