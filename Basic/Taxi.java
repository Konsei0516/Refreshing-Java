package Basic;

public class Taxi extends Car{
  private int fare;

  public void setFare(int fare){
    this.fare = fare;
  }

  public void dispFare(){
    System.out.println("料金は" + fare);
  }
}
