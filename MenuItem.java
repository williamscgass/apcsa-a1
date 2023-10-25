public class MenuItem {
  private String name;
  private double price;

  public MenuItem(String n, double p) {
    this.name = n;
    this.price = p;
  }

  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }
}
