package it.java.abstract_animals;

public class RegnoAnimale {

    public static void main(String[] args) {
        Animale cane = new Cane();
        Animale passerotto = new Passerotto();
        Animale aquila = new Aquila();
        Animale delfino = new Delfino();

        System.out.println("Cane:");
        cane.dormi();
        cane.verso();
        cane.mangia();

        System.out.println("\nPasserotto:");
        passerotto.dormi();
        passerotto.verso();
        passerotto.mangia();

        System.out.println("\nAquila:");
        aquila.dormi();
        aquila.verso();
        aquila.mangia();

        System.out.println("\nDelfino:");
        delfino.dormi();
        delfino.verso();
        delfino.mangia();
    }
}

