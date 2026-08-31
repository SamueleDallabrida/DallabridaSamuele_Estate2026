package Modulo2;

/**
 * TESTO ESERCIZIO:
 * Definire la classe Frazione che permetta di gestire una frazione definita 
 * da numeratore e denominatore.
 * 
 * Frazione(numeratore, denominatore)
 * Frazione(numeratore) denominatore default 1
 * Frazione() numeratore 1, denominatore 1
 *
 * @author @SamueleDallabrida
 * @date 31/08/2026
 *
 * Metodi utilizzati:
 * @setNumeratore: Imposta il numeratore (non può essere negativo)
 * @setDenominatore: Imposta il denominatore (deve essere maggiore di zero)
 * @getNumeratore: Restituisce il numeratore
 * @getDenominatore: Restituisce il denominatore
 * @toString: Restituisce la frazione nel formato numeratore/denominatore
 * @somma: Calcola e restituisce la somma con un'altra frazione
 * @sottrai: Calcola e restituisce la differenza con un'altra frazione
 * @moltiplica: Calcola e restituisce il prodotto con un'altra frazione
 * @dividi: Calcola e restituisce il quoziente con un'altra frazione
 * @mcd: Metodo privato per calcolare il Massimo Comun Divisore
 * @mcm: Metodo privato per calcolare il Minimo Comune Multiplo
 * @riduci: Metodo privato per ridurre la frazione ai minimi termini
 */

public class Frazione {
    private int numeratore;
    private int denominatore;

    //Costruttore principale
    public Frazione(int numeratore, int denominatore) throws Exception {
        if (denominatore == 0) {
            throw new Exception("Il denominatore non può essere zero!");
        }
        if (numeratore < 0 || denominatore < 0) {
            throw new Exception("Numeratore e denominatore devono essere numeri naturali (>= 0).");
        }
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    //Costruttore con un solo parametro (default den = 1)
    public Frazione(int numeratore) throws Exception {
        this(numeratore, 1);
    }

    //Costruttore senza parametri (default 1/1)
    public Frazione() throws Exception {
        this(1, 1);
    }

    // d. Getter e Setter
    public int getNumeratore() {
        return numeratore;
    }

    public void setNumeratore(int numeratore) throws Exception {
        if (numeratore < 0) {
            throw new Exception("Il numeratore non può essere negativo.");
        }
        this.numeratore = numeratore;
    }

    public int getDenominatore() {
        return denominatore;
    }

    public void setDenominatore(int denominatore) throws Exception {
        if (denominatore <= 0) {
            throw new Exception("Il denominatore deve essere maggiore di zero.");
        }
        this.denominatore = denominatore;
    }

    //toString
    @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }

    //Somma: (a/b) + (c/d) = (a*d + c*b) / (b*d)
    public Frazione somma(Frazione f) throws Exception {
        int nuovoNum = (this.numeratore * f.denominatore) + (f.numeratore * this.denominatore);
        int nuovoDen = this.denominatore * f.denominatore;
        
        Frazione ris = new Frazione(nuovoNum, nuovoDen);
        return ris.riduci();
    }

    //Sottrazione: (a/b) - (c/d) = (a*d - c*b) / (b*d)
    public Frazione sottrai(Frazione f) throws Exception {
        int nuovoNum = (this.numeratore * f.denominatore) - (f.numeratore * this.denominatore);
        int nuovoDen = this.denominatore * f.denominatore;
        
        Frazione ris = new Frazione(nuovoNum, nuovoDen);
        return ris.riduci();
    }

    //Moltiplicazione: (a/b) * (c/d) = (a*c) / (b*d)
    public Frazione moltiplica(Frazione f) throws Exception {
        int nuovoNum = this.numeratore * f.numeratore;
        int nuovoDen = this.denominatore * f.denominatore;
        
        Frazione ris = new Frazione(nuovoNum, nuovoDen);
        return ris.riduci();
    }

    //Divisione: (a/b) / (c/d) = (a*d) / (b*c)
    public Frazione dividi(Frazione f) throws Exception {
        if (f.numeratore == 0) {
            throw new Exception("Impossibile dividere per una frazione con numeratore 0!");
        }
        int nuovoNum = this.numeratore * f.denominatore;
        int nuovoDen = this.denominatore * f.numeratore;
        
        Frazione ris = new Frazione(nuovoNum, nuovoDen);
        return ris.riduci();
    }

    //MCD
    private int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //mcm = (a * b) / mcd(a, b)
    private int mcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return (a * b) / mcd(a, b);
    }

    private Frazione riduci() throws Exception {
        if (this.numeratore == 0) {
            return new Frazione(0, 1);
        }
        int divisore = mcd(this.numeratore, this.denominatore);
        return new Frazione(this.numeratore / divisore, this.denominatore / divisore);
    }
}