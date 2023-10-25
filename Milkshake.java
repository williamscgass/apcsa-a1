public class Milkshake extends MenuItem {
  private boolean choco;

  public Milkshake(String n, double p, boolean hasChocolate) {
    super(n + " milkshake", p);
    this.choco = hasChocolate;
  }

  public void setChocolate(boolean c) {
    this.choco = c;
  }

  public double getTotalPrice() {
    if (this.choco) {
      return this.getPrice() * 2;
    }

    return this.getPrice();
  }

  public String toString() {
    return "Thank you for visiting our food truck. Enjoy your " + this.getName() + ".";
  }
}
