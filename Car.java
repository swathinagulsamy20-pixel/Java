class Vehicle{
    public String brand = "Ford";
    protected void honk(){
        System.out.println("Tuut, tuut!");
    }
}
class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args){
        Car myCar = new Car();
        Vehicle obj = new Vehicle();
        myCar.honk();
        System.out.println(obj.brand);
    }
}