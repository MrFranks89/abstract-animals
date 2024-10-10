package it.java.abstract_animals;

import it.java.animali.interfaccia.Camminante;
import it.java.animali.interfaccia.Natante;
import it.java.animali.interfaccia.Volante;

public class RegnoAnimale {
	
    public static void faiVolare(Volante animale) {
        animale.vola();
    }

    public static void faiNuotare(Natante animale) {
        animale.nuota();
    }
    
    public static void faiCamminare(Camminante animale) {
    	animale.cammina();
    }

    public static void main(String[] args) {
        Animale cane = new Cane();
        Animale passerotto = new Passerotto();
        Animale aquila = new Aquila();
        Animale delfino = new Delfino();

        System.out.println("Cane:");
        cane.dormi();
        cane.verso();
        cane.mangia();
        faiCamminare((Camminante) cane);

        System.out.println("\nPasserotto:");
        passerotto.dormi();
        passerotto.verso();
        passerotto.mangia();
        faiVolare((Volante) passerotto);

        System.out.println("\nAquila:");
        aquila.dormi();
        aquila.verso();
        aquila.mangia();
        faiVolare((Volante) aquila);

        System.out.println("\nDelfino:");
        delfino.dormi();
        delfino.verso();
        delfino.mangia();
        faiNuotare((Natante) delfino);
    }
}

