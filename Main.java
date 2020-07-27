public class Main {
  public static void main(String[] args){
    Hero h1 = new Hero("ミナト");
    System.out.println(h1.name);
    h1.hp = 100;
    Hero h2 = new Hero();
    System.out.println(h2.name);
    h2.hp = 200;
    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 50;
    w.heal(h1);
    w.heal(h2);
    w.heal(h2);
    System.out.println(h1.hp);
    System.out.println(h1.name);
  }
}