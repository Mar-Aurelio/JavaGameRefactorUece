import java.util.ArrayList;

public class SpaceLuck extends Space {
  public SpaceLuck() {
    super('☘');
  }

  public void applyEffect(ArrayList<Player> players, int playersSize, int currentPlayer) {
    if (!(players.get(currentPlayer) instanceof PlayerUnlucky)) {
      players.get(currentPlayer).addPos(3);
      players.get(currentPlayer).addCoins(3);
      System.out.println("Casa de sorte: o jogador " + players.get(currentPlayer).getCor() + " foi movido 3 casas extras e ganhou 3 moedas");
    } else {
      System.out.println("Casa de sorte: o jogador " + players.get(currentPlayer).getCor() + " não moveu ou ganhou moedas por ser azarado");
    }
  }
}
