public class PlayerRegular extends Player {
  public PlayerRegular(String color) {
    super(color);
  }

  public PlayerRegular(Player copy) {
    super(copy);
  }

  public void play() {
    System.out.println("Pressione enter para jogar");
    input.nextLine();
    hasPlayed = false;
    switch (skipTurns) {
      case 0:
        for (int i = 0; i < 2; i++)
          dice[i] = random.nextInt(6) + 1;

        position += dice[0] + dice[1];
        turnCount++;
        hasPlayed = true;

        break;
      case 1:
        if (coins < 2) {
          skipTurns--;
          break;
        }

        System.out.println("Sua vez será pulada, deseja pagar 2 moedas para jogar? (s/n)");
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
  }
}
