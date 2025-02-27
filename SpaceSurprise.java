import java.util.ArrayList;
import java.util.Random;

enum Surprise {
  REGULAR,
  LUCKY,
  UNLUCKY
};

public class SpaceSurprise extends Space {
  private Random random = new Random();

  public SpaceSurprise() {
    super('?');
  }

  public void applyEffect(ArrayList<Player> players, int playerSize, int currentPlayer) {
    Surprise card = Surprise.values()[random.nextInt(3)];

    switch (card) {
      case Surprise.REGULAR:
        players.set(currentPlayer, GameFactory.changePlayerType('R', players.get(currentPlayer)));
        System.out.println("Casa de surpresa: " + players.get(currentPlayer).getCor() + " agore é normal");
        break;
      case Surprise.LUCKY:
        players.set(currentPlayer, GameFactory.changePlayerType('L', players.get(currentPlayer)));
        System.out.println("Casa de surpresa: " + players.get(currentPlayer).getCor() + " agore é sortudo");
        break;
      case Surprise.UNLUCKY:
        players.set(currentPlayer, GameFactory.changePlayerType('U', players.get(currentPlayer)));
        System.out.println("Casa de surpresa: " + players.get(currentPlayer).getCor() + " agore é azarado");
        break;
    }
  }
}
