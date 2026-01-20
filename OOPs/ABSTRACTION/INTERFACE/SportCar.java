package Interface;

public class SportCar implements CarControl {
    @Override
    
    public void turnLeft(){
        System.out.println("Sport turn left");
    }

     @Override
    public void turnRight(){
        System.out.println("Sport turn Right");
    }

     @Override
    public void appllyBreak(){
        System.out.println("SPORT BREAK");
    }
    
}
