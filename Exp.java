import java.util.*;
class Exp{
  public static void main(String a[]){
    Scanner sc = new Scanner(System.in);
    int b,c,t=1;
    b = sc.nextInt();
    c = sc.nextInt();
    for(int i=0;i<c;i++)
      t = t*b;
    System.out.printf("%d ^ %d = %d",b,c,t);
  }
}
