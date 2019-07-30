import java.util.Scanner;
import java.lang.Math;
class Rev{
  public static void main(String arg[]){
    int t;
    Scanner sc = new Scanner(System.in);
    t = sc.nextInt();
    int l = t,k=0;
    while(l != 0)
      {
        k++;
        l/=10;
      }
    l = t;
    int m,p=0;
    while(k!=0)
      {
        m = l%10;
        l/=10;
        p = (int)(p + m*Math.pow(10,k-1));
        k--;
      }
    System.out.println(p);
  }
}
