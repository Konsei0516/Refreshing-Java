package Basic;

public class ConstructorTest3 {
  public static void main(String[] args){
    ThisSample ts1 = new ThisSample("佐藤");
    ts1.disp();

    ThisSample ts2 = new ThisSample("南",2);
    ts2.disp();

    ThisSample ts3 = new ThisSample("山本",30,"東京");
    ts3.disp();
  }
}