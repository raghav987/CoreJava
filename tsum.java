import java.util.Scanner;
class Public{
  public static void main(String srg[]){
    Scanner sc = new Scanner(System.in);
    int t;
    t = sc.nextInt();
    int l=t,k,m=0;
    while(l != 0){
      k= l%10;
      l/=10;
      m += k;
    }
    System.out.println(m);
  }
}
