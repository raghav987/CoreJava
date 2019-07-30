import java.util.Scanner;
class Area{
  static final float PI = 3.1415f;
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    float Area,Circum;
    Area = PI*n*n;
    Circum = 2*PI*n;
    System.out.printf("Area = %.4f ,Circum = %.4f",Area,Circum);
  }
}
