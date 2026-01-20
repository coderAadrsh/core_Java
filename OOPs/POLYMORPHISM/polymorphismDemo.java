 package polymorphism;
 class calculator{
    public int add(int a, int b){
        System.out.println("int called");
    
        return a+b;
    }
        
    public double add(double a, double b){
        System.out.println("double called");
    
        return a+b;
    }
 }

public class polymorphismDemo {
    public static void main(String[] args) {
         Car c1=new Car("Toyota",120,5);
        // c1.displayInfo();
        // c1.start();
         Bike b1=new Bike("hero",320,"sports");
        
        
        // b1.setType("casual");
        // b1.start();
        // b1.displayInfo();


         vehicle v1=new vehicle("toyto", 200);
        // v1.start();

        //Method  overriding(Runtime polymorphism)

        vehicle v2=new Car("ford", 210,6);
        v2.start();
        ((Car)v2).setDoor(8);
        v2.displayInfo();
        

        vehicle v3=new Bike("hero",320,"sports");
        
        
       ( (Bike)v3).setType("casual");//((Bike)v3)=typecast hai
        v3.start();
        v3.displayInfo();
        ((Bike)v3).start("hello");


//      Method overloading.
        b1.start();

        calculator cal=new calculator();
        System.err.println("sum(int):"+cal.add(10,15));
        System.err.println("sum(decimal):"+cal.add(10,15.23));
        
        
        
        
    }
    
}
