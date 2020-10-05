package Basic;

public class CastMain {
  public static void main(String[] args){
    //taxiもBusもCarの一部
    Car[] carList = {new Taxi(),new Bus()};
    for(Car car : carList){
      car.run();
    }

    System.out.println();

    //Taxi固有の機能を使用
    Taxi taxi = (Taxi)carList[0];
    taxi.dispFare();

    Bus bus = (Bus)carList[1];
    bus.announce();
  }
}
