import java.util.ArrayList;
import java.util.Scanner;

public class SpaceMarket extends Space {
  public SpaceMarket() {
    super('$');
  }

  public void applyEffect(ArrayList<Player> players, int playersSize, int currentPlayer) {
    System.out.println("Casa de Troca: escolha um bonus para seu jogador");
    Scanner input = new Scanner(System.in);

    boolean inMarket = true;
    while (inMarket) {
      int user = -1;
      while (user < 0 || user > 3) {
        System.out.println("(1) Boné: ganha 3 moedas e anda uma casa a mais a cada rodada de dados (6 moedas)");
        System.out.println("(2) Moleton: ganha 4 moedas e anda duas casas a mais a cada rodada de dados (9 moedas)");
        System.out.println("(3) Óculos Escuro: ganha 5 moedas e anda três casas a mais a cada rodada de dados (12 moedas)");
        System.out.println("(0) Nenhum");

        user = input.nextInt();
      }

      if (user == 0)
        break;

      Bonus bonus = null;
      switch (user) {
        case 1:
          bonus = new BonusCap();
          break;
        case 2:
          bonus = new BonusCoat();
          break;
        case 3:
          bonus = new BonusGlasses();
          break;
      }

      int result = players.get(currentPlayer).addBonus(bonus);
      if (result == 0) {
        System.out.println("Bonus adiquirido com sucesso");
        inMarket = false;
      } else if (result == 1)
        System.out.println("Jogador já possui esse bonus");
      else if (result == 2)
        System.out.println("Jogador nãp possui moedas o suficiente para adiquirir esses bonus");
    }

    input.close();
  }
}
