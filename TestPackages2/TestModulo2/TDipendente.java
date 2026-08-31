package TestPackages2.TestModulo2;

import Modulo2.Dipendente;

/**
 * TESTO ESERCIZIO:
 * Test della classe Dipendente
 *
 * @author @SamueleDallabrida
 * @date 31/08/2026
 * 
 */

public class TDipendente {
    public static void main(String[] args) {
        try {
            //Creiamo un dipendente usando il costruttore completo
            Dipendente d1 = new Dipendente("Mario", "Rossi", 30, 1500.50);
            System.out.println("Dipendente 1 creato con successo!");
            System.out.println("Nome: " + d1.getNome());
            System.out.println("Cognome: " + d1.getCognome());
            System.out.println("Età: " + d1.getEta());
            System.out.println("Stipendio: " + d1.getStipendio() + " €\n");

            //Creiamo un dipendente senza specificare lo stipendio
            Dipendente d2 = new Dipendente("Luigi", "Verdi", 25);
            System.out.println("Dipendente 2 creato con successo!");
            System.out.println("Nome: " + d2.getNome() + " " + d2.getCognome());
            System.out.println("Stipendio di default: " + d2.getStipendio() + " €\n");

            //Modifica dello stipendio usando il setter
            d2.setStipendio(1800.00);
            System.out.println("Nuovo stipendio di Luigi: " + d2.getStipendio() + " €");

        } catch (Exception e) {
            System.out.println("Si è verificato un errore: " + e.getMessage());
        }
    }
}
