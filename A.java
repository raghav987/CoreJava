class A{
  int i,j;
  void showij(){
    System.out.println(i);System.out.println(j);
  }
}
class B extends A{
  int k;
  void showk(){
    System.out.println(k);
  }
  void sum(){
    System.out.println(i+j+k);
  }
}
class Hello{
  public static void main(String arg[]){
    A a = new A();
    B b = new B();
    a.i=10;a.j=20;
    a.showij();
    b.i = 7;b.j=8;b.k=9;
    b.showij();b.showk();
    a.showij();
    b.sum();
  }
}
