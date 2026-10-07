import java.util.Scanner;
public class Program{
    public static void main(String[] args){
    int a,b,c;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter First Number:");
    a = obj.nextInt();
    System.out.println("Enter Second number:");
    b = obj.nextInt();
    System.out.println("Enter Third number:");
    c = obj.nextInt();
    if(a>b){
      if(a>c){
       System.out.println("c is greater");
   }
   else{
       System.out.println("a is greater");
   }
}
   if(b>c){
        System.out.println("b is greater");
     }
   else{
        System.out.println("c is greater");
    }
}
} 