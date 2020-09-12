import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception{
    Map<String,Integer> prefs = new HashMap<String,Integer>();
    prefs.put("京都",255);
    prefs.put("東京",255);
    prefs.put("熊本",255);
    int tokyo = prefs.get("東京");
    System.out.println("東京との人口は" + tokyo);
    prefs.remove("京都");
    prefs.put("熊本",182);
    int kumamoto = prefs.get("熊本");
    System.out.println("熊本の人口は" + kumamoto);
  }
}