import java.util.Scanner;
class Student{
  int rollno;
  int marks1,marks2,marks3;
  String sname;
  static String tname;
  void display(){
  int total = marks1 + marks2 + marks3;
  System.out.println(total);
  }
  void details(){
  System.out.printf("%d:%2d%2d%2d",rollno,marks1,marks2,marks3);
  }
  public static void main(String arg[]){
    Student s1;
    s1 = new Student();
    //s2 = new Student();
    Student.tname = "Yo Yo";
    Scanner sc =new Scanner(System.in);
    s1.rollno = 1;
    s1.marks1 = sc.nextInt();
    s1.marks2 = sc.nextInt();
    s1.marks3 = sc.nextInt();
    sc.nextLine();
    s1.sname = sc.nextLine();
    System.out.println(Student.tname);
    System.out.println(tname);
    System.out.println(s1.sname);
    System.out.println(s1.marks1);
    System.out.println(s1.marks2);
    System.out.println(s1.marks3);
    s1.display();
    s1.details();
    }
}
