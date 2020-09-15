import java.io.*;

public class Main {
  public static void main(String[] args){
    try{
      FileWriter fw = new FileWriter("data.txt");
      fw.write("hello");
      fw.close();
    } catch(IOException e) {
      System.out.println("エラーが発生しました、中断します");
    }
  }
}