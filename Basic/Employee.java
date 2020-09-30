package Basic;

class Employee {
  int empNo;
  String empName;

  //コンストラクタ
  Employee(int no,String name){
    empNo = no;
    empName = name;
  }

  void dispMethod(){
    System.out.println("社員No" + empNo);
    System.out.println(empName);
  }
}
