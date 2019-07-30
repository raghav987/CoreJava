import java.util.*;

class Triangle{
  public static void main(String a[]){
    Scanner sc = new Scanner(System.in);
    int j,k,l;
    j = sc.nextInt();
    k = sc.nextInt();
    l = sc.nextInt();
    int s = (j+k+l)/2;
    double t = s*(s-j)*(s-k)*(s-l);
    if(s<0.0){
      System.out.println("Triangle Does Not Form");
    }
    else if(l == k||k == j||j == l)
      System.out.println("Triangle Is Isosceles");
  }
}
