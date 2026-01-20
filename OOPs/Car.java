public class Car {
    
    private String brand;
   private String color;
   private int speed;

    public Car(String brand, String color, int speed){
        System.out.println("constructor called.....");
         this.brand=brand;
         this.color=color;
         this.speed=speed;

    
        

    }
    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color=color;
    }   


    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    

    public void drive(){
        System.out.println(brand +" is driving at "+speed);
    }
}