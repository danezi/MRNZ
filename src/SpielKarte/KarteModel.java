package SpielKarte;

import model.PlayerType;

/**
 * Der CardAdapter ist der Bauplan für alle Arten von Karten. alle spielbaren Karten.
 */
public class KarteModel
{
    /**
     * Der NAME der Karte, wird meist in Tooltips(Beschreibung) angezeigt.
     */
    private String nameKarte;

    private PlayerType playerType;

    /**
     * der Wert von Mana.
     */
    private int manaWert;

    /**
     * Kartenidentität.
     */
    private int karteId;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     */
    private int x;

    private int y;

    /**
     * Karte Beschreibung in Tooltips
     */
    private String schalgWörter = KarteKonstanz.DEFAULT_KARTE_DESCRIPTION;

    /**
     * Hit point oder Lebenspunkte repräsentiert das leben einer Einheit(Minions, karte).
     */
    private int lebensPunkte;

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
     */
    public KarteModel(String name,int manaWert,int lebenspunkte)
    {
        this.nameKarte = name;
        this.manaWert = manaWert;
    }


    public int getManaWert() {
        return manaWert;
    }

    public int getKarteId() {
        return karteId;
    }

    public void setKarteId(int karteId)
    {
        this.karteId = karteId;
    }

    public String getSchalgWörter()
    {
        return schalgWörter;
    }

    public void setSchalgWörter(String schalgWörter)
    {
        this.schalgWörter = schalgWörter;
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
}
