import java.time.*;

public class Main {
  public static void main(String[] args) throws Exception{
    //ZoneDateTimeの生成
    LocalDateTime l1 = LocalDateTime.now();
    LocalDateTime l2 = LocalDateTime.of(2020,1,1,9,5,0,0);

    ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
    LocalDateTime l3 = z1.toLocalDateTime();
  }
}