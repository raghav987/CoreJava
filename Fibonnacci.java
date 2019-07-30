import java.util.Scanner;
class Fibonnacci{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),t = 0;
    System.out.printf("%d+",t);
    for(int i=1;i<=n;i++){
      System.out.printf("%d+",i);
      t += i;
    }
    System.out.printf("\n%d",t);
  }
}
