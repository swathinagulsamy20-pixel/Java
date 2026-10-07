import java.util.Scanner;
public class Project{
    public static void main(String[] args){
    int a;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter Age:");
    a = obj.nextInt();
    if(a>18){
       System.out.println("Eligible to vote");
    }
   else{
    System.out.println("Not eligible to vote");
   }
 }
}