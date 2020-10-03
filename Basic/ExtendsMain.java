package Basic;

public class ExtendsMain {
  public static void main(String[] args){
    Taxi taxi = new Taxi();

    taxi.setData(4,60);
    taxi.disp();

    taxi.setFare(1000);
    taxi.dispFare();

    taxi.run();
  }
}
