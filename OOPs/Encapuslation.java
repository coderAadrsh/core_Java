public class Encapuslation{



     public static void main(String args[]){
       Car  car1=new Car("toyota", "blue", -200);// if you send the negative speed through the constructor in this case print the negative  speed  do not check the given validation in setspeed.

    //    car1.setSpeed(-120);//so we can pass a setspeed function in constructor check line no.23

       
        car1.drive();
          Car  car2=new Bus("oyo", "blue", -200);
          car2.setColor("");
          car2.drive();
          car1.drive();

    }
}
 class Car {
    
    private String brand;
    private String color;
    private int speed;

    public Car(String brand, String color, int speed){
        System.out.println("constructor called.....");
         this.brand=brand;
         this.color=color;
         //this.speed=speed;
         setSpeed(speed);
        
    }
     public String getBrand(){
        return brand;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        if(color==""){
            color="default(black or white)";
        }
        this.color=color;
    }
    
     public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        if(speed<0){
            speed=0;
        }
        this.speed=speed;
    }
    

    public void drive(){
        System.out.println("color:"+ getColor()+" brand:"+ getBrand() +" is driving at "+getSpeed());
    }
}
    
 class  Bus extends Car{
    
    

    public Bus (String brand, String color, int speed){
       // System.out.println("constructor called.....");
             super(brand ,color,speed);
        //  this.brand=brand;
        //  this.color=color;
         //this.speed=speed;
         //setSpeed(speed);
        

    }
    // public int getSpeed(){
    //     return speed;
    // }
    // public void setSpeed(int speed){
    //     if(speed<0){
    //         speed=0;
    //     }
    //     this.speed=speed;
    // }
    

    public void drive(){
        System.out.println("color:"+ getColor()+" brand:"+ getBrand() +" is driving at "+getSpeed());
    }
}
    




