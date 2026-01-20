package inheritence;

public class Car extends vehicle{
    private int door;

    // public Car(String brand, int speed) {
    //     super(brand, speed);
    //     //TODO Auto-generated constructor stub
    // }
    public Car(String brand,int speed,int door){
        super(brand,speed);
        this.door=door;
    }
     @Override
     public void displayInfo(){
      //  super.displayInfo();(it will call the parent method.)
        System.out.println("Brand:" + getBrand() +" Speed:"+ getSpeed() +" Door:"+ door);
     }


    
    
    
}
