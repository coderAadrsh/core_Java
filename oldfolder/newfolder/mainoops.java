public class mainoops {
    public static void main(String[] args){
        // instantiation
        Car car1=new Car("Toyota","black",180);
        // car1.speed=100;
        // car1.color="black";
        // car1.brand="toyota";
        // car1.drive();
        System.out.println(car1.getBrand());
        car1.setSpeed(300);
        System.out.println(car1.getSpeed());

        Car car2=new Car("bmw","white",200);
        // car2.brand="BMW";
        // car2.color="white";
        // car2.speed=120;
        // car2.drive();
        // car2.setSpeed(500);
        // System.err.println(car2.getSpeed());
        //  car2.drive();

        @Override

        public void drive(){
          System.out.print("how are  you"+car1.getBrand() +" is driving at "+car1.getSpeed());
          
        }

    }
    
}
