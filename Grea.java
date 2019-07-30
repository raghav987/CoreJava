import java.util.Scanner;
class Grea{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int a,b,c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    if(a>b){
      if(b>c)
        System.out.println(b);
      else
        if(a>c)
          System.out.println(c);
        else
          System.out.println(a);
    }
    else{
      if(c>a)
        System.out.println(c);
      else
        System.out.println(a);
    }
  }
}
