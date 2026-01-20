package inheritence;

public class Bike extends vehicle{
    private String type;
    public Bike(String brand,int speed,String type){
        super(brand, speed);
        setType(type);
    }
    public void getType(){
        System.err.println("type:"+this.type);
    }
     public void setType(String type){
        if (type==""){
            type="Default";
        }
     this.type=type;
    }
    @Override
    public void displayInfo(){
        //super.displayInfo();//called parent class display info, if you want.
        System.out.println("Brand:"+getBrand()+" Speed:"+getSpeed() +" Km/h"+ " Type:"+type);
    }

    
}
