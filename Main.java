import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception{
    ArrayList<String>names = new ArrayList<String>();
    names.add("港");
    names.add("朝日");
    names.add("菅原");
    Iterator<String>it = names.iterator();
    while(it.hasNext()) {
      String e = it.next();
      System.out.println(e);
    }
  }
}