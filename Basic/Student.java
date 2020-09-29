package Basic;

public class Student {
  String name;
  char gender;
  int score;

  void disp(){
    char tmpRank = getRank();
    System.out.println("名前:" + name);
    System.out.println("性別:" + gender);
    System.out.println("点数:" + score);
    System.out.println("成績:" + tmpRank);
  }

  void input(String tmpName,char tmpGender,int tmpScore){
    name = tmpName;
    gender = tmpGender;
    score = tmpScore;
  }

  char getRank(){
    char rank;

    if(score >= 80){
      rank = 'A';
    } else if(score >= 60){
      rank = 'B';
    } else if(score >= 40){
      rank = 'C';
    } else{
      rank = 'X';
    }
    return rank;
  }
}
