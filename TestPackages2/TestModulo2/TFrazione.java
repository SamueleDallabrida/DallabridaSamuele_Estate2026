package TestPackages2.TestModulo2;

import Modulo2.Frazione;

/**
 * TESTO ESERCIZIO:
 * Test della classe Frazione
 *
 * @author @SamueleDallabrida
 * @date 31/08/2026
 *
 */

public class TFrazione {
    public static void main(String[] args) throws Exception {
        try {
            // 1. Test dei tre costruttori
            Frazione f1 = new Frazione(3, 4);  
            Frazione f2 = new Frazione(2, 6);  
            Frazione f3 = new Frazione(5);     
            Frazione f4 = new Frazione();      

            System.out.println("Frazione 1: " + f1.toString());
            System.out.println("Frazione 2: " + f2.toString());
            System.out.println("Frazione 3: " + f3.toString());
            System.out.println("Frazione 4: " + f4.toString());
            System.out.println("-----------------------------------");

            //Test delle operazioni aritmetiche
            Frazione somma = f1.somma(f2);
            System.out.println(f1 + " + " + f2 + " = " + somma);

            Frazione differenza = f1.sottrai(f2);
            System.out.println(f1 + " - " + f2 + " = " + differenza);

            Frazione prodotto = f1.moltiplica(f2);
            System.out.println(f1 + " * " + f2 + " = " + prodotto);

            Frazione quoziente = f1.dividi(f2);
            System.out.println("(" + f1 + ") / (" + f2 + ") = " + quoziente);

            System.out.println("-----------------------------------");

            //Test eccezione (denominatore uguale a 0)
            System.out.println("Crearo una frazione errata (5/0)...");
            Frazione errata = new Frazione(5, 0);

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
