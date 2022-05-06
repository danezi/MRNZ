package SpielKarte;

/**
 * Dieses Interface definiert einige Methodenköpfe für Karten.
 */
public interface IKarte
{
/**
 * Diese Methode Überschreiben, um die Karte zu implementieren.
 * gibt true zurück, wenn die Karte benutzt wurde.
 */
 public boolean use();

 /**
  * für die Description der Karte.
  */
  public String description();

 /**
  * für Manaerherhung durch diese Karte.
  * return gibt zurück die Anzahl von Mana, die durch diese Karte erhöht wird.
  */
 public int manaErhoeher();
 /**
  * getter  des ManaWerts der Implementierungskarte.
  * return gibt den ManaWert zurück.
  */
  public int getManaWert();

 /**
  * um den Manawert entsprechend der Karten zu verändern.
  */
 public int setManawert();

}
