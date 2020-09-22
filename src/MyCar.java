public class MyCar extends Car {

    @Override
    void description(){
        System.out.println("Model: " + this.model);
        System.out.println("Speed: " + this.speed);
        System.out.println("Color: " + this.color);
    }

    public static void main(String[] args) {
        MyCar Mitsubishi = new MyCar("Lancer", "Black", 160);
        Mitsubishi.gas(220);
        Mitsubishi.brake(100);
        Mitsubishi.description();
    }
    MyCar(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
}
