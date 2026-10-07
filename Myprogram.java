import java.util.Scanner;
public class Myprogram{
    public static void main(String[] args){
    int a,b;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter Fist nuber:");
    a = obj.nextInt();
    System.out.println("Enter Second number:");
    b = obj.nextInt();

    if(a>b){
       System.out.println(a);
    }
   else{
    System.out.println(b);
   }
 }
}