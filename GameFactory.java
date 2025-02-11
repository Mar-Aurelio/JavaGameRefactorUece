public class GameFactory {
  public static Player getPlayer(char type, String color) {
    if (type == 'L') return new PlayerLucky(color);
    else if (type == 'U') return new PlayerUnlucky(color);
    else return new PlayerRegular(color);
  }

  public static Player changePlayerType(char type, Player copy) {
    if (type == 'L') return new PlayerLucky(copy);
    else if (type == 'U') return new PlayerUnlucky(copy);
    else return new PlayerRegular(copy);
  }

  public static Space getSpace(char type) {
    if (type == 'L') return new SpaceLuck();
    else if (type == 'M') return new SpaceMarket();
    else if (type == 'U') return new SpaceUnluck();
    else if (type == 'J') return new SpacePlayAgain();
    else if (type == 'P') return new SpaceSkip();
    else if (type == 'S') return new SpaceSurprise();
    else if (type == 'T') return new SpaceSwap();
    else return new SpaceSimple();
  }
}
