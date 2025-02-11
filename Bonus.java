public abstract class Bonus {
  protected int extraSpaces;
  protected int extraCoins;
  protected int price;
  protected String name;

  public Bonus(int extraSpaces, int extraCoins, int price, String name) {
    this.extraSpaces = extraSpaces;
    this.extraCoins = extraCoins;
    this.price = price;
    this.name = name;
  }

  public int getExtraSpaces() {
    return extraSpaces;
  }

  public int getExtraCoins() {
    return extraCoins;
  }

  public int getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }
}
