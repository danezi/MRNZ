import MinionsandOther.Minions;
import SpielKarte.KarteModel;
import model.PlayerType;

public class main
{
    public static void main(String[] args)
    {

        KarteModel minions1 = new KarteModel("ziii",1,4,3,1);
        KarteModel minions2 = new KarteModel("ziii",1,4,4,2);
        Minions.attackeffekt(minions1,minions2); //4-1


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
