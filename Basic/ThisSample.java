package Basic;

public class ThisSample {
  private String name;
  private int age;
  private String address;

  public ThisSample(String argName){
    this(argName, -1, null);
    System.out.println("引数を一つ");
  }

  public ThisSample(String argName,int argAge){
    this(argName, argAge, null);
    System.out.println("引数を2つ");
  }

  public ThisSample(String argName,int argAge, String argAddress){
    this(argName, argAge, argAddress);
    System.out.println("引数を3つ");
  }

  public void disp(){
    System.out.println("名前" + name);
    if(age > 0){
      System.out.println("年齢" + age);
    } 
    if(address != null){
      System.out.println("住所" + address);
    }
  }
}
