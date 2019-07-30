class Basic{
  public static void main(String[] a){
    int len = a.length;
    int numbers[] = new int[len];
    for(int i=0;i<a.length;i++){
      numbers[i]= Integer.parseInt(a[i]);
      System.out.println(numbers[i]);
    }
  }
}
