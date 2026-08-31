package Modulo2;

/**
 * TESTO ESERCIZIO:
 * Realizzare un oggetto automobile con i seguenti parametri:
 * (marca, modello, cilindrata, lunghezza, larghezza, consumoMedio, maxCapacita, quantitaBenzinaCorrente)
 * Aggiunta del dato benzinaCosumata per sottrarre la benzina utilizzata
 *
 * @author @SamueleDallabrida
 * @date 31/08/2026
 * 
 * Metodi utilizzati:
 * @getQuantitaBenzinaCorrente: Getter per ottenere il valore la benzina corrente nel main
 * @percorri: Percorri una quantita desiderata di km, e la benzina viene scalata in base al consumo medio e alla quantità di km percorsi
 * @faiPieno: La macchina riempie totalmente il suo serbatoio, la quantità di benzina corrente è uguale alla capacità massima
 * @faiBenzina: La macchina riempie il proprio serbatoio con una quantità desidereta di litri di benzina
 */

public class Automobile {

    private String marca;
    private String modello;
    private int cilindrata;
    private double lunghezza;
    private double larghezza;
    private double consumoMedio;
    private double maxCapacita;
    private double quantitaBenzinaCorrente;
    private double benzinaConsumata;

    public Automobile(String marca, String modello, int cilindrata, double lunghezza, double larghezza, double consumoMedio, double maxCapacita, double quantitaBenzinaCorrente) throws Exception{
        this.marca = marca;
        this.modello = modello;
        if (cilindrata <= 0){
            throw new Exception("La cilindrata non può essere negativa o uguale a 0");
        }
        else this.cilindrata = cilindrata;
        if (lunghezza <= 0){
            throw new Exception("La lunghezza non può essere negativa o uguale a 0");
        }
        else this.lunghezza = lunghezza;
        if (larghezza <= 0){
            throw new Exception("La larghezza non può essere negativa o uguale a 0");
        }
        else this.larghezza = larghezza;
        if (consumoMedio <= 0){
            throw new Exception("Il cunsumo medio non può essere negativa o uguale a 0");
        }
        else this.consumoMedio = consumoMedio;
        if (maxCapacita <= 0){
            throw new Exception("La capacità massima non può essere negativa o uguale a 0");
        }
        else this.maxCapacita = maxCapacita;
        if (quantitaBenzinaCorrente < 0){
            throw new Exception("La quantita di benzina corrente non può essere negativa");
        }
        else this.quantitaBenzinaCorrente = quantitaBenzinaCorrente;
    }

    public double getQuantitaBenzinaCorrente() {
        return this.quantitaBenzinaCorrente;
    }

    public void percorri(int km) throws Exception {
        if (km < 0) {
            throw new Exception("I km percorsi non possono essere negativi");
        }
        else{
            benzinaConsumata = km / consumoMedio;
            quantitaBenzinaCorrente = quantitaBenzinaCorrente - benzinaConsumata;
        }
    }

    public void faiPieno() {
        quantitaBenzinaCorrente = maxCapacita;
    }

    public void faiBenzina(int litri) {
        quantitaBenzinaCorrente += litri;
    }
}
