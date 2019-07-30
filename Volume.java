import java.util.Scanner;
class Volume{
  int height,depth,width,radius;
  static double cube(double height){
    return height*height*height;
  }
  static double cuboid(double height,double depth,double width){
    return depth*width*height;
  }
  static double sphere(double radius){
    return 4*(3.14)*radius*radius*radius;
  }
  static double cylinder(double radius,double hieght){
    return 4*(3.14)*radius*radius*hieght;
  }
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    double t,r;
    double k;
    switch(sc.nextInt()){
      case 1:
        t = sc.nextInt();
        k = cube(t);
        System.out.println(k);
        break;
      case 2:
        t = sc.nextInt();
        r = sc.nextInt();
        double s = sc.nextInt();
        k = cuboid(t,r,s);
        System.out.println(k);
        break;
      case 3:
        t = sc.nextInt();
        k = sphere(t);
        System.out.println(k);
        break;
      case 4:
        t = sc.nextInt();
        r = sc.nextInt();
        k = cylinder(t,r);
        System.out.println(k);
        break;
    }
    //System.out.println(k);
  }
}
