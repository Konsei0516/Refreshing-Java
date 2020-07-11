package calcapp.main;
import calcapp.logics.*;

public class Calc {
  public static void main(String[] args){
    int a = 10; int b = 2;
    int total = Calclogic.tasu(a,b);
    int delta = calcapp.logics.Calclogic.hiku(a,b);
    System.out.println("足すと" + total + "引くと" + delta);
  }
}