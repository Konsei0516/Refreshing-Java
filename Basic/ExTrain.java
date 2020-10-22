package Basic;

public class ExTrain {
  private int greenSeat;

  public ExTrain(int seat, int greenSeat){
    super(seat);
    this.greenSeat = greenSeat;
  }

  public void disp(){
    super.disp();
    System.out.println("グリーン席は" + greenSeat);
  }
}
