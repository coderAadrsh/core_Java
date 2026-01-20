package Interface;
public class interfaceDemo {
    public static void main(String[] args) {
        // ElectricCar e1=new ElectricCar();
        // e1.appllyBreak();
        // e1.turnLeft();
        // e1.turnRight();
        
        //how to implement these interface , team A in our robot.

        CarControl myCar=new ElectricCar();
        myCar.turnLeft();
        CarControl mycar2=new SportCar();
        mycar2.appllyBreak();
    }
    
}