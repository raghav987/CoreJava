import java.lang.Math;
import java.util.Scanner;
public class Armstrong2{
  public int digit(int n){
    int t= 0;
    while(n!=0){
      n/=10;
      t++;
    }
    return t;
  }
  public void Armst(){
    for(int i = 1;i<10;i++)
      if(Math.pow(i,digit(i))==i)
        System.out.println(i);
  }
}
class Show{
  public static void main(String arg[]){
    Armstrong2 A = new Armstrong2();
    //Scanner sc = new Scanner(System.in);
    //int t = sc.nextInt();
    A.Armst();
  }
}
