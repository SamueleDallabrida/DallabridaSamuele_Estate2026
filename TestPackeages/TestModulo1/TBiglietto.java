package TestPackeages.TestModulo1;

import Modulo1.Biglietto;
import java.util.Random;

/**
 * TESTO ESERCIZIO:
 * Generare casualmente n biglietti del bus e dare il messaggio "Biglietto buona giornata" a quelli che soddisfano le condizioni
 *
 * @author @SamueleDallabrida
 * @date 30/08/2026
 * Metodi utilizzati
 * @Biglietto: Costruttore con numero a 6 cifre o meno
 * @eBuonaGiornata: metodo per verificare se il biglietto è un biglietto "Buona giornata"
 * @stampa: Stampa il numero del biglietto
 */

public class TBiglietto {
    public static void main(String[] args) {
        Random random = new Random();

        int numeroBiglietti;
        numeroBiglietti = random.nextInt(15);
        
        for (int i = 0; i < numeroBiglietti; i++) {
            // 1. Generiamo un numero casuale a 6 cifre
            int n = random.nextInt(1000000);

            // 2. Creiamo il biglietto con quel numero
            Biglietto b = new Biglietto(n);

            // 3. Stampiamo il numero del biglietto
            b.stampa();

            // 4. Se è un biglietto fortunato, stampiamo il messaggio speciale!
            if (b.eBuonaGiornata()) {
                System.out.println("Biglietto Buona GIORNATA !");
            }
        }
    }
}
