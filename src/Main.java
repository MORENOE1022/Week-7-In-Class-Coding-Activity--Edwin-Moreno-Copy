public class Main {
    public static <Plant> void main(String[] args) {
        // Call all the instances of the classes in here
        System.out.println("---LivingThing & Plant ---");
        Plant myPlant = new Plant();
        myPlant.grow();
        myPlant.photosynthesize();

        System.out.println();

        //Car and SuperCar classes
        System.out.println("---Car & SuperCar ---");
        SuperCar mySuperCar = new SuperCar();
        mySuperCar.drive(); //Inherited from Car
        mySuperCar.steroSystem(); //SuperCar subclass
    }
}
