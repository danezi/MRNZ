package SpielKarte;

import model.PlayerType;

/**
 * Der KarteModel ist der Bauplan für alle Arten von Karten. alle spielbaren Karten.
 */
public class KarteModel
{

    /**
     * Der Name der Karte, wird meist in Tooltips(Beschreibung) angezeigt.
     */
    private String nameKarte;

    /**
     * Hit point oder Lebenspunkte repräsentiert das leben einer Einheit(Minions, karte).
     */
    private int lebensPunkte;

    private int angriffswert;

    private PlayerType playerType;

    /**
     * der Wert von Mana.
     */
    private int manaWert;
    private int verteidigungspunkte;
    /**
     * Kartenidentität.
     */
    private int karteId;

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    /**
     *
     */
    private int x;

    private int y;


    /**
     * Konstruktor.
     */
    public KarteModel()
    {

    }

    /**
     * Der Effekt, der ausgeführt werden soll, wenn diese Karte gespielt wird.
     */
     private IKarteEffekt karteEffekt= null;

    public String getNameKarte()
    {
        return nameKarte;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setNameKarte(String neunameKarte)
    {
        this.nameKarte = neunameKarte;
    }

    public void setManaWert(int manawert)

    {
        this.manaWert= manawert;
    }

    public KarteModel(String name,int manaWert)
    {
       this.nameKarte = name;
       this.manaWert = manaWert;
    }

    /**
     * Minions
     * @param name
     * @param manaWert
     * @param lebenspunkte
     * @param angriffswert
     * @param verteidigungspunkte
     *                      Minions-Verteidigungspunkt
     */
    public KarteModel(String name, int manaWert, int lebenspunkte, int angriffswert, int verteidigungspunkte)
    {
        this.lebensPunkte= lebenspunkte;
        this.nameKarte = name;
        this.manaWert = manaWert;
        this.angriffswert = angriffswert;
        this.verteidigungspunkte =verteidigungspunkte;
    }

    /**
     *Dieser Konstruktor kann später für Artefakte oder Waffen-karten verwendet werden.
     * @param name
     * @param manaWert
     * @param lebenspunkte
     */
    public KarteModel(String name,int manaWert,int lebenspunkte)
    {
        this.nameKarte = name;
        this.manaWert = manaWert;
        this.lebensPunkte= lebenspunkte;
    }

    /**
     * Diese Methode abzieht die Lebenspunkte des angegriffenen Spielfigurs.
     * @param attacked
     *               der angegriffene Spielfigur.
     * @param attacker
     *              der angreifende Spielfigur.
     */
    public static void attackeffekt(KarteModel attacked, KarteModel attacker)
    {
        int ab ;
       ab = attacker.getAngriffswert() - attacked.getVerteidigungspunkte();
        System.out.println("die abgezogenepunkt ist: " + ab);

    }
    public int getManaWert()
    {
        return manaWert;
    }



    public int getKarteId() {
        return karteId;
    }

    public void setKarteId(int karteId)
    {
        this.karteId = karteId;
    }

    public int getLebensPunkte()
    {
        return lebensPunkte;
    }

    public void setLebensPunkte(int lebensPunkte)
    {
        this.lebensPunkte = lebensPunkte;
    }

    public IKarteEffekt getKarteEffekt()
    {
        return karteEffekt;
    }

    public void setKarteEffekt(IKarteEffekt karteEffekt)
    {
        this.karteEffekt = karteEffekt;
    }

    private int [][] attack;

    public int getAttack()
    {
        return manaWert;
    }


    public void setAttack(int[][] attack)
    {
        this.attack = attack;
    }

    public PlayerType getPlayerType()
    {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType)
    {
        this.playerType = playerType;
    }

    public int getVerteidigungspunkte()
    {
        return verteidigungspunkte;
    }

    public void setVerteidigungspunkte(int verteidigungspunkte)
    {
        this.verteidigungspunkte = verteidigungspunkte;
    }

    public int getAngriffswert()
    {
        return angriffswert;
    }

    public void setAngriffswert(int angriffswert) {
        this.angriffswert = angriffswert;
    }



}
