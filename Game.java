import java.util.Scanner;

public class Game {
  Scanner input = new Scanner(System.in);
  Board board;
  String inSpaces;
  String inPlayers;
  String[] colors = {"Azul", "Marrom", "Verde", "Preto", "Branco", "Roxo"};

  public Game() {
    inSpaces = null;
    inPlayers = null;
  }

  public void configBoard(int boardSize) {
    System.out.println("Insira o tabuleiro (ex: OOOLPOOSWO)");
    System.out.println("legenda (note que tudo e maiusculo):");
    System.out.println("O - espaco simples");
    System.out.println("L - espaco sortudo");
    System.out.println("U - espaco azarado");
    System.out.println("M - mercado");
    System.out.println("J - espaco de jogar de novo");
    System.out.println("P - espaco de pular");
    System.out.println("S - espaco de surpresa");
    System.out.println("T - espaco de trocar");

    do 
      inSpaces = input.nextLine();
    while 
      (inSpaces.length() != boardSize);
  }

  public void configPlayers(int playerSize) {
    System.out.println("insira os tipos de jogador (ex: LNNLUN)");
    System.out.println("legenda (note que tudo e maiusculo, e a ordem nao importa):");
    System.out.println("N - jogador normal");
    System.out.println("L - jogador sortudo");
    System.out.println("U - jogador azarado");

    do 
      inPlayers = input.nextLine();
    while 
      (inPlayers.length() != playerSize);
  }

  public void start(boolean debug) {
    board = Board.getInstance(inPlayers, inSpaces, colors);

    while (!board.checkWinners()){
      if (debug) {
        System.out.println("Insira a casa para qual mover o jogador");
        int debugPosition = input.nextInt();
        board.executeTurn(debugPosition);
      } else
        board.executeTurn();

      board.printGamestate();
    }

    board.getEndGameStats();
  }
}
