package Modulo1;

import java.util.Random;

/**
 * TESTO ESERCIZIO:
 * Generare casualmente 10 numeri, memorizzarli in un array ed effettuare lo scambio tra il massimo ed il
 * minimo elemento
 *
 * @author Samuele Dallabrida
 * @date 23/08/2026
 */

public class Esercizio3 {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numeri = new int[10];

        int PosMin = 0;
        int PosMax = 0;

        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = random.nextInt(300);
        }

        for (int i = 0; i < numeri.length; i++) {
            System.out.println(numeri[i]);
        }

        for (int i = 0; i < numeri.length; i++) {
            if(numeri[i] > numeri[PosMax]) PosMax = i;
            if(numeri[i] < numeri[PosMin]) PosMin = i;
        }

        int temp = numeri[PosMax];
        numeri[PosMax] = numeri[PosMin];
        numeri[PosMin] = temp;

        System.out.println("Versione aggiornata");
        for (int i = 0; i < numeri.length; i++) {
            System.out.println(numeri[i]);
        }
    }
}
