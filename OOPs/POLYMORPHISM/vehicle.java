package polymorphism;

public class vehicle {
    public String brand;
    public int speed;
    public vehicle(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }
    public void start(){
        System.out.println("starting vehicle........");
    }
    
    // Getter for brand
    public String getBrand(){
        return brand;
    }
    
    // Setter for brand
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    // Getter for speed
    public int getSpeed(){
        return speed;
    }
    
    // Setter for speed
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void displayInfo(){
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}
