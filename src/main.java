import SpielKarte.KarteModel;
import model.PlayerType;

public class main
{
    public static void main(String[] args)
    {
        KarteModel zidane = new KarteModel("ziii",5,4);
        KarteModel player = new KarteModel("ziii",5,4);

        zidane.setPlayerType(PlayerType.DUNGEON);
        player.setPlayerType(PlayerType.PLAYER);

        System.out.println("#######333########## zidane typ "+ zidane.getPlayerType() +" "+ zidane.getNameKarte()+
               "wwnwkj"+ zidane.getLebensPunkte());
        System.out.println("################# player typ "+ player.getPlayerType());

    }
}
