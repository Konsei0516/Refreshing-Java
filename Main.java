public class Main {
  public static void main(String[] args){
    Hero h= new Hero();
    h.name = "ミナト";
    h.hp = 100;
    Hero h2 = new Hero();
    h2.name = "アサカ";
    h2.hp = 200;
    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 50;
    w.heal(h);
    w.heal(h2);
    w.heal(h2);
    System.out.println(h.hp);
  }
}