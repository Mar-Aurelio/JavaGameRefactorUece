import java.util.ArrayList;

public class SpaceSwap extends Space {
  public SpaceSwap() {
    super('⇄');
  }

  public void applyEffect(ArrayList<Player> players, int playersSize, int currentPlayer) {
    int far = 40;
    int playerIndex = 0;
    
    for (int i = 0; i < playersSize; i++) {
      if (far > players.get(i).getPos()) {
        far = players.get(i).getPos();
        playerIndex = i;
      }
    }

    if (players.get(currentPlayer).getPos() == players.get(playerIndex).getPos()) {
      System.out.println("Casa de troca: o jogador " + players.get(currentPlayer).getCor() + " já é o último, não houveram trocas");
      return;
    }

    int temp = players.get(currentPlayer).getPos();
    players.get(currentPlayer).setPos(players.get(playerIndex).getPos());
    players.get(playerIndex).setPos(temp);

    System.out.println("Casa de troca: " + players.get(currentPlayer).getCor() + " e " + players.get(playerIndex).getCor() + " trocaram de posição");
  }
}
