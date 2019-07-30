
class Stack{
  int top = -1;
  int a[] = new int[10];
  void push(int ob){
    if(top == 9){
      System.out.println("Stack Overflow");
      return;
    }
    top++;
    a[top] = ob;
  }
  void pop(){
    if(top == -1){
      System.out.println("Stack UnderFlow");
      return ;
    }
    System.out.println(a[top]);
    top--;
  }
  void Display(){
    for(int i=0;i<4;i++)
      System.out.println(s.a[i]);
  }
  public static void main(String arg[]){
    Stack s = new Stack();
    s.push(10);
    s.push(30);
    s.push(45);
    s.push(1030);
    s.pop();
    s.pop();
    s.pop();
    s.pop();
    s.pop();
  }
}
