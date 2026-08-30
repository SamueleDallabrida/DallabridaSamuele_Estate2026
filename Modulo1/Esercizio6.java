package Modulo1;

import java.util.Scanner;

/**
 * TESTO ESERCIZIO:
 * Leggere N numeri interi, con N fornito in input dall’utente 
 * (compreso tra 5 e 10; se il valore non è valido, il programma deve continuare a chiederlo). 
 * Successivamente, memorizzare i valori in un array e infine ribaltare l'array.
 *
 * @author @SamueleDallabrida
 * @date 30/08/2026
 */

public class Esercizio6 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int num;

        do {
            System.out.print("Inserisci N (tra 5 e 10): ");
            num = tastiera.nextInt();
            
        } while (num < 5 || num > 10);

        int[] vett = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Inserisci il numero " + (i + 1) + ": ");
            vett[i] = tastiera.nextInt();
        }

        for (int i = 0; i < num / 2; i++) {
            int temp = vett[i];
            vett[i] = vett[num - 1 - i];
            vett[num - 1 - i] = temp;
        }

        System.out.println("\nArray ribaltato:");
        for (int i = 0; i < num; i++) {
            System.out.print(vett[i] + " ");
        }
    }
}
