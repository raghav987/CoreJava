import java.util.*;
import java.lang.*;

class Triangle{
  public static void main(String a[]){
    Scanner sc = new Scanner(System.in);
    int j,k,l;
    j = sc.nextInt();
    k = sc.nextInt();
    l = sc.nextInt();
    int s = (j+k+l)/2;
    double t = s*(s-j)*(s-k)*(s-l);
    if(s<0){
      System.out.println("Triangle Does Not Form");
      return ;
    }
    double A = Math.sqrt(t);
    System.out.println("Area = "+A);
  }
}
