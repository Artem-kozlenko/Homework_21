public abstract class Car {

    String model;
    String color;
    int speed;

    void gas (int gas){
        System.out.println("Gas" + gas);
    }

    void brake (int brake){
        System.out.println("Brake" + brake);
    }

    abstract void description();
}
