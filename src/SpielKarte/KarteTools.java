package SpielKarte;

import java.util.ArrayList;
import java.util.List;

/**
 * Kontrolle, ob die Karten nicht vom selben Typ sind.
 *
 * Die Karten, die den Angreifer und den Angreifer trennen,
 * müssen eingesammelt werden (dies gilt für Karten, die die Möglichkeit haben,
 * alle Karten (des Gegners) in derselben (Reihe oder Spalte) anzugreifen).
 */
public class KarteTools
{
    /**
     *
     * @param attacked
     *             der angriffene Spieler.
     * @param attacker
     *             der angreifende Spieler.
     * @param karteAufMap
     *             alle Karten auf der Map.
     */
    public static void isattack(KarteModel attacked, KarteModel attacker, List<KarteModel> karteAufMap) // Minions statt KarteModel...?
    {
        int controller = attacked.getY()- attacker.getY();
        int controllerX = attacked.getX()- attacker.getX();
        List<KarteModel> enemieKarteOnSameY = new ArrayList<>();
        List<KarteModel> enemieKarteOnSameX = new ArrayList<>();


            if(!attacked.getPlayerType().toString().equals(attacker.getPlayerType().toString())) /* Kontrolle, ob die
             Karten nicht vom selben Typ sind*/
            {
                if(isCardOnTheNordOrSouth(attacked, attacker))
                {
                    if(controller==1)
                    {
                        //logic attacks
                        KarteModel.attackeffekt(attacked,attacker);
                    }else
                    {
                        cardSelectionByCardOnSameY(controller, karteAufMap, enemieKarteOnSameY, attacker, attacked); //card on Y
                    }

                }else if(isCardWestOrEast(attacked, attacker)) {
                    if (controllerX == 1)
                    {

                        //logic attack
                        KarteModel.attackeffekt(attacked,attacker);
                    } else
                        cardSelectionByCardOnSameX(controllerX, karteAufMap, enemieKarteOnSameX, attacker, attacked);
                }
                }
            }


    /**
     * Diese Methode nimmt alle Karten, die zwischen der angreifenden
     * und der angegriffenen Karte liegen(auf Ordinatenachse oder auf die Spalte),
     * falls es/sie  gibt, und setzt sie in die List karteAufMap.
     * @param controller
     *                  ist die Differenz zwischen den Koordinaten auf der Y-Achse  des Angreifers und des Angreifers.
     * @param karteAufMap
     *                 Liste, in der er unsere Karte hätte.
     * @param karteOnSameY
     *                 alle Karten, die auf der gleichen Achse der Ordinaten(oder auf der Vertikalen unserer Karte) liegen.
     * @param attacker
     *               die angreifende Karte.
     * @param attacked
     *           die Karte, die angegriffen wird.
     */
    private static void cardSelectionByCardOnSameY(int controller, List<KarteModel> karteAufMap, List<KarteModel>
            karteOnSameY, KarteModel attacker, KarteModel attacked)
    {
        if(controller >0)
        {
            for(KarteModel karte : karteAufMap) //karte is a card on the field.
            {
                if(isCardOnTheNordOrSouth(attacker, karte)) {
                    if (karte.getY() > attacker.getY() && karte.getY() < attacked.getY()) {
                        if (karte.getPlayerType() != attacker.getPlayerType()) {
                            karteOnSameY.add(karte);
                        }
                    }
                }

            }

            // ecrire la logique pour ce qui se passe
            //logic to attack oll karte in enemieKarteOnSameX.
        } else  {
            for(KarteModel karte : karteAufMap) //karte is a card on the field.
            {
                if(isCardOnTheNordOrSouth(attacker, karte)) {
                    if (karte.getY() < attacker.getY() && karte.getY() > attacked.getY()) {
                        if (karte.getPlayerType() != attacker.getPlayerType()) {
                            karteOnSameY.add(karte);
                        }
                    }
                }
            }
            // ecrire la logique pour ce qui se passe
            //logic to attack oll karte in enemieKarteOnSameX.

        }
    }
    /**
     * Diese Methode nimmt alle Karten, die zwischen der angreifenden
     * und der angegriffenen Karte liegen(auf der Linie oder auf die Achse der Abszisse), falls es/sie  gibt, und setzt sie in die List karteAufMap.
     * @param controller
     *                 ist die Differenz zwischen den Koordinaten auf der X-Achse  des Angreifers und des Angreifers.
     * @param karteAufMap
     *                 Liste, in der er unsere Karte hätte.
     * @param karteOnSameX
     *                 ist die Differenz zwischen den Koordinaten auf der y-Achse  des Angreifers und des Angreifers.
     * @param attacker
     *               die angreifende Karte.
     * @param attacked
     *           die Karte, die angegriffen wird.
     */
    private static void cardSelectionByCardOnSameX(int controller, List<KarteModel> karteAufMap, List<KarteModel>
            karteOnSameX, KarteModel attacker, KarteModel attacked)
    {

        if(controller >0)
        {
            for(KarteModel karte : karteAufMap) //karte is a card on the field.
            {
                if(isCardWestOrEast(attacker, karte)) {
                    if (karte.getX() > attacker.getX() && karte.getX() < attacked.getX()) {
                        if (karte.getPlayerType() != attacker.getPlayerType()) {
                            karteOnSameX.add(karte);
                        }
                    }
                }

            }


            //logic to attack oll karte in enemieKarteOnSameX.
        } else  {
            for(KarteModel karte : karteAufMap) //karte is a card on the field.
            {
                if(isCardWestOrEast(attacker, karte)) {
                    if (karte.getX() < attacker.getX() && karte.getX() > attacked.getX()) {
                        if (karte.getPlayerType() != attacker.getPlayerType()) {
                            karteOnSameX.add(karte);
                        }
                    }
                }

            }
            //logic to attack oll karte in enemieKarteOnSameX
        }
    }


    /**
     * Überpruft ob die Karten auf der gleichen vertikalen Linie (Spalte) angeordnet sind.
     * @param karte1
     * @param karte2
     * @return true die Bedingung erfüllt ist.
     */
    private static boolean isCardOnTheNordOrSouth(KarteModel karte1, KarteModel karte2)
    {
        if(karte1.getX() != karte2.getX())
        {
            return false;
        }
        return true;
    }

    /**
     * Überpruft ob die Karten auf der gleichen horizontal Linie (Linie) angeordnet sind.
     * @param karte1
     * @param karte2
     * @return true die Bedingung erfüllt ist.
     */
    private static boolean isCardWestOrEast(KarteModel karte1, KarteModel karte2)
    {
        if(  karte1.getY() != karte2.getY())
        {
            return false;
        }
        return true;
    }
}
