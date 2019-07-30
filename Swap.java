class Swap{
  int a,b;
  Swap(int x,int y){
    a = x;
    b = y;
  }
  static void swap(Swap ob1,Swap ob2){
    final int x,y;
    x = ob1.a;
    y = ob1.b;
    ob1.b = ob2.b;
    ob1.a = ob2.a;
    ob2.a = x;
    ob2.b = y;
  }
  public static void main(String arg[]){
    Swap ob1 = new Swap(5,7);
    Swap ob2 = new Swap(4,6);
    System.out.printf("%d %d\n",ob1.a,ob1.b);
    System.out.printf("%d %d\n",ob2.a,ob2.b);
    swap(ob1,ob2);
    System.out.printf("%d %d\n",ob1.a,ob1.b);
    System.out.printf("%d %d\n",ob2.a,ob2.b);
  }
}
