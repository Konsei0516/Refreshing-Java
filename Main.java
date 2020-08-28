public class Main {
  public static void main(final String[] args) {
    String s1 = "Java and JavaScript";
    if(s1.contains("Java")){
      System.out.println("文字列s1はjavaを含んでいます");
    }
    if(s1.endsWith("Java")){
      System.out.println("文字列s1はjavaが末尾にあります");
    }
    System.out.println("文字列で最初にJavaが登場するのは" + s1.indexOf("Java"));
    System.out.println("文字列で最後にJavaが登場するのは" + s1.lastIndexOf("Java"));
  }
}