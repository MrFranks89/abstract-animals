package it.java.abstract_animals;

/**Esercizio 1 : classi astratte*
Dobbiamo realizzare un programma che rappresenti il regno animale.
Creiamo quindi una classe astratta Animale e delle classi che la estendono : Cane, Passerotto, Aquila, Delfino
Vogliamo che gli animali abbiano i seguenti metodi
- void dormi() (mostra a video “Zzz”)
- void verso() (mostra a video il verso fatto dall'animale specifico)
- void mangia() (mostra a video quello che mangia : erba, carne, ...?)

Quali di questi metodi devono essere implementati nella classe astratta e quali devono essere lasciati
astratti e implementati dalle classi che la estendono?
Una volta create le classi, nel programma istanziare alcuni animali e utilizzare i metodi implementati.*/

public abstract class Animale {
	
	
	
	public void dormi() {
		System.out.println("Zzz");
	}
	
	public abstract void verso();
	 
	public abstract void mangia();
	
}
