package Modulo2;

import Modulo2.StatoLampadina;

/**
 * TESTO ESERCIZIO:
 * Realizzare un oggetto lampadina, che possa variare il proprio stato in base a se è accesa o spenta o rotta, la lampadina
 * cambia lo stato in rotta quanto il numero di click massimi sono esauriti;
 * L'oggetto lampadina ha i seguenti parametri: ( NclickMax , stato )
 * NclickMax = numero di click massimi che la lampadina può effettuare prima che si rompa
 * stato = stato corrente della lampadina
 *
 * @author @SamueleDallabrida
 * @date 31/08/2026
 * 
 * Metodi utilizzati:
 * @setStato: Imposta uno stato specifico la lampadina
 * @getStato: Restituisce lo stato attuale dellla lampadina
 * @click: Verifica che la lampadina non sia rotta, e cambia il suo stato io spenta o accesa riducendo i click rimanenti, se è rotta restituisce un eccezione
 * @toString: Metodo che restituisce lo stato della lampadina
 */

public class Lampadina {
    private StatoLampadina stato;
    private int NclickMax;
    private int NclickRimanenti;

    public Lampadina (int NclickMax, StatoLampadina stato) throws Exception{
        if(NclickMax < 0) {
            throw new Exception("I clik assegnati alla lampadina non possono essere negativi");
        }
        else this.NclickMax = NclickMax;
        setStato(StatoLampadina.SPENTA);
        NclickRimanenti = NclickMax;
    }

    public void setStato(StatoLampadina stato) throws Exception{
        if(this.stato != StatoLampadina.SPENTA && this.stato != StatoLampadina.ACCESA && this.stato != null) {
            throw new Exception("Lo stato della lampadina deve essere per forza 'ACCESA' o 'SPENTA'");
        }
        else this.stato = stato;
    }

    public StatoLampadina getStato() {
        return stato;
    }

    public void click() throws Exception{

        if (getStato() == StatoLampadina.ROTTA) {
            throw new Exception("Il click non è servito a nulla la lampadina è rotta");
        }

        if(getStato() == StatoLampadina.SPENTA) {
            setStato(StatoLampadina.ACCESA);
        }else{
            setStato(StatoLampadina.SPENTA);
        }
        NclickRimanenti--;
        if (NclickRimanenti <= 0) {
            setStato(StatoLampadina.ROTTA);
        }
    }

    @Override
    public String toString() {
        String testo = "[";
        testo = testo + getStato().toString();
        return testo;
    }
}
