import java.util.Scanner;
class Aarray{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int a[] = new int[t];
    for(int i=0;i<t;i++){
      a[i] = sc.nextInt();
      System.out.println(a[i]);
    }
  }
}
