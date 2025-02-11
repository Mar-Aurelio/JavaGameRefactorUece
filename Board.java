import java.util.ArrayList;

public class Board{
  private static Board instance;

  private ArrayList<Space> spaces;
  private ArrayList<Player> players;
  private int currPlayer;
  private String winner;

  private Board(int numPlayers, int numSpaces, String[] colors) {
    currPlayer = 0;
    spaces = new ArrayList<Space>();
    players = new ArrayList<Player>();

    for (int i = 0; i < numSpaces; i++) {
      //Setup spaces
    }

    for (int i = 0; i < numPlayers; i++) {
      //Initialize player types
    }
  }

  public static Board getInstance(int numPlayers, int numSpaces, String[] colors) {
    if (instance == null)
      instance = new Board(numPlayers, numSpaces, colors);
    return instance;
  }

  public void executeTurn() {
    players.get(currPlayer).play();
    players.get(currPlayer).applyBonuses();

    if (players.get(currPlayer).getHasPlayed())
      spaces.get(players.get(currPlayer).getPos()).applyEffect(players, players.size(), currPlayer);

    currPlayer++;
    currPlayer = currPlayer%players.size();
  }

  public void printGamestate() {
    for (Player p : players) {
      System.out.println("Jogador " + p.getCor() + " está na casa " + p.getPos() + " com " + p.getCoins() + " moedas");
      
      if (!p.getBonuses().isEmpty())
        System.out.println("Bonus ativos:");
        for (Bonus b : p.getBonuses()) {
          System.out.println(b.getName());
        }
    }

    System.out.println("Turno atual: " + players.get(currPlayer).getCor());
  }

  public boolean checkWinners() {
    for (Player p : players)
      if (p.getPos() >= spaces.size()) {
        winner = p.getCor();
        return true;
      }

    return false;
  }

  public void getEndGameStats() {
    System.out.println(winner + " ganhou o jogo");
    for (Player p : players)
      System.out.println(p.getCor() + " jogou " + p.getTurnCount() + " turnos e possuia " + p.getCoins() + " moedas");
  }

  public Player getCurrentPlayer() {
    return players.get(currPlayer);
  }
}
