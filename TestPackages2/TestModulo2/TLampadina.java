package TestPackages2.TestModulo2;

import Modulo2.Lampadina;
import Modulo2.StatoLampadina;

/**
 * TESTO ESERCIZIO:
 * Test dei seguenti metodi della classe Lampadina:
 *
 * @author @SamueleDallabrida
 * @date 31/08/2026
 */

public class TLampadina {
    public static void main(String[] args) throws Exception{
        Lampadina LED = new Lampadina(3, null);

        System.out.println(LED.getStato() + " 1");
        LED.click();
        System.out.println(LED.getStato() + " 2");
        LED.click();
        System.out.println(LED.getStato() + " 3");
        LED.click();
        System.out.println(LED.getStato() + " 4");
        //LED.click(); fa scattare l'eccezione
    }
}
