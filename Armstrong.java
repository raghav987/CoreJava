import java.util.Scanner;
import java.lang.Math;

class Armstrong{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int t,l,k;
    int n = 0,m = 0;
    t=sc.nextInt();
    l = t;
    while(l != 0){
      l/=10;
      m++;
    }
    l = t;
    while(l!=0){
      k=l%10;
      l/=10;
      n += Math.pow(k,m);
    }
    if(t == n)
      System.out.println("Armstrong Number");
    else
      System.out.println("Not Armstrong Number");
  }
}
