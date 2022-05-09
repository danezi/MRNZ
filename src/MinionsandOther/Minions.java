package MinionsandOther;

import SpielKarte.KarteModel;
import model.PlayerType;

public class Minions extends KarteModel
{
 private  int lebenspunkt;
  private int manaWert;
  private int angriffswert;

  private int verteidigungspunkte;

  private String name;

  PlayerType typ;



  public Minions(String name, int manaWert,int lebenspunkte, int angriffswert, int verteidigungspunkte,PlayerType typ)

  {
    super( name, lebenspunkte, angriffswert, verteidigungspunkte,verteidigungspunkte);
    this.typ=typ;
  }



/*
  public Minions(int lebenspuntk, int manaWert,int angriffswert)
  {
    this.lebenspunkt = lebenspuntk;
    this.manaWert = manaWert;
    this.angriffswert = angriffswert;
  }
*/
  public int getLebenspunkt() {
    return lebenspunkt;
  }

  public void setLebenspunkt(int lebenspunkt) {
    this.lebenspunkt = lebenspunkt;
  }

  @Override
  public int getManaWert() {
    return manaWert;
  }

  @Override
  public void setManaWert(int manaWert) {
    this.manaWert = manaWert;
  }



  @Override
  public int getAngriffswert() {
    return angriffswert;
  }

  @Override
  public void setAngriffswert(int angriffswert) {
    this.angriffswert = angriffswert;
  }

  @Override
  public int getVerteidigungspunkte() {
    return verteidigungspunkte;
  }

  @Override
  public void setVerteidigungspunkte(int verteidigungspunkte) {
    this.verteidigungspunkte = verteidigungspunkte;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
