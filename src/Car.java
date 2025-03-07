public class car {
    String color ="blue";
    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }

    public void accelerate() {
        System.out.println("Car is accelerating...");
    }

    public void applyBrake() {
        System.out.println("Applying brakes...");
    }

    public void changeGear(int gear) {
        System.out.println("Changing gear to: " + gear);
    }

    public void turnOnHeadlights() {
        System.out.println("Headlights are ON...");
    }

    public void turnOffHeadlights() {
        System.out.println("Headlights are OFF...");
    }
    public void color() {
        System.out.println("color is" + color);
    }
    }

    public void main(String[] args) {
        System.out.println("I am a car!");

        car car = new car();
        car.color();
        car.start();
        car.changeGear(1);
        car.accelerate();
        car.changeGear(2);
        car.accelerate();
        car.changeGear(3);
        car.accelerate();
        car.applyBrake();
        car.turnOnHeadlights();
        car.stop();
        car.turnOffHeadlights();
    }

