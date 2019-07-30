import java.util.*;
import java.lang.Math;
class Root{
  public static void main(String[] a){
    Scanner sc = new Scanner(System.in);
    double root1=0,root2=0;
    float d,b,c;
    d = sc.nextFloat();
    b = sc.nextFloat();
    c = sc.nextFloat();
    if(b*b-4*d*c>0){
      root1 = (-b + Math.sqrt(b*b-4*d*c))/(2*d);
      root2 = (-b - Math.sqrt(b*b-4*d*c))/(2*d);
    }
    else if((b*b - 4*d*c)== 0)
      root1 = root2 = -b/(2*d);
    else {
      System.out.printf("root is imaginary");
      return ;
    }
   System.out.printf("%f %f",root1,root2);
  }
}
