public abstract class Bonus {
  protected int extraSpaces;
  protected int extraCoins;
  protected int price;

  public Bonus(int extraSpaces, int extraCoins, int price) {
    this.extraSpaces = extraSpaces;
    this.extraCoins = extraCoins;
    this.price = price;
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
}
