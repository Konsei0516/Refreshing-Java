import java.io.*;

public class Main {
  public static void main(String[] args){
    FileReader fr = new FileReader("data.txt");
    int input = fr.read();
    while (input != -1){
      System.out.println((char)input);
      input = fr.read();
    }
    fr.close();
  }
}