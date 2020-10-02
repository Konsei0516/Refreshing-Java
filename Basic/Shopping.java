package Basic;

public class Shopping {
  //引数1
  public void buy(int price){
    System.out.println("商品は" + price + "円です");
  }
  //引数2
  public void buy(int price, int quantity){
    System.out.println("商品" + quantity + "つの合計は" + price * quantity + "円です");
  }
}
