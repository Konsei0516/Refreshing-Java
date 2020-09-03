import java.util.Calendar;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Carendar c = Calendar.getInstance();
    c.set(2019,8,22,1,23,45);
    c.set(Calendar.MONTH,9);
    Data d = c.getTime();
    System.out.println(d);
    Date now = new Date();
    c.setTime(now);
    int y = c.get(Calendar.YEAR);
    System.out.println("今年は" + y + "年です");
  }
}