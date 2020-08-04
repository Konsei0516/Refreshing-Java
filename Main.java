public class Main {
  public static void main(String[] args){
    SuperHero sh = new SuperHero();
    Weapon w = new Weapon();
    sh.run();
    Hero h1 = new Hero("ミナト");
    System.out.println(h1.name);
    h1.hp = 100;
    Hero h2 = new Hero();
    System.out.println(h2.name);
    h2.hp = 200;
    System.out.println(h1.hp);
    System.out.println(h1.name);
  }
}