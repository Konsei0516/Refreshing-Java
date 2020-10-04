package Basic;

public class Taxi extends AbstractCar {
  private int fare;

  public void setFare(int fare){
    this.fare = fare;
  }

  public void dispFare(){
    System.out.println("料金は" + fare);
  }

  public void run(){
    System.out.println("お客様を乗せて走る");
  }
}
