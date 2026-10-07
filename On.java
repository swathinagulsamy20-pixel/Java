class Outer{
void display(){
       System.out.println("I am the outer class");
   }
}
class Inner{
void display(){
       System.out.println("I am the inner class");
   }
}
class On{
  public static void main(String[] args){
        Outer obj = new Outer();
        Inner obj1 = new Inner();
        obj.display();
        obj1.display();
    }
}