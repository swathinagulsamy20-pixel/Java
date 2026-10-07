import java.util.Scanner;
class Second{
  int a,b,c;
int sum(){
c=a+b;
return c;
}
}
class Second1{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
Second obj1 = new Second();
System.out.print("Enter first number: ");
obj1.a=obj.nextInt();
System.out.println(obj1.sum());
obj.close();
}
}