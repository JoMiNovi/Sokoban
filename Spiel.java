import java.util.ArrayList;

/**
 * Klasse Spiel zur Umsetzung eines Mini-Projekts
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spiel extends Ereignisbehandlung
{
    /**
     * Notiere hier nötige Attribute.
     */
    String spielfeld;
    int höhe;
    int breite;
    int positionX;
    int positionY;
    

    /**
     * Konstruktor für Objekte der Klasse Spiel:
     * initialisiert die Attribute
     */
    public Spiel()
    {
         int positionX = 10;
         int posotionY = 10;
         int höhe = 200;
         int breite = 200;
    }

    /**
     * Methode MausGeklickt
     * 
     * @param x x-Position des Klicks in Pixel
     * @param y y-Position des Klicks in Pixel
     * @param anzahl Klickanzahl, hier nicht relevant
     */
    @Override
    void MausGeklickt(int x, int y, int anzahl)
    {
        //ggfs. ergänzen
    }

    /**
     * Zeichnet abhängig von den Werten der Attribute neu
     *
     */
    void AnzeigeAktualisieren()
    {
        {
          
        }
    }

}
