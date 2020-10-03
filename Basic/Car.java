package Basic;

public class Car {
  private int fuel;
  private int speed;

  public void setData(int fuel, int speed){
    this.fuel = fuel;
    this.speed = speed;
  }

  public void disp(){
    System.out.println("燃料は" + fuel);
    System.out.println("速度は" + speed);
  }

  public void run(){
    System.out.println("走る");
  }
}
