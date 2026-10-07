class First{
 int a,b,c;
void sum(){
 c=a+b;
 System.out.println(c);
   }
}
 class First1{
  public static void main(String[] args){ 
    First obj1 = new First();
    First obj2 = new First();
   obj1.a = 10;
   obj1.b = 20;
   obj2.a = 3;
   obj2.b = 5;
   obj1.sum();
   obj2.sum();
}
}