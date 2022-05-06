package SpielKarte;

import java.util.ArrayList;
import java.util.List;

public class KarteTools
{
    public static void isattack(KarteModel attacke, KarteModel attackeur, List<KarteModel> karteAufMap)
    {
        int controller = attacke.getY()- attackeur.getY();
        int controllerX = attacke.getX()- attackeur.getX();
        List<KarteModel> enemieKarteOnSameY = new ArrayList<>();
        List<KarteModel> enemieKarteOnSameX = new ArrayList<>();


            if(!attacke.getPlayerType().toString().equals(attackeur.getPlayerType().toString())) /* Kontrolle, ob die
             Karten nicht vom selben Typ sind*/
            {
                if(isCardOnTheNordOrSouth(attacke, attackeur))
                {
                    if(controller==1)
                    {
                        //logic attack
                    }else
                    {
                        cardSelectionByCardOnSameY(controller, karteAufMap, enemieKarteOnSameY, attackeur, attacke); //card on Y
                    }

                }else if(isCardWestOrEast(attacke, attackeur)) {
                    if (controllerX == 1) {
                        //logic attack
                    } else
                        cardSelectionByCardOnSameX(controllerX, karteAufMap, enemieKarteOnSameX, attackeur, attacke);
                }
                }
            }


    /**
     * Diese Methode nimmt alle Karten, die zwischen der angreifenden
     * und der angegriffenen Karte liegen, falls es/sie  gibt, und setzt sie in die List karteAufMap.
     * @param controller
     * @param karteAufMap
     *                 Liste, in der er unsere Karte hätte.
     * @param karteOnSameY
     *                 alle Karten, die auf der gleichen Achse der Ordinaten(oder auf der Vertikalen unserer Karte) liegen.
     * @param attackeur
     *               die angreifende Karte.
     * @param attacke
     *           die Karte, die angegriffen wird.
     */
    private static void cardSelectionByCardOnSameY(int controller, List<KarteModel> karteAufMap, List<KarteModel>
            karteOnSameY, KarteModel attackeur, KarteModel attacke)
    {
        if(controller >0)
        {
            for(KarteModel karte : karteAufMap) //karte is a card on the field.
            {
                if(isCardOnTheNordOrSouth(attackeur, karte)) {
                    if (karte.getY() > attackeur.getY() && karte.getY() < attacke.getY()) {
                        if (karte.getPlayerType() != attackeur.getPlayerType()) {
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
                if(isCardOnTheNordOrSouth(attackeur, karte)) {
                    if (karte.getY() < attackeur.getY() && karte.getY() > attacke.getY()) {
                        if (karte.getPlayerType() != attackeur.getPlayerType()) {
                            karteOnSameY.add(karte);
                        }
                    }
                }
            }
            // ecrire la logique pour ce qui se passe
            //logic to attack oll karte in enemieKarteOnSameX.

        }
    }

    private static void cardSelectionByCardOnSameX(int controller, List<KarteModel> karteAufMap, List<KarteModel>
            karteOnSameX, KarteModel attackeur, KarteModel attacke)
    {
        if(controller >0)
        {
            for(KarteModel karte : karteAufMap) //karte is a card on the field.
            {
                if(isCardWestOrEast(attackeur, karte)) {
                    if (karte.getX() > attackeur.getX() && karte.getX() < attacke.getX()) {
                        if (karte.getPlayerType() != attackeur.getPlayerType()) {
                            karteOnSameX.add(karte);
                        }
                    }
                }

            }


            //logic to attack oll karte in enemieKarteOnSameX.
        } else  {
            for(KarteModel karte : karteAufMap) //karte is a card on the field.
            {
                if(isCardWestOrEast(attackeur, karte)) {
                    if (karte.getX() < attackeur.getX() && karte.getX() > attacke.getX()) {
                        if (karte.getPlayerType() != attackeur.getPlayerType()) {
                            karteOnSameX.add(karte);
                        }
                    }
                }

            }
            //logic to attack oll karte in enemieKarteOnSameX
        }
    }




    private static boolean isCardOnTheNordOrSouth(KarteModel karte1, KarteModel karte2)
    {
        if(karte1.getX() != karte2.getX())
        {
            return false;
        }
        return true;
    }

    private static boolean isCardWestOrEast(KarteModel karte1, KarteModel karte2)
    {
        if(  karte1.getY() != karte2.getY())
        {
            return false;
        }
        return true;
    }
}
