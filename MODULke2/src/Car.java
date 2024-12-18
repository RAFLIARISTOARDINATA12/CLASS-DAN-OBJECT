public class Car {
    private int cadence;
    private int speed;
    private int gear;

    public void changeCadence(int cadence) {
        this.cadence = cadence;
    }

    public void speedup(int speed) {
        this.speed += speed;
    }

    public void changeGear(int gear) {
        this.gear = gear;
    }

    public void printInfo() {
        System.out.println("Cadence: " + cadence);
        System.out.println("Speed: " + speed);
        System.out.println("Gear: " + gear);
    }
}