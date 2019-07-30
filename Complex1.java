import java.util.Scanner;
public class Complex1{
  static double i1,j1,i2,j2,i,j;
  static void Addition(){
    i = i1 + i2;
    j = j1 + j2;
  }
  static void Subtraction(){
    i = i1 - i2;
    j = j1 - j2;
  }
}
class Main{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    Complex c = new Complex();
    c.i1 = sc.nextDouble();
    c.i2 = sc.nextDouble();
    c.j1 = sc.nextDouble();
    c.j2 = sc.nextDouble();
    switch(sc.nextInt()){
      case 1: c.Addition();
        break;
      case 2: c.Subtraction();
        break;
    }
    System.out.println(c.i+" + "+c.j+" i ");
  }
}
