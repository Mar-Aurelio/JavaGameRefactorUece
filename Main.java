import java.util.Scanner;

public class Main {
  public static void main(String[] argv) {
    Scanner input = new Scanner(System.in); 

    Game game = new Game();
    System.out.println("Insira o numero de espacos:");
    int numSpaces = input.nextInt();
    System.out.println("Insira o numero de jogadores:");
    int numPlayers = input.nextInt();

    boolean debug = false;
    game.configBoard(numSpaces);
    game.configPlayers(numPlayers);
    game.start(debug);

    input.close();
  }
}
