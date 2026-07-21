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
    int höhe;
    int breite;
    int positionX;
    int positionY;
    private ArrayList<Character> spielfeld;
    

    /**
     * Konstruktor für Objekte der Klasse Spiel:
     * initialisiert die Attribute
     */
    public Spiel()
    {
         spielfeld = new ArrayList<Character>();
        
        int spielerX = 1;
         int spielerY = 1;
         int[] kisteX = {3};
         int[] kisteY = {2};
         int[] zielX = {5};
         int[] zielY = {2};
         
             
         
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
