public class HisCar implements CarInterface {
    public HisCar() {
    }

    public void gas(int gas) {

        System.out.println("Gas: " + gas);
    }

    public void brake(int brake) {

        System.out.println("Brake: " + brake);
    }

    public void description(String model, int speed, String color) {
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        HisCar Honda = new HisCar();
        Honda.gas(200);
        Honda.brake(90);
        Honda.description("Accord", 170, "White");
    }
}