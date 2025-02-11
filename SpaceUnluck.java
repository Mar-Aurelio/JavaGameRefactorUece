import java.util.ArrayList;

public class SpaceUnluck extends Space {
  public SpaceUnluck() {
    super('♧');
  }

  public void applyEffect(ArrayList<Player> players, int playersSize, int currentPlayer) {
    if (!(players.get(currentPlayer) instanceof PlayerLucky)) {
      players.get(currentPlayer).addCoins(-3);
      System.out.println("Casa de sorte: o jogador " + players.get(currentPlayer).getCor() + " perdeu 3 moedas");
    } else {
      System.out.println("Casa de sorte: o jogador " + players.get(currentPlayer).getCor() + " não perdeu moedas por ser sortudo");
    }
  }
}
