import MinionsandOther.Minions;
import SpielKarte.KarteModel;
import model.PlayerType;

public class main
{
    public static void main(String[] args)
    {

        Minions minions3 = new Minions("minions",1,4,3,3,PlayerType.PLAYER);
        Minions minions4 = new Minions("minions",1,4,6,2,PlayerType.DUNGEON);
        Minions.attackeffekt(minions3,minions4);
/*
        KarteModel player = new KarteModel("ziii",5,4);
       System.out.println( "rrrr" +player.getX() );
        zidane.setPlayerType(PlayerType.DUNGEON);
        player.setPlayerType(PlayerType.PLAYER);

        System.out.println("#######333########## zidane typ "+ zidane.getPlayerType() +" "+ zidane.getNameKarte()+
               "wwnwkj"+ zidane.getLebensPunkte(attacker.getAngriffswert() - attacker.getVerteidigungspunkte()));
        System.out.println("################# player typ "+ player.getPlayerType());
*/
    }
}
