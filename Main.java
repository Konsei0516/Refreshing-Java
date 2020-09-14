import java.util.*;

class Hero {
  public String name;
}

public class Main {
  public static void main(String[] args) throws Exception{
    Hero h = new Hero();
    h.name = "港";
    List<Hero>list = new ArrayList<Hero>();
    list.add(h);
    h.name = "菅原";
    System.out.println(list.get(0).name);
  }
}