class Box{
  static double hieght,depth,width;
  static double volume(){
    double vol = width*hieght*depth;
    return vol;
  }
  static void SetDimension(double w,double d,double h){
    width = w;
    hieght = h;
    depth = d;
  }/*
  void SetDimension(double width,double depth,double hieght){
    width = width;
    hieght = hieght;
    depth = depth;
  }*/
  /*void SetDimension(double width,double depth,double hieght){
    this.width = width;
    this.hieght = hieght;
    this.depth = depth;
  }*/
}
class BoxDemo{
  public static void main(String arg[]){
    //Box b2 = new Box();
    Box.SetDimension(10,5,20);
    System.out.println(Box.volume());
  }
}
