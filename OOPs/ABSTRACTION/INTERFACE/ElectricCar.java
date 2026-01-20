package Interface;

public class ElectricCar implements CarControl {
    @Override
    
    public void turnLeft(){
        System.out.println("turn left");
    }

     @Override
    public void turnRight(){
        System.out.println("turn Right");
    }

     @Override
    public void appllyBreak(){
        System.out.println("ELECTRIC BREAK");
    }
    
}
