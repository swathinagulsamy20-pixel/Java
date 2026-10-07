class Stack{
int[] stk = new int[10];
int top;
Stack(){    
 top=-1;
void push(){
 if(top>10){
   System.out.println("Stack is full");
  }
else{
  stk[++top] = 1;
  }
}
void pop(){
  if(top==-1){
  System.out.println("Underflow");
  }
else{
  return stk[top--];
    }
  }
}
class Max{ 
  public static void main(String[] args){
   Stack ob = new Stack();
  ob.push();
  ob.pop();
  }
}