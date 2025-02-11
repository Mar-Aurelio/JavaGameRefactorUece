import java.util.Scanner;

public class PlayerUnlucky extends Player {
  public PlayerUnlucky(String color) {
    super(color);
  }
  
  public PlayerUnlucky(Player copy) {
    super(copy);
  }

  public void play() {
    Scanner waitForEnter = new Scanner(System.in);
    System.out.println("Pressione enter para jogar");
    waitForEnter.nextLine();
    hasPlayed = false;
    switch (skipTurns) {
      case 0:
        do {
          for (int i = 0; i < 2; i++)
            dice[i] = random.nextInt(6) + 1;
        } while (dice[0] + dice[1] > 6);

        position += dice[0] + dice[1];
        turnCount++;
        hasPlayed = true;

        break;
      case 1:
        if (coins < 2) {
          skipTurns--;
          break;
        }

        System.out.println("Deseja pagar 2 moedas para jogar? (s/n)");
        Scanner input = new Scanner(System.in);
        String pago = input.nextLine();
        input.close();

        skipTurns--;
        if (pago.equals("s")) {
          coins -= 2;
          play();
        }

        break;
      case 2:
        skipTurns--;

        break;
    }
    waitForEnter.close();
  }
}
