import character.weapon.repository.Impl.WeaponRepositoryImpl;
import server.GameServer;

public class Main {
    public static void main(String[] args) {
        GameServer gameServer = new GameServer(new WeaponRepositoryImpl());

        gameServer.gameStart();
    }
}
