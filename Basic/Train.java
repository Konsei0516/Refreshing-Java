package Basic;

public class Train {
  private int seat;

  public Train(int seat){
    this.seat = seat;
  }

  public void disp(){
    System.out.println("グリーン席は" + seat);
  }
}
