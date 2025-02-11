import java.util.ArrayList;

public class SpaceSimple extends Space {
  public SpaceSimple() {
    super(' ');
  }

  public void applyEffect(ArrayList<Player> players, int playersSize, int currentPlayer) {
    players.get(currentPlayer).addCoins(1);
  }
}
