import java.util.ArrayList;
import java.util.Random;

public abstract class Player {
  protected int position;
  protected int coins;
  protected int turnCount;
  protected int skipTurns;
  protected boolean hasPlayed;
  protected int[] dice;
  protected String color;
  protected ArrayList<Bonus> bonuses;
  protected Random random = new Random();

  public Player(String color) {
    this.color = color;
    position = 0;
    coins = 0;
    turnCount = 0;
    skipTurns = 0;
    hasPlayed = false;
    dice = new int[2];
    bonuses = new ArrayList<Bonus>();
    dice[0] = 0;
    dice[1] = 0;
  }

  public Player(Player copy) {
    this.color = copy.color;
    this.position = copy.position;
    this.coins = copy.coins;
    this.hasPlayed = copy.hasPlayed;
    this.turnCount = copy.turnCount;
    this.skipTurns = copy.skipTurns;
    this.dice = copy.dice;
    this.bonuses = copy.bonuses;
  }

  public abstract void play();

  public int addBonus(Bonus bonus) {
    if (bonuses.contains(bonus))
      return 1;
    
    if (coins < bonus.getPrice())
      return 2;

    bonuses.add(bonus);
    return 0;
  }

  public void applyBonuses() {
    if (!bonuses.isEmpty())
      for (Bonus b : bonuses) {
        addPos(b.getExtraSpaces());
        addCoins(b.getExtraCoins());
      }
  }

  public void addPos(int add) {
    position = (position + add < 0) ? (0) : (position + add);
  }

  public void addCoins(int add) {
    coins = (coins + add < 0) ? (0) : (coins + add);
  }

  public void setPos(int position) {
    this.position = position;
  }

  public void setSkipTurns(int skipTurns) {
    this.skipTurns = skipTurns;
  }

  public int getSkipTurns() {
    return skipTurns;
  }

  public int getTurnCount() {
    return turnCount;
  }

  public int[] getDice() {
    return dice;
  }

  public ArrayList<Bonus> getBonuses() {
    return bonuses;
  }

  public boolean getHasPlayed() {
    return hasPlayed;
  }

  public String getCor() {
    return color;
  }

  public int getPos() {
    return position;
  }

  public int getCoins() {
    return coins;
  }
}
