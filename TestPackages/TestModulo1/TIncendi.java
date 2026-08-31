package TestPackages.TestModulo1;

import Modulo1.Incendi;

public class TIncendi {
    public static void main(String[] args) {
        try {
            Incendi inc = new Incendi(12);

            inc.inserisciLatitudine(84);
            inc.inserisciLatitudine(45);
            inc.inserisciLatitudine(5);
            inc.inserisciLatitudine(45);
            inc.inserisciLatitudine(6);
            inc.inserisciLatitudine(88);
            inc.inserisciLatitudine(45);
            inc.inserisciLatitudine(88);
            inc.inserisciLatitudine(23);
            inc.inserisciLatitudine(12);
            inc.inserisciLatitudine(5);
            inc.inserisciLatitudine(88);

            System.out.println("Numero latitudini inserite: " + inc.getNumeroLatitudini());
            System.out.println("Vettore iniziale: " + inc.toString());

            // Test Bubble Sort
            inc.bubbleSort();
            System.out.println("Vettore ordinato:  " + inc.toString());

            // Test Max Distanza
            System.out.println("Max distanza tra incendi: " + inc.maxDistanza() + " km");

            // Test contaLatitudini
            double[] conteggi = inc.contaLatitudini();
            System.out.print("Vettore conteggi: [ ");
            for (int i = 0; i < conteggi.length; i++) {
                System.out.print((int)conteggi[i] + " ");
            }
            System.out.println("]");

            System.out.println("-----------------------------------");
            System.out.println("Inserimento errato (latitudine > 90):");
            inc.inserisciLatitudine(105.5);

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
