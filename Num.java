import java.util.*;
class Num{
  public static void main(String a[]){
    Scanner sc = new Scanner(System.in);
    int b,t=0;
    b = sc.nextInt();
    while(b!=0){
      b /= 10;
      t++;
    }
    System.out.printf(" %d ",t);
  }
}
