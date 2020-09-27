package Basic;

class UserClassCode{
  public static void main(String[] args) {
    Student student1 = new Student();

    student1.name = "鈴木";
    student1.gender = '男';
    student1.score = 45;

    System.out.println("名前:" + student1.name);
    System.out.println("性別:" + student1.gender);
    System.out.println("点数:" + student1.score);
  }
}
