public class Record {
     record  Bike(String brand,int speed) {

        // record provide constructor ,getter, and  toString methods,does  provide setter.
        // you can not use setter in record class,because recorde class create  final variable when you assign once, you can not change.

        // public void setSpeed(String brand){
        //     this.brand=brand;

        // }
//         cannot assign a value to final variable brand
//             this.brand=brand;
//                 ^
// 1 error
// error: compilation failed
    }
    public static void main(String args[]){
        Bike bike=new Bike("BMW",200);
        System.out.println("brand:" + bike.brand());
        System.out.println("speed:" + bike.speed());
        System.out.println(bike.brand);
        

    }
    
}
