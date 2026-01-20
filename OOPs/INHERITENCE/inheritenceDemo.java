 package inheritence;

public class inheritenceDemo {
    public static void main(String[] args) {
        Car c1=new Car("Toyota",120,5);
        c1.displayInfo();
        Bike b1=new Bike("hero",320,"sports");
        
        
        b1.setType("casual");
        b1.displayInfo();
        
        
        
    }
    
}
