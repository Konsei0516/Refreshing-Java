import java.time.*;

public class Main {
  public static void main(String[] args) throws Exception{
    Instant i1 = Instant.now();
    Instant i2 = Instant.ofEpochMilli(1600705425827L);
    long 1 = i2.toEpochMilli();

    //ZoneDateTimeの生成
    ZonedDateTime z1 = ZonedDateTime.now();
    ZonedDateTime z2 = ZonedDateTime.of(2020,1,2,3,4,5,6, ZoneId.of("Asia/Tokyo"));

    Instant i3 = z2.toInstant();
    ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

    //ZoneDateTimeの利用
    System.out.println("東京" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
    System.out.println("ロンドン" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
    if(z2.isEqual(z3)){
      System.out.println("これらは同じ瞬間をさしています");
    }
  }
}