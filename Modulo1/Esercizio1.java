package Modulo1;

import java.util.Random;
import java.util.Scanner;

/**
 * TESTO ESERCIZIO:
 * Generare casualmente n (con n fornito in input dall'utente) numeri interi;
 * successivamente, visualizzarne il quadrato.
 *
 * @author @SamueleDallabrida
 * @date 23/08/2026
 */

public class Esercizio1 {
    
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Inserisci la quantita di numeri da generare (n): ");
        int n = tastiera.nextInt();

        int[] numeri = new int [n];

        for (int i = 0; i < n; i++) {
            numeri[i] = random.nextInt(100) + 1;
        }

        for (int j = 0; j < numeri.length; j++) {
                System.out.println("Il quadrato di " + numeri[j] + " è: " + (numeri[j] * numeri[j]));
            }
        tastiera.close();
    }
}
