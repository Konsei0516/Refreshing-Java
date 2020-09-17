public class Person {
  int age;
  public void setAge(int age){
    if(age < 0){
      throw new IllegalArgumentException("年齢は正の数を指定すべき、、指定＝" + age);
    }
    this.age = age;
  }
}
