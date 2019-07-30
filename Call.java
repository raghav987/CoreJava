import java.util.Scanner;
class Prime{
  void prime(int n){
  for(int i=2;i <= Math.sqrt(n);i++){
    int t = n;
    if(t%i == 0){
      System.out.println("No");
      return;
      }
    }
    System.out.println("Yes");
  }
}

class Call{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    Prime p = new Prime();
    int t = sc.nextInt();
    p.prime(t);
  }
}
