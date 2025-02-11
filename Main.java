public class Main {
  public static void main(String[] argv) {
    Game game = new Game();
    int numSpaces;
    int numPlayers;
    game.configBoard(numSpaces);
    game.configPlayers(numPlayers);
    game.start();
  }
}
