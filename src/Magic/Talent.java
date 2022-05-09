package Magic;

import SpielKarte.KarteModel;

public class Talent
{
    /**
     * dieses Artefakte erhöht die mana des mionions.
     * @param energie
     * @param karte
     */
    public void artefakteenergy(int energie, KarteModel karte)
   {
    karte.setManaWert(karte.getManaWert() + energie);
   }

    /**
     * Erhöt den Wert von Lebenpunkt.
     * @param hit
     * @param karte
     */
    /*
    public void artefaktehit(int hit, KarteModel karte )
    {
        karte.setLebensPunkte(karte.getLebensPunkte(attacker.getAngriffswert() - attacker.getVerteidigungspunkte())+hit);
    }
*/
}
