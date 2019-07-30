import java.util.Scanner;
class Factorial{
  public static void main(String a[]){
    Scanner sc = new Scanner(System.in);
    long t,k=1;
    t = sc.nextLong();
    for(long i=1;i<=t;i++)
      k*=i;//k=k*i
    System.out.println("Factorial = "+k);
    System.out.printf("Factorial = %d",k);
  }
}
