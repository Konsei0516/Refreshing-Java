public class Hero{
  String name;
  int hp;
  static int money;
  
  public void attack(){
    System.out.println(this.name + "は攻撃した");
    System.out.println("敵は５ポイントのダメージを与えた");
  }

  public void sleep(){
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した");
  }
  public void sit(int sec) { 
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った!");
    System.out.println("HPが" + sec + "ポインt回復したい");
  }
  public final void slip() { 
    this.hp -= 5;
    System.out.println(this.name + "は転んだ");
    System.out.println("5のダメージ");
  }
  public void run() { 
    System.out.println(this.name + "は、逃げ出した" );
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.hp + "でした");
  }
  public Hero(String name){
    this.hp = 100;
    this.name = name;
  }
  public Hero(){
    this("ダミー");
    System.out.println("Heroのコンストラクタが動作");
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String toString(){
    return "名前:" + this.name + "/HP" + this.hp;
  }
}