import java.util.Scanner;
class Math{
  static double i,j;
  static double sum;
  static void Addition()
  {
    sum = i+j;
  }
  static void Subtraction()
  {
    if(i>j)
      sum = i-j;
    else
      sum = j-i;
  }
  static void Multiplication()
  {
    sum = i*j;
  }
  static void Division()
  {
    sum = i/j;
  }
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    i = sc.nextInt();
    j = sc.nextInt();
    switch(a){
      case 1:{
        Addition();
        break;}
      case 2:{
        Subtraction();break;
      }
      case 3:{
        Multiplication();break;
      }
      case 4:{
      Division();break;
      }
    }
    System.out.println(sum);
  }
}
