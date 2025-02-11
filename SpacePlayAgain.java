import java.util.ArrayList;

public class SpacePlayAgain extends Space {
  public SpacePlayAgain() {
    super('⚅');
  }

  public void applyEffect(ArrayList<Player> players, int playersSize, int currentPlayer) {
    System.out.println("Casa jogue denovo: jogue novamente");
    players.get(currentPlayer).play();

    int[] dice = players.get(currentPlayer).getDice();
    players.get(currentPlayer).addCoins(dice[0] + dice[1]);
    System.out.println("Casa jogue denove: foram adicionadas " + (dice[0] + dice[1]) + " moeadas ao jogador");
  }
}
