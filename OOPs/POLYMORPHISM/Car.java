package polymorphism;

public class Car extends vehicle{
    private int door;

    
    public Car(String brand,int speed,int door){
        super(brand,speed);
        this.door=door;
    }
    public void setDoor(int door){
        this.door=door;
    }
    public int getDoor(){
        return door;
    }
    @Override
     public void start(){
       // super.start();
        System.out.println("starting car........");
    }
    
     @Override
     public void displayInfo(){
      //  super.displayInfo();(it will call the parent method.)
        System.out.println("Brand:" + getBrand() +" Speed:"+ getSpeed() +" Door:"+ door);
     }


    
    
    
}
