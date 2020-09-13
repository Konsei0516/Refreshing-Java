import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception{
    Map<String,Integer> prefs = new HashMap<String,Integer>();
    prefs.put("京都",255);
    prefs.put("東京",1261);
    prefs.put("熊本",182);
    for(String key : prefs.keySet()){
      int value = prefs.get(key);
      System.out.println(key + "の人口は" + value);
    }
  }
}