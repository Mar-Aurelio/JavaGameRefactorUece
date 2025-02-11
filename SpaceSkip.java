import java.util.ArrayList;

public class SpaceSkip extends Space {
  public SpaceSkip() {
    super('↺');
  }

  public void applyEffect(ArrayList<Player> players, int playersSize, int currentPlayer) {
    players.get(currentPlayer).setSkipTurns(2);

    System.out.println("Casa de pulo: Proximo turno de " + players.get(currentPlayer).getCor() + " será pulado");
  }
}
