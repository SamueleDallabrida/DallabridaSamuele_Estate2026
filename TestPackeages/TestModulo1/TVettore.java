package TestPackeages.TestModulo1;

import Modulo1.AlgoritmoOrdinamento;
import Modulo1.Vettore;

/**
 * TESTO ESERCIZIO:
 * I biglietti sono numerati a 6 cifre, se la somma delle prime 3 e ultime 3 è uguale allora, il russo avra una giornata fortunata;
 * Creare una classe che ti permetta di creare un biglietto, controllare se è fortunato e stamparlo.
 *
 * @author @SamueleDallabrida
 * @date 31/08/2026
 */

public class TVettore {
    public static void main(String[] args) throws Exception{
        //Creazione del vettore
        Vettore v = new Vettore(5);
        System.out.println("--- 1. TEST ADD ---");
        v.add(15);
        v.add(3);
        v.add(42);
        v.add(8);
        v.add(23);
        System.out.println(v);

        //Test Get e Replace
        System.out.println("\n--- 2. TEST GET & REPLACE ---");
        System.out.println("Elemento all'indice 2: " + v.get(2));
        v.replace(99, 2); // Sostituiamo il 42 con il 99
        System.out.println("Dopo replace: " + v);

        //Test Remove
        System.out.println("\n--- 3. TEST REMOVE ---");
        v.remove(1); // Rimuoviamo l'elemento all'indice 1 (il 3)
        System.out.println("Dopo remove dell'indice 1: " + v);

        //Test Sort (Bubble, Insertion o Selection)
        System.out.println("\n--- 4. TEST SORT ---");
        v.sort(AlgoritmoOrdinamento.BUBBLE);
        System.out.println("Dopo l'ordinamento: " + v);

        //Test toString
        System.out.println("\n--- 5. TO-STRING ---");
        System.out.println(v.toString());

        //Test Clear
        System.out.println("\n--- 5. TEST CLEAR ---");
        v.clear();
        System.out.println("Dopo clear: " + v);
    }
}
